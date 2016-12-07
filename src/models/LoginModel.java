package models;

import sogc.MyBearyConnection;

public class LoginModel {    
    public String name;
    public String user;
    public String password;
    public String level;
    public String status;
    
    MyBearyConnection connection = new MyBearyConnection(3306, "localhost", "store", "root", "");

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
    
    public boolean login(String user, String password) {
        boolean isAble = false;
        String login = "select * from usuarios where usuario = '"+user+"' and clave = '"+password+"';";
        connection.executeQuery(login);
        connection.toNext();
        status = connection.getString("estado");
        if (user.equals(connection.getString("usuario")) && password.equals(connection.getString("clave")) && status.equals("Activo")) {
            isAble = true;
            level = connection.getString("nivel");
        }
        return isAble;
    }
}
