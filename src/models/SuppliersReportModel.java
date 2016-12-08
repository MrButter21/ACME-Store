package models;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.table.DefaultTableModel;

import sogc.MyBearyConnection;

public class SuppliersReportModel {
    int supplierID;    
    int number;
    
    String name;
    String rfc;
    String street;
    String suburb;
    String city;
    String state;
    String contact;    
    String phone;
    String email;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID", "Nom", "RFC", "Cal", "#", "Col", "Cd", "Est", "Con", "Tel", "@"}, 0);
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

    public int getSupplierID() {
        return supplierID;
    }

    public void setCustomerID(int supplierID) {
        this.supplierID = supplierID;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void initValues() {
        String sql = "select * from proveedores";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        supplierID = connection.getInteger("id_proveedor");
        name = connection.getString("nombre");
        rfc = connection.getString("rfc");
        street = connection.getString("calle");
        number = connection.getInteger("numero");
        suburb = connection.getString("colonia");
        city = connection.getString("ciudad");
        state = connection.getString("estado");
        contact = connection.getString("nombre_contacto");
        phone = connection.getString("telefono");
        email = connection.getString("email");
    }
    
    public void findSupplier(String name) {
        String find = "select id_proveedor, nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email from proveedores where nombre like '"+name+"%' order by id_proveedor;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});           
        }
    }
    
    public void findCity(String city) {
        String find = "select id_proveedor, nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email from proveedores where ciudad like '"+city+"%' order by id_proveedor;";
        connection.executeQuery(find);
        connection.toNext();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});           
        }
    }
    
    public void allSuppliers() {
        initValues();
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        connection.toNext();
        connection.toFirst();
        setValues();
        tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});           
        }
    } 
}
