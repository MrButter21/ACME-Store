package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.SuppliersModel;
import views.SuppliersView;

public class SuppliersController implements ActionListener {
    SuppliersModel suppliersModel;
    SuppliersView suppliersView;

    public SuppliersController(SuppliersModel suppliersModel, SuppliersView suppliersView) {
        this.suppliersModel = suppliersModel;
        this.suppliersView = suppliersView;
        
        this.suppliersView.jb_first.addActionListener(this);
        this.suppliersView.jb_previous.addActionListener(this);
        this.suppliersView.jb_next.addActionListener(this);
        this.suppliersView.jb_last.addActionListener(this);
        
        this.suppliersView.jb_add.addActionListener(this);
        this.suppliersView.jb_edit.addActionListener(this);
        this.suppliersView.jb_remove.addActionListener(this);
        this.suppliersView.jb_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == suppliersView.jb_first)
            firstSupplier();
        else if(a.getSource() == suppliersView.jb_previous)
            previousSupplier();
        else if(a.getSource() == suppliersView.jb_next)
            nextSupplier();
        else if(a.getSource() == suppliersView.jb_last)
            lastSupplier();
        else if(a.getSource() == suppliersView.jb_add)
            addSupplier();
        else if(a.getSource() == suppliersView.jb_edit)
            editSupplier();
        else if(a.getSource() == suppliersView.jb_remove)
            removeSupplier();
        else if(a.getSource() == suppliersView.jb_find)
            findSupplier();
    }
    
    public void initView() {
        suppliersModel.initValues();
        suppliersModel.setValues();
    }
    
    public void showValues() {
        suppliersView.jtf_id.setText("" + suppliersModel.getSupplierID());
        suppliersView.jtf_name.setText(suppliersModel.getName());
        suppliersView.jtf_rfc.setText(suppliersModel.getRfc());
        suppliersView.jtf_street.setText(suppliersModel.getStreet());
        suppliersView.jtf_number.setText("" + suppliersModel.getNumber());
        suppliersView.jtf_suburb.setText(suppliersModel.getSuburb());
        suppliersView.jtf_city.setText(suppliersModel.getCity());
        suppliersView.jtf_state.setText(suppliersModel.getState());
        suppliersView.jtf_contact.setText(suppliersModel.getContact());
        suppliersView.jtf_phone.setText(suppliersModel.getPhone());
        suppliersView.jtf_email.setText(suppliersModel.getEmail());
    }
    
    public void firstSupplier() {
        suppliersModel.moveToFirst();
        showValues();
    }
    
    public void previousSupplier() {
        suppliersModel.moveToPrevious();
        showValues();
    }
    
    public void nextSupplier() {
        suppliersModel.moveToNext();
        showValues();
    }
    
    public void lastSupplier() {
        suppliersModel.moveToLast();
        showValues();
    }
    
    public void addSupplier() {
        try {
            String name = suppliersView.jtf_name.getText();
            String rfc = suppliersView.jtf_rfc.getText();
            String street = suppliersView.jtf_street.getText();
            int number = Integer.parseInt(suppliersView.jtf_number.getText());
            String suburb = suppliersView.jtf_suburb.getText();
            String city = suppliersView.jtf_city.getText();
            String state = suppliersView.jtf_state.getText();
            String contact = suppliersView.jtf_contact.getText();
            String phone = suppliersView.jtf_phone.getText();
            String email = suppliersView.jtf_email.getText();
            suppliersModel.addSupplier(name, rfc, street, number, suburb, city, state, contact, phone, email);
            suppliersModel.setValues();
            showValues();
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editSupplier() {
        try {
            int supplierID = Integer.parseInt(suppliersView.jtf_id.getText());
            String name = suppliersView.jtf_name.getText();
            String rfc = suppliersView.jtf_rfc.getText();
            String street = suppliersView.jtf_street.getText();
            int number = Integer.parseInt(suppliersView.jtf_number.getText());
            String suburb = suppliersView.jtf_suburb.getText();
            String city = suppliersView.jtf_city.getText();
            String state = suppliersView.jtf_state.getText();
            String contact = suppliersView.jtf_contact.getText();
            String phone = suppliersView.jtf_phone.getText();
            String email = suppliersView.jtf_email.getText();
            suppliersModel.editSupplier(supplierID, name, rfc, street, number, suburb, city, state, contact, phone, email);
            suppliersModel.setValues();
            showValues();
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeSupplier() {
        JOptionPane.showMessageDialog(null, "No puedes eliminar este campo. Tiene registros existentes de compras y ventas ", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
    public void findSupplier() {
        String name = JOptionPane.showInputDialog(null, "Introduce el nombre que deseas buscar:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(suppliersModel.findSupplier(name))
            JOptionPane.showMessageDialog(null, name + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " no existe en la base de datos. Intente de nuevo", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
    
    private void showRecords() {
        suppliersView.jt_suppliersTable.setModel(suppliersModel.tableModel);
        suppliersModel.populateTable();
    }
}
