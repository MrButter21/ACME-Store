package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class SuppliersModel {
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
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

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
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
        Object fields[] = new Object[]{1, "Cornelio", "5612304787", "Revolucion", 310, "Alamos", "Xalapa", "Veracruz", "Cornie", "5524791334", "cornie_es@live.com"};
        tableModel.addRow(fields);
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email});           
        }
    }
    
    public void addSupplier(String name, String rfc, String street, int number, String suburb, String city,
                            String state, String contact, String phone, String email) {
        String add = "insert into proveedores (nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)"
                   + "values ('"+name+"', '"+rfc+"', '"+street+"', '"+number+"', '"+suburb+"', '"+city+"', '"+state+"', '"+contact+"', '"+phone+"', '"+email+"');";
        connection.executeUpdate(add);
        initValues();
        populateTable();
    }
    
    public void editSupplier(int supplierID, String name, String rfc, String street, int number, String suburb,
                             String city, String state, String contact, String phone, String email) {
        String edit = "update proveedores set nombre ='"+name+"', rfc ='"+rfc+"', calle ='"+street+"', numero ='"+number+"', colonia ='"+suburb+"', ciudad ='"+city+"', estado ='"+state+"', nombre_contacto ='"+contact+"', telefono ='"+phone+"', email ='"+email+"'" + "where id_proveedor =" +supplierID;
        connection.executeUpdate(edit);
        initValues();
        populateTable();
    }
    
    public void removeSupplier(int supplierID) {
        String remove = "delete from proveedores where id_proveedor =" +supplierID;
        connection.executeUpdate(remove);
        initValues();
        populateTable();
    }
    
    public boolean findSupplier(String name) {
        boolean isFound = false;
        String find = "select * from proveedores where nombre = '"+name+"';";
        connection.executeQuery(find);
        connection.toNext();
        if(name.equals(connection.getString("nombre"))) {
            isFound = true;
        }
        return isFound;
    }
}
