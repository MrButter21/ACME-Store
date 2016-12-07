package models;

import java.util.Date;
import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class SalesModel {
    public int saleID;
    public String product;    
    public int quantity;
    public int saleCost;   
    public int totalProduct;
    
    public String customerName;
    public String date;
    public int totalSale;
    
    public Date day = new Date();
    
    public DefaultTableModel firstTable = new DefaultTableModel(new String [] {"ID Venta", "Producto", "Cantidad", "Precio de venta", "Subtotal"}, 0);
    public DefaultTableModel secondTable = new DefaultTableModel(new String [] {"Nombre", "Fecha", "Total"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
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
    
    public int getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(int saleCost) {
        this.saleCost = saleCost;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }
    
    public void initValues() {
        String sql = "select * from detalle_ventas";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        saleID = connection.getInteger("id_venta");
        product = connection.getString("producto");
        quantity = connection.getInteger("cantidad");
        saleCost = connection.getInteger("precio_venta");
        totalProduct = connection.getInteger("total_producto");
    }
    
    public void initSale() {
        String sql = "select * from ventas";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setSale() {
        customerName = connection.getString("nombre");
        date = connection.getString("fecha");
        totalSale = connection.getInteger("total_venta");
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
            saleCost = connection.getInteger("precio_venta");
        }
        return isFound;
    }
    
    public void addProduct(String product, int quantity, int saleCost) {
        initValues();
        saleID = connection.getInteger("id_venta");
        connection.toLast();
        saleID = 7;
        totalProduct = quantity * saleCost;
        String add = "insert into detalle_ventas(id_venta, producto, cantidad, precio_venta, total_producto)"
                   + "values ('"+saleID+"', '"+product+"', '"+quantity+"', '"+saleCost+"', '"+totalProduct+"');";
        connection.executeUpdate(add);
        initValues();
        firstTable.addRow(new Object [] {saleID, product, quantity, saleCost, totalProduct});
    }
    
    public void addPurchase(String customerName, int totalSale) { 
        date = day.toString();
        String add = "insert into ventas(nombre, fecha, total_venta)" + "values ('"+customerName+"', '"+date+"', '"+totalSale+"');";
        connection.executeUpdate(add);
        initSale();
        secondTable.addRow(new Object[] {customerName, date, totalSale});
    }
}
