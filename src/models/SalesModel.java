package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class SalesModel {
    public int saleID;
    public int customerID;    
    public String customerName;
    public int productID;
    public String product;
    public float saleCost;
    public int quantity;
    public int vat;
    public float subtotal;    
    public float total;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID Producto", "Producto", "Precio de venta", "Cantidad", "Subtotal"}, 0);
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public float getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(float saleCost) {
        this.saleCost = saleCost;
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
        String sql = "select * from ventas";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        saleID = connection.getInteger("id_venta");
        customerID = connection.getInteger("id_cliente");
        customerName = connection.getString("nombre");
        productID = connection.getInteger("id_producto");
        product = connection.getString("producto");
        saleCost = connection.getFloat("precio_venta");
        quantity = connection.getInteger("cantidad");
        vat = connection.getInteger("iva");
        subtotal = connection.getFloat("subtotal");
        total = connection.getFloat("total");
    }
    
    public boolean findCustomer(int customerID) {
        boolean isFound = false;
        String find = "select * from clientes where id_cliente = '"+customerID+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(customerID == connection.getInteger("id_cliente")) {
            isFound = true;
            customerName = connection.getString("nombre");
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
            saleCost = connection.getFloat("precio_venta");
        }
        return isFound;
    }
    
    public void addProduct(int customerID, String name, int productID, String product, float saleCost, 
                           int quantity, int vat, float subtotal, float total) {
        vat = 15;
        subtotal = ((float)(saleCost * 0.15) + saleCost);
        total = subtotal * quantity;
        String add = "insert into ventas (id_cliente, nombre, id_producto, producto, precio_venta, cantidad, iva, subtotal, total)"
                   + "values ('"+customerID+"', '"+name+"', '"+productID+"', '"+product+"', '"+saleCost+"', '"+quantity+"', '"+vat+"', '"+subtotal+"', '"+total+"');";
        connection.executeUpdate(add);
        initValues();
         tableModel.addRow(new Object []{productID, product, saleCost, quantity, subtotal});
    }
}
