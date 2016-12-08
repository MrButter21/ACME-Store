package models;

import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class ProductsModel {
    int productID;    
    int stock;    
    String product;
    String description;
    int purchaseCost;
    int saleCost;
    int quantity;
       
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
 
    public void populateTable() {
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
    
    public void updateForPurchase(String product, int quantity, int stock) {        
        initValues();       
        String update = "update productos set existencias ='"+stock+"' where producto like '"+product+"';";
        connection.executeUpdate(update);
        initValues();
        populateTable();
    }
    
    public void updateForSale(String product, int quantity, int stock) {
        initValues();
        String update = "update productos set existencias ='"+stock+"' where producto like '"+product+"';";
        connection.executeUpdate(update);
        initValues();
        populateTable();
    }
    
    public void addProduct(String product, String description, int purchaseCost, int saleCost, int stock) {
        String add = "insert into productos (producto, descripcion, precio_compra, precio_venta, existencias)"
                   + "values ('"+product+"', '"+description+"', '"+purchaseCost+"', '"+saleCost+"', '"+stock+"');";
        connection.executeUpdate(add);
        initValues();
        populateTable();
    }
    
    public void editProduct(int productID, String product, String description, int purchaseCost, int saleCost, int stock) {
        String edit = "update productos set producto ='"+product+"', descripcion ='"+description+"', precio_compra ='"+purchaseCost+"', precio_venta ='"+saleCost+"', existencias ='"+stock+"'" + "where id_producto =" +productID;
        connection.executeUpdate(edit);
        initValues();
        populateTable();
    }
    
    public void removeProduct(int productID) {
        String remove = "delete from productos where id_producto =" +productID;
        connection.executeUpdate(remove);
        initValues();
        populateTable();
    }
    
    public boolean findProduct(String product) {
        boolean isFound = false;
        String find = "select * from productos where producto = '"+product+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(product.equals(connection.getString("producto"))) {
            isFound = true;
        }
        return isFound;
    }
}
