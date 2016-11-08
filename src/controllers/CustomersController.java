package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.CustomersModel;
import views.CustomersView;

public class CustomersController implements ActionListener {
    CustomersModel customersModel;
    CustomersView customersView;

    public CustomersController(CustomersModel customersModel, CustomersView customersView) {
        this.customersModel = customersModel;
        this.customersView = customersView;
        
        this.customersView.jb_first.addActionListener(this);
        this.customersView.jb_previous.addActionListener(this);
        this.customersView.jb_next.addActionListener(this);
        this.customersView.jb_last.addActionListener(this);
        
        this.customersView.jb_add.addActionListener(this);
        this.customersView.jb_edit.addActionListener(this);
        this.customersView.jb_remove.addActionListener(this);
        this.customersView.jb_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == customersView.jb_first)
            firstCustomer();
        else if(a.getSource() == customersView.jb_previous)
            previousCustomer();
        else if(a.getSource() == customersView.jb_next)
            nextCustomer();
        else if(a.getSource() == customersView.jb_last)
            lastCustomer();
        else if(a.getSource() == customersView.jb_add)
            addCustomer();
        else if(a.getSource() == customersView.jb_edit)
            editCustomer();
        else if(a.getSource() == customersView.jb_remove)
            removeCustomer();
        else if(a.getSource() == customersView.jb_find)
            findCustomer();
    }
    
    public void initView() {
        customersModel.initValues();
        customersModel.setValues();
    }
    
    public void showValues() {
        customersView.jtf_id.setText("" + customersModel.getCustomerID());
        customersView.jtf_name.setText(customersModel.getName());
        customersView.jtf_surname1.setText(customersModel.getSurname1());
        customersView.jtf_surname2.setText(customersModel.getSurname2());
        customersView.jtf_phone.setText(customersModel.getPhone());
        customersView.jtf_email.setText(customersModel.getEmail());
        customersView.jtf_rfc.setText(customersModel.getRfc());
        customersView.jtf_street.setText(customersModel.getStreet());
        customersView.jtf_number.setText("" + customersModel.getNumber());
        customersView.jtf_suburb.setText(customersModel.getSuburb());
        customersView.jtf_city.setText(customersModel.getCity());
        customersView.jtf_state.setText(customersModel.getState());
    }
    
    public void firstCustomer() {
        customersModel.moveToFirst();
        showValues();
    }
    
    public void previousCustomer() {
        customersModel.moveToPrevious();
        showValues();
    }
    
    public void nextCustomer() {
        customersModel.moveToNext();
        showValues();
    }
    
    public void lastCustomer() {
        customersModel.moveToLast();
        showValues();
    }
    
    public void addCustomer() {             
        String name = customersView.jtf_name.getText();
        String surname1 = customersView.jtf_surname1.getText();
        String surname2 = customersView.jtf_surname2.getText();
        String phone = customersView.jtf_phone.getText();
        String email = customersView.jtf_email.getText();
        String rfc = customersView.jtf_rfc.getText();
        String street = customersView.jtf_street.getText();
        int number = Integer.parseInt(customersView.jtf_number.getText());
        String suburb = customersView.jtf_suburb.getText();
        String city = customersView.jtf_city.getText();
        String state = customersView.jtf_state.getText();
        customersModel.addCustomer(name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state);
        customersModel.setValues();
        showValues();
    }
    
    public void editCustomer() {
        int customerID = Integer.parseInt(customersView.jtf_id.getText());
        String name = customersView.jtf_name.getText();
        String surname1 = customersView.jtf_surname1.getText();
        String surname2 = customersView.jtf_surname2.getText();
        String phone = customersView.jtf_phone.getText();
        String email = customersView.jtf_email.getText();
        String rfc = customersView.jtf_rfc.getText();
        String street = customersView.jtf_street.getText();
        int number = Integer.parseInt(customersView.jtf_number.getText());
        String suburb = customersView.jtf_suburb.getText();
        String city = customersView.jtf_city.getText();
        String state = customersView.jtf_state.getText();
        customersModel.editCustomer(customerID, name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state);
        customersModel.setValues();
        showValues();
    }
    
    public void removeCustomer() {
        int customerID = Integer.parseInt(customersView.jtf_id.getText());
        customersModel.removeCustomer(customerID);
        customersModel.setValues();
        showValues();
    }
    
    public void findCustomer() {
        String name = JOptionPane.showInputDialog(null, "Introduce el nombre que deseas buscar:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(customersModel.findCustomer(name))
            JOptionPane.showMessageDialog(null, name + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " no existe en la base de datos. Intente de nuevo", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
    
    private void showRecords() {
        customersView.jt_customersTable.setModel(customersModel.tableModel);
        customersModel.populateTable();
    }
}
