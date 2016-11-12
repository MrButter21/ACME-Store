package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.SalesModel;
import views.SalesView;

public class SalesController implements ActionListener {
    SalesModel salesModel;
    SalesView salesView;

    public SalesController(SalesModel salesModel, SalesView salesView) {
        this.salesModel = salesModel;
        this.salesView = salesView;
        
        this.salesView.jb_findCustomer.addActionListener(this);
        this.salesView.jb_findProduct.addActionListener(this);
        this.salesView.jb_add.addActionListener(this);
        this.salesView.jb_new.addActionListener(this);
        this.salesView.jb_save.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == salesView.jb_findCustomer)
            findCustomer();
        else if(a.getSource() == salesView.jb_findProduct)
            findProduct();
        else if(a.getSource() == salesView.jb_add)
            addProduct();
        else if(a.getSource() == salesView.jb_new)
            newSale();
        else if(a.getSource() == salesView.jb_save)
            saveSale();
    }
    
    public void initView() {
        salesModel.initValues();
        salesModel.setValues();
    }
    
    public void findCustomer() {             
        int customerID = Integer.parseInt(salesView.jtf_customerID.getText());
        if(salesModel.findCustomer(customerID))
            salesView.jtf_name.setText(salesModel.customerName);
        else {
            JOptionPane.showMessageDialog(null, "No existe este registro en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
            salesView.jtf_customerID.setText("");
            salesView.jtf_name.setText("");
        }
    }
    
    public void findProduct() {             
        int productID = Integer.parseInt(salesView.jtf_productID.getText());
        if(salesModel.findProduct(productID)) {
            salesView.jtf_product.setText(salesModel.product);
            salesView.jtf_saleCost.setText("" + salesModel.saleCost);
        }
        else {
            JOptionPane.showMessageDialog(null, "No existe este registro en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
            salesView.jtf_productID.setText("");
            salesView.jtf_product.setText("");
            salesView.jtf_saleCost.setText("");
        }
    }
    
    public void addProduct() {
        int customerID = Integer.parseInt(salesView.jtf_customerID.getText());
        String name = salesView.jtf_name.getText();
        int productID = Integer.parseInt(salesView.jtf_productID.getText());
        String product = salesView.jtf_product.getText();
        float saleCost = Float.parseFloat(salesView.jtf_saleCost.getText());
        int quantity = Integer.parseInt(salesView.jtf_quantity.getText());
        int vat = 15;
        float subtotal = ((float)(saleCost * 0.15) + saleCost);
        float total = subtotal * quantity;
        salesView.jtf_vat.setText("" + vat + " %" + " =" + " 0.15");
        salesView.jtf_sub.setText("" + subtotal + " $");
        salesView.jtf_total.setText("" + total + " $");
        salesModel.addProduct(customerID, name, productID, product, saleCost, quantity, vat, subtotal, total);
    }
    
    public void newSale() {
        JOptionPane.showMessageDialog(null, "Ahora puedes realizar una nueva venta.");
        salesView.jtf_customerID.setText("");
        salesView.jtf_name.setText("");
        salesView.jtf_productID.setText("");
        salesView.jtf_product.setText("");
        salesView.jtf_saleCost.setText("");
        salesView.jtf_quantity.setText("");
        salesView.jtf_vat.setText("");
        salesView.jtf_sub.setText("");
        salesView.jtf_total.setText("");
        for(int i = 0; i < salesModel.tableModel.getRowCount(); i++) {
            salesModel.tableModel.removeRow(i);
            i -= 1;
        }
    }
    
    public void saveSale() {
        if(salesView.jtf_customerID.getText().isEmpty() || salesView.jtf_name.getText().isEmpty() ||
        salesView.jtf_productID.getText().isEmpty() || salesView.jtf_product.getText().isEmpty() ||
        salesView.jtf_saleCost.getText().isEmpty() || salesView.jtf_quantity.getText().isEmpty() ||
        salesView.jtf_vat.getText().isEmpty() || salesView.jtf_sub.getText().isEmpty() || salesView.jtf_total.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puedes efectuar la venta. Existen campos vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Tu venta se ha realizado exitosamente.", "Venta completada", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void showRecords() {
        salesView.jt_salesTable.setModel(salesModel.tableModel);
    }
}
