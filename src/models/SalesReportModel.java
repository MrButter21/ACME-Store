package models;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class SalesReportModel {
    int detailSaleID;
    int saleID;
    String date;
    String name;
    String rfc;
    String product;    
    int saleCost;
    int quantity;
    int totalProduct;
    
    public DefaultTableModel tableModel = new DefaultTableModel();
    public DefaultTableModel firstTable = new DefaultTableModel(new String [] {"Fecha", "Nombre", "RFC", "Producto", "$ Venta", "Cantidad", "Total"}, 0);
    public DefaultTableModel secondTable = new DefaultTableModel(new String [] {"Fecha", "Nombre", "RFC", "Producto", "$ Venta", "Cantidad", "Total"}, 0);
    public DefaultTableModel thirdTable = new DefaultTableModel(new String [] {"Nombre", "RFC", "Total"}, 0);
    public DefaultTableModel fourthTable = new DefaultTableModel(new String [] {"Producto", "$ Venta", "Cantidad", "Total"}, 0);
    public DefaultTableModel fifthTable = new DefaultTableModel(new String [] {"IDDV", "IDV", "Fecha", "Nombre", "RFC", "Producto", "$ Venta", "Cantidad", "Total"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

    public int getDetailSaleID() {
        return detailSaleID;
    }

    public void setDetailSaleID(int detailSaleID) {
        this.detailSaleID = detailSaleID;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
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

    public int getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(int saleCost) {
        this.saleCost = saleCost;
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
        String sql = "select * from ventas_generales";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        detailSaleID = connection.getInteger("id_detalleVenta");
        saleID = connection.getInteger("id_venta");
        date = connection.getString("fecha");
        name = connection.getString("nombre");
        rfc = connection.getString("rfc");       
        product = connection.getString("producto");
        saleCost = connection.getInteger("precio_venta");
        quantity = connection.getInteger("cantidad");        
        totalProduct = connection.getInteger("total_producto");
    }
    
    public void findCustomer(String name) {
        String find = "select fecha, nombre, rfc, producto, precio_venta, cantidad, total_producto from ventas_generales where nombre like '"+name+"%' order by id_detalleVenta;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < firstTable.getRowCount(); i++) {
            firstTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        firstTable.addRow(new Object []{date, name, rfc, product, saleCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            firstTable.addRow(new Object []{date, name, rfc, product, saleCost, quantity, totalProduct});
        }
    }
    
    public void findProduct(String product) {
        String find = "select fecha, nombre, rfc, producto, precio_venta, cantidad, total_producto from ventas_generales where producto like '"+product+"%' order by id_detalleVenta;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < secondTable.getRowCount(); i++) {
            secondTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        secondTable.addRow(new Object []{date, name, rfc, product, saleCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            secondTable.addRow(new Object []{date, name, rfc, product, saleCost, quantity, totalProduct});
        }
    }
    
    public void customerSales() {
        String customer = "select nombre, rfc, sum(total_producto) from ventas_generales where id_venta = id_venta group by nombre;";
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
    
    public void productSales() {
        String sale = "select producto, precio_venta, sum(cantidad), sum(total_producto) from ventas_generales where producto = producto group by producto;";
        connection.executeQuery(sale);
        connection.toNext();
        for(int i = 0; i < fourthTable.getRowCount(); i++) {
            fourthTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        fourthTable.addRow(new Object []{product, saleCost, quantity, totalProduct});
        while(connection.toNext()) {
            setValues();
            fourthTable.addRow(new Object []{product, saleCost, quantity, totalProduct});
        }
    }
    
    public void allSales() {
        initValues();
        for(int i = 0; i < fifthTable.getRowCount(); i++) {
            fifthTable.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        fifthTable.addRow(new Object []{detailSaleID, saleID, date, name, rfc, product, saleCost, quantity, totalProduct});
        while(connection.toNext()){
            setValues();
            fifthTable.addRow(new Object []{detailSaleID, saleID, date, name, rfc, product, saleCost, quantity, totalProduct});
        }
    }
}
