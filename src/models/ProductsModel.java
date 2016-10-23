package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class ProductsModel {
    int productID;    
    int stock;
    
    String product;
    String description;
    float purchaseCost;
    float saleCost;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID", "Producto", "Descripcion", "$ Compra", "$ Venta", "Stock"}, 0);
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

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

    public float getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(float purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public float getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(float saleCost) {
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
        purchaseCost = connection.getFloat("precio_compra");
        saleCost = connection.getFloat("precio_venta");
        stock = connection.getInteger("existencias");
    }
    
    public void moveToFirst() {
        connection.toFirst();
        setValues();
    }
    
    public void moveToPrevious() {
        connection.toPrevious();
        setValues();
    }
    
    public void moveToNext() {
        connection.toNext();
        setValues();
    }
    
    public void moveToLast() {
        connection.toLast();
        setValues();
    }
    
    public void addProduct(String product, String description, float purchaseCost, float saleCost, int stock) {
        String add = "insert into productos (producto, descripcion, precio_compra, precio_venta, existencias)"
                   + "values ('"+product+"', '"+description+"', '"+purchaseCost+"', '"+saleCost+"', '"+stock+"');";
        connection.executeUpdate(add);
        initValues();
    }
    
    public void editProduct(int productID, String product, String description, float purchaseCost, float saleCost, int stock) {
        String edit = "update productos set producto ='"+product+"', descripcion ='"+description+"', precio_compra ='"+purchaseCost+"', precio_venta ='"+saleCost+"', existencias ='"+stock+"'" + "where id_producto =" +productID;
        connection.executeUpdate(edit);
        initValues();
    }
    
    public void removeProduct(int productID) {
        String remove = "delete from productos where id_producto=" +productID;
        connection.executeUpdate(remove);
        initValues();
    }
    
    public void findProduct(String product) {
        String find = "select * from productos where producto like "+product+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }
    
    public void populateTable() {
        Object fields[] = new Object[]{productID, product, description, purchaseCost, saleCost, stock};
        tableModel.addRow(fields);
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{productID, product, description, purchaseCost, saleCost, stock});           
        }
    }
}
