package models;

import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class ProductsReportModel {
    int productID;    
    int stock;
    
    String product;
    String description;
    int purchaseCost;
    int saleCost;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID", "Producto", "Descripcion", "$ Compra", "$ Venta", "Stock"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(int saleCost) {
        this.saleCost = saleCost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void initValues() {
        String sql = "select * from productos";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        productID = connection.getInteger("id_producto");
        product = connection.getString("producto");
        description = connection.getString("descripcion");
        purchaseCost = connection.getInteger("precio_compra");
        saleCost = connection.getInteger("precio_venta");
        stock = connection.getInteger("existencias");
    }
    
    public void findProduct(String product) {
        String find = "select id_producto, producto, descripcion, precio_compra, precio_venta, existencias from productos where producto like '"+product+"%' order by id_producto;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});           
        }
    }
    
    public void findDesc(String description) {
        String find = "select id_producto, producto, descripcion, precio_compra, precio_venta, existencias from productos where descripcion like '"+description+"%' order by id_producto;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});           
        }
    }
    
    public void allProducts() {
        initValues();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});           
        }
    } 
}
