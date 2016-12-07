package models;

import java.util.Date;
import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class PurchasesModel {
    public int purchaseID;
    public String product;    
    public int quantity;
    public int purchaseCost;   
    public int totalProduct;
    
    public String supplierName;
    public String date;
    public int totalPurchase;
    
    public Date day = new Date();
    
    public DefaultTableModel firstTable = new DefaultTableModel(new String [] {"ID Compra", "Producto", "Cantidad", "Precio de compra", "Subtotal"}, 0);
    public DefaultTableModel secondTable = new DefaultTableModel(new String [] {"Nombre", "Fecha", "Total"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }
    
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(int totalPurchase) {
        this.totalPurchase = totalPurchase;
    }
    
    public void initValues() {
        String sql = "select * from detalle_compras";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        purchaseID = connection.getInteger("id_compra");
        product = connection.getString("producto");
        quantity = connection.getInteger("cantidad");
        purchaseCost = connection.getInteger("precio_compra");
        totalProduct = connection.getInteger("total_producto");
    }
    
    public void initPurchase() {
        String sql = "select * from compras";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setPurchase() {
        supplierName = connection.getString("nombre");
        date = connection.getString("fecha");
        totalPurchase = connection.getInteger("total_compra");
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
            purchaseCost = connection.getInteger("precio_compra");
        }
        return isFound;
    }
    
    public void addProduct(String product, int quantity, int purchaseCost) {
        initValues();
        purchaseID = connection.getInteger("id_compra");
        connection.toLast();
        purchaseID = 7;
        totalProduct = quantity * purchaseCost;
        String add = "insert into detalle_compras(id_compra, producto, cantidad, precio_compra, total_producto)"
                   + "values ('"+purchaseID+"', '"+product+"', '"+quantity+"', '"+purchaseCost+"', '"+totalProduct+"');";
        connection.executeUpdate(add);
        initValues();
        firstTable.addRow(new Object [] {purchaseID, product, quantity, purchaseCost, totalProduct});
    }
    
    public void addPurchase(String supplierName, int totalPurchase) { 
        date = day.toString();
        String add = "insert into compras(nombre, fecha, total_compra)" + "values ('"+supplierName+"', '"+date+"', '"+totalPurchase+"');";
        connection.executeUpdate(add);
        initPurchase();
        secondTable.addRow(new Object[] {supplierName, date, totalPurchase});
    }
}
