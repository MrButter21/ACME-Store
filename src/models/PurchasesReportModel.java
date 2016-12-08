package models;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class PurchasesReportModel {
    int detailPurchaseID;
    int purchaseID;
    String date;
    String name;
    String rfc;
    String product;    
    int purchaseCost;
    int quantity;
    int totalProduct;
    
    public DefaultTableModel tableModel = new DefaultTableModel();
    public DefaultTableModel firstTable = new DefaultTableModel(new String [] {"Fecha", "Nombre", "RFC", "Producto", "$ Compra", "Cantidad", "Total"}, 0);
    public DefaultTableModel secondTable = new DefaultTableModel(new String [] {"Fecha", "Nombre", "RFC", "Producto", "$ Compra", "Cantidad", "Total"}, 0);
    public DefaultTableModel thirdTable = new DefaultTableModel(new String [] {"Nombre", "RFC", "Total"}, 0);
    public DefaultTableModel fourthTable = new DefaultTableModel(new String [] {"Producto", "$ Compra", "Cantidad", "Total"}, 0);
    public DefaultTableModel fifthTable = new DefaultTableModel(new String [] {"IDDC", "IDC", "Fecha", "Nombre", "RFC", "Producto", "$ Compra", "Cantidad", "Total"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

    public int getDetailPurchaseID() {
        return detailPurchaseID;
    }

    public void setDetailPurchaseID(int detailPurchaseID) {
        this.detailPurchaseID = detailPurchaseID;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }
    
    public void initValues() {
        String sql = "select * from compras_generales";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        detailPurchaseID = connection.getInteger("id_detalleCompra");
        purchaseID = connection.getInteger("id_compra");
        date = connection.getString("fecha");
        name = connection.getString("nombre");
        rfc = connection.getString("rfc");       
        product = connection.getString("producto");
        purchaseCost = connection.getInteger("precio_compra");
        quantity = connection.getInteger("cantidad");        
        totalProduct = connection.getInteger("total_producto");
    }
    
    public void findSupplier(String name) {
        String find = "select fecha, nombre, rfc, producto, precio_compra, cantidad, total_producto from compras_generales where nombre like '"+name+"%' order by id_detalleCompra;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < firstTable.getRowCount(); i++) {
            firstTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        firstTable.addRow(new Object []{date, name, rfc, product, purchaseCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            firstTable.addRow(new Object []{date, name, rfc, product, purchaseCost, quantity, totalProduct});
        }
    }
    
    public void findProduct(String product) {
        String find = "select fecha, nombre, rfc, producto, precio_compra, cantidad, total_producto from compras_generales where producto like '"+product+"%' order by id_detalleCompra;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < secondTable.getRowCount(); i++) {
            secondTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        secondTable.addRow(new Object []{date, name, rfc, product, purchaseCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            secondTable.addRow(new Object []{date, name, rfc, product, purchaseCost, quantity, totalProduct});
        }
    }
    
    public void supplierPurchases() {
        String customer = "select nombre, rfc, sum(total_producto) from compras_generales where id_compra = id_compra group by nombre;";
        connection.executeQuery(customer);
        connection.toNext();
        for(int i = 0; i < thirdTable.getRowCount(); i++) {
            thirdTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        thirdTable.addRow(new Object []{name, rfc, totalProduct});
        while(connection.toNext()) {
            setValues();
            thirdTable.addRow(new Object []{name, rfc, totalProduct});
        }
    }
    
    public void productPurchases() {
        String sale = "select producto, precio_compra, sum(cantidad), sum(total_producto) from compras_generales where producto = producto group by producto;";
        connection.executeQuery(sale);
        connection.toNext();
        for(int i = 0; i < fourthTable.getRowCount(); i++) {
            fourthTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        fourthTable.addRow(new Object []{product, purchaseCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            fourthTable.addRow(new Object []{product, purchaseCost, quantity, totalProduct});
        }
    }
    
    public void allPurchases() {
        initValues();
        for(int i = 0; i < fifthTable.getRowCount(); i++) {
            fifthTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        fifthTable.addRow(new Object []{detailPurchaseID, purchaseID, date, name, rfc, product, purchaseCost, quantity, totalProduct});
        while(connection.toNext()){
            setValues();
            fifthTable.addRow(new Object []{detailPurchaseID, purchaseID, date, name, rfc, product, purchaseCost, quantity, totalProduct});
        }
    }
}
