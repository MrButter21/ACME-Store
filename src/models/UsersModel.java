package models;

import javax.swing.table.DefaultTableModel;

import sogc.MySQLConnection;

public class UsersModel {    
    String name;
    String user;
    String password;
    String level;
    String status;
    
    public DefaultTableModel tableModel = new DefaultTableModel(new String [] {"Usuario", "Nivel", "Estado"}, 0);
    
    MySQLConnection connection = new MySQLConnection(3306, "localhost", "store", "root", "");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void initValues() {
        String sql = "select * from usuarios";
        connection.executeQuery(sql);
        connection.toNext();
    }
    
    public void setValues() {
        name = connection.getString("nombre");
        user = connection.getString("usuario");
        password = connection.getString("clave");
        level = connection.getString("nivel");
        status = connection.getString("estado");
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
    
    public void addUser(String name, String user, String password, String level, String status) {
        String add = "insert into usuarios (nombre, usuario, clave, nivel, estado)"
                   + "values ('"+name+"', '"+user+"', '"+password+"', '"+level+"', '"+status+"');";
        connection.executeUpdate(add);
        initValues();
    }
    
    public void editUser(String name, String user, String password, String level, String status) {
        String edit = "update usuarios set nombre ='"+name+"', usuario ='"+user+"', clave ='"+password+"', nivel ='"+level+"', estado ='"+status+"'" + "where nombre =" +name;
        connection.executeUpdate(edit);
        initValues();
    }
    
    public boolean findUser(String name) {
        boolean isFound = false;
        String find = "select * from usuarios where nombre like "+name+"%;";
        connection.executeQuery(find);
        connection.toNext();
        if(name.equals(connection.getString("nombre"))) {
            isFound = true;
        }
        return isFound;
    }
    
    public void populateTable() {
        Object fields[] = new Object[]{user, level, status};
        tableModel.addRow(fields);
        while(connection.toNext()) {
            setValues();
            tableModel.addRow(new Object []{user, level, status});           
        }
    }
}
