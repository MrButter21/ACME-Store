package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.UsersModel;
import views.UsersView;

public class UsersController implements ActionListener {
    UsersModel usersModel;
    UsersView usersView;

    public UsersController(UsersModel usersModel, UsersView usersView) {
        this.usersModel = usersModel;
        this.usersView = usersView;
        
        this.usersView.jb_first.addActionListener(this);
        this.usersView.jb_previous.addActionListener(this);
        this.usersView.jb_next.addActionListener(this);
        this.usersView.jb_last.addActionListener(this);
        
        this.usersView.jb_add.addActionListener(this);
        this.usersView.jb_edit.addActionListener(this);
        this.usersView.jb_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == usersView.jb_first)
            firstUser();
        else if(a.getSource() == usersView.jb_previous)
            previousUser();
        else if(a.getSource() == usersView.jb_next)
            nextUser();
        else if(a.getSource() == usersView.jb_last)
            lastUser();
        else if(a.getSource() == usersView.jb_add)
            addUser();
        else if(a.getSource() == usersView.jb_edit)
            editUser();
        else if(a.getSource() == usersView.jb_find)
            findUser();
    }
    
    public void initView() {
        usersModel.initValues();
        usersModel.setValues();
    }
    
    public void showValues() {
        usersView.jtf_name.setText(usersModel.getName());
        usersView.jtf_user.setText(usersModel.getUser());
        usersView.jpf_password.setText(usersModel.getPassword());
        usersView.jtf_level.setText(usersModel.getLevel());
        usersView.jtf_status.setText(usersModel.getStatus());
    }
    
    public void firstUser() {
        usersModel.moveToFirst();
        showValues();
    }
    
    public void previousUser() {
        usersModel.moveToPrevious();
        showValues();
    }
    
    public void nextUser() {
        usersModel.moveToNext();
        showValues();
    }
    
    public void lastUser() {
        usersModel.moveToLast();
        showValues();
    }
    
    public void addUser() {
        String name = usersView.jtf_name.getText();
        String user = usersView.jtf_user.getText();
        String password = usersView.jpf_password.getText();
        String level = usersView.jtf_level.getText();
        String status = usersView.jtf_status.getText();
        usersModel.addUser(name, user, password, level, status);
        usersModel.setValues();
        showValues();
    }
    
    public void editUser() {
        String name = usersView.jtf_name.getText();
        String user = usersView.jtf_user.getText();
        String password = usersView.jpf_password.getText();
        String level = usersView.jtf_level.getText();
        String status = usersView.jtf_status.getText();
        usersModel.editUser(name, user, password, level, status);
        usersModel.setValues();
        showValues();
    }
    
    public void findUser() {
        String name = JOptionPane.showInputDialog(null, "Introduce el nombre que deseas buscar:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(usersModel.findUser(name))
            JOptionPane.showMessageDialog(null, name + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " no existe en la base de datos. Intente de nuevo", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
    
    private void showRecords() {
        usersView.jt_usersTable.setModel(usersModel.tableModel);
        usersModel.populateTable();
    }
}
