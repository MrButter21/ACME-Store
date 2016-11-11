package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class PurchasesModel {
    public int purchaseID;
    public int supplierID;    
    public String supplierName;
    public int productID;
    public String product;
    public float purchaseCost;
    public int quantity;
    public int vat;
    public float subtotal;    
    public float total;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID Producto", "Producto", "Precio de compra", "Cantidad", "Subtotal"}, 0);
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }
    
    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(float purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVAT() {
        return vat;
    }

    public void setVAT(int vat) {
        this.vat = vat;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void initValues() {
        String sql = "select * from compras";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        purchaseID = connection.getInteger("id_compra");
        supplierID = connection.getInteger("id_proveedor");
        supplierName = connection.getString("nombre");
        productID = connection.getInteger("id_producto");
        product = connection.getString("producto");
        purchaseCost = connection.getFloat("precio_compra");
        quantity = connection.getInteger("cantidad");
        vat = connection.getInteger("iva");
        subtotal = connection.getFloat("subtotal");
        total = connection.getFloat("total");
    }
    
    public void populateTable() {
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        Object fields[] = new Object[]{3, "Galletas", 12.50, 1, 14.75};
        tableModel.addRow(fields);
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{productID, product, purchaseCost, quantity, subtotal});           
        }
    }
    
    public boolean findSupplier(int supplierID) {
        boolean isFound = false;
        String find = "select * from proveedores where id_proveedor = '"+supplierID+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(supplierID == connection.getInteger("id_proveedor")) {
            isFound = true;
            supplierName = connection.getString("nombre");
        }
        return isFound;
    }
    
    public boolean findProduct(int productID) {
        boolean isFound = false;
        String find = "select * from productos where id_producto = '"+productID+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(productID == connection.getInteger("id_producto")) {
            isFound = true;
            product = connection.getString("producto");
            purchaseCost = connection.getFloat("precio_compra");
        }
        return isFound;
    }
    
    public void addProduct(int supplierID, String name, int productID, String product, float purchaseCost, 
                           int quantity, int vat, float subtotal, float total) {
        vat = 15;
        subtotal = (float)(purchaseCost * 0.15);
        total = subtotal * quantity;
        String add = "insert into compras (id_proveedor, nombre, id_producto, producto, precio_compra, cantidad, iva, subtotal, total)"
                   + "values ('"+supplierID+"', '"+name+"', '"+productID+"', '"+product+"', '"+purchaseCost+"', '"+quantity+"', '"+vat+"', '"+subtotal+"', '"+total+"');";
        connection.executeUpdate(add);
        initValues();
        populateTable();
    }
}
