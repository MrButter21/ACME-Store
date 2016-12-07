package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

import models.SalesModel;
import views.SalesView;

public class SalesController implements ActionListener {
    SalesModel salesModel;
    SalesView salesView;
    Date day = new Date();

    public SalesController(SalesModel salesModel, SalesView salesView) {
        this.salesModel = salesModel;
        this.salesView = salesView;
        this.day = day;
        
        this.salesView.jb_findCustomer.addActionListener(this);
        this.salesView.jb_findProduct.addActionListener(this);
        
        this.salesView.jb_add.addActionListener(this);
        this.salesView.jb_remove.addActionListener(this);
        
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
        else if(a.getSource() == salesView.jb_remove)
            removeProduct();
        
        else if(a.getSource() == salesView.jb_new)
            newSale();
        else if(a.getSource() == salesView.jb_save)
            saveSale();
    }
    
    public void initView() {
        salesModel.initValues();
        salesModel.setValues();
        
        salesModel.initSale();
        salesModel.setSale();
    }
    
    public void findCustomer() {
        try {
            int customerID = Integer.parseInt(salesView.jtf_customerID.getText());
            if(salesModel.findCustomer(customerID))
                salesView.jtf_name.setText(salesModel.customerName);
            else {
                JOptionPane.showMessageDialog(null, "No existe este registro en la tabla." , "Aviso", JOptionPane.WARNING_MESSAGE);
                salesView.jtf_customerID.setText("");
                salesView.jtf_name.setText("");
            }
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void findProduct() {
        try {
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
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addProduct() {
        try {           
            int saleID = salesModel.getSaleID();           
            String product = salesView.jtf_product.getText();
            int quantity = Integer.parseInt(salesView.jtf_quantity.getText());
            int saleCost = Integer.parseInt(salesView.jtf_saleCost.getText());
            int totalProduct = (quantity * saleCost);
            
            salesView.jtf_date.setText(day.toString());
            salesView.jtf_sub.setText("" + totalProduct);
            salesModel.addProduct(product, quantity, saleCost);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeProduct() {
        int tableRow = salesView.jt_detailSales.getSelectedRows().length;
        for(int i = 0; i < tableRow; i++) {
            salesModel.firstTable.removeRow(salesView.jt_detailSales.getSelectedRow());
        }
        int sub = Integer.parseInt(salesView.jt_detailSales.getValueAt(salesView.jt_detailSales.getModel().getRowCount() -1, 4) + "");
        salesView.jtf_sub.setText("" + sub);
    }
    
    public void newSale() {
        JOptionPane.showMessageDialog(null, "Ahora puedes realizar una nueva venta.");
        salesView.jtf_customerID.setText("");
        salesView.jtf_name.setText("");
        salesView.jtf_productID.setText("");
        salesView.jtf_product.setText("");
        salesView.jtf_saleCost.setText("");
        salesView.jtf_quantity.setText("");
        salesView.jtf_date.setText("");
        salesView.jtf_sub.setText("");
        salesView.jtf_total.setText("");
        for(int i = 0; i < salesModel.firstTable.getRowCount(); i++) {
            salesModel.firstTable.removeRow(i);
            i -= 1;
        }
        for(int i = 0; i < salesModel.secondTable.getColumnCount(); i++) {
            salesModel.secondTable.removeRow(i);
            i -= 1;
        }
    }
    
    public void saveSale() {
        try {
            JOptionPane.showMessageDialog(null, "Tu venta se ha realizado exitosamente.", "Compra completada", JOptionPane.INFORMATION_MESSAGE);
            String customerName = salesView.jtf_name.getText();
            String date = salesView.jtf_date.getText();
            int totalSale = 0;
            for(int i = 0; i < salesView.jt_detailSales.getRowCount(); i++) {
                int total = Integer.parseInt(salesView.jt_detailSales.getValueAt(i, 4) + "");
                totalSale += total;
            }
            salesView.jtf_total.setText("" + totalSale);
            salesModel.addPurchase(customerName, totalSale);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void showRecords() {
        salesView.jt_detailSales.setModel(salesModel.firstTable);
        salesView.jt_sales.setModel(salesModel.secondTable);
    }
}
