package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class CustomersModel {
    int customerID;    
    int number;
    
    String name;
    String surname1;
    String surname2;
    String phone;
    String email;
    String rfc;
    String street;    
    String suburb;
    String city;
    String state;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"ID", "Nom", "AP", "AM", "Tel", "@", "RFC", "Cal", "#", "Col", "Cd", "Est"}, 0);
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
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
    
    public void initValues() {
        String sql = "select * from clientes";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        customerID = connection.getInteger("id_cliente");
        name = connection.getString("nombre");
        surname1 = connection.getString("ap_paterno");
        surname2 = connection.getString("ap_materno");
        phone = connection.getString("telefono");
        email = connection.getString("email");
        rfc = connection.getString("rfc");
        street = connection.getString("calle");
        number = connection.getInteger("numero");
        suburb = connection.getString("colonia");
        city = connection.getString("ciudad");
        state = connection.getString("estado");
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
    
    public void addCustomer(String name, String surname1, String surname2, String phone, String email, String rfc,
                            String street, int number, String suburb, String city, String state) {
        String add = "insert into clientes (nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)"
                   + "values ('"+name+"', '"+surname1+"', '"+surname2+"', '"+phone+"', '"+email+"', '"+rfc+"', '"+street+"', '"+number+"', '"+suburb+"', '"+city+"', '"+state+"');";
        connection.executeUpdate(add);
        initValues();
    }
    
    public void editCustomer(int customerID, String name, String surname1, String surname2, String phone, String email,
                             String rfc, String street, int number, String suburb, String city, String state) {
        String edit = "update clientes set nombre ='"+name+"', ap_paterno ='"+surname1+"', ap_materno ='"+surname2+"', telefono ='"+phone+"', email ='"+email+"', rfc ='"+rfc+"', calle ='"+street+"', numero ='"+number+"', colonia ='"+suburb+"', ciudad ='"+city+"', estado ='"+state+"'" + "where id_cliente =" +customerID;
        connection.executeUpdate(edit);
        initValues();
    }
    
    public void removeCustomer(int customerID) {
        String remove = "delete from clientes where id_cliente=" +customerID;
        connection.executeUpdate(remove);
        initValues();
    }
    
    public void findCustomer(String name) {
        String find = "select * from clientes where nombre like "+name+"%;";
        connection.executeQuery(find);
        connection.toNext();
    }
    
    public void populateTable() {
        Object fields[] = new Object[]{customerID, name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state};
        tableModel.addRow(fields);
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{customerID, name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state});           
        }
    }
}
