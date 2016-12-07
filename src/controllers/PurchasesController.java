package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

import models.PurchasesModel;
import views.PurchasesView;

public class PurchasesController implements ActionListener {
    PurchasesModel purchasesModel;
    PurchasesView purchasesView;
    Date day = new Date();

    public PurchasesController(PurchasesModel purchasesModel, PurchasesView purchasesView) {
        this.purchasesModel = purchasesModel;
        this.purchasesView = purchasesView;
        this.day = day;
        
        this.purchasesView.jb_findSupplier.addActionListener(this);
        this.purchasesView.jb_findProduct.addActionListener(this);
        
        this.purchasesView.jb_add.addActionListener(this);
        this.purchasesView.jb_remove.addActionListener(this);
        
        this.purchasesView.jb_new.addActionListener(this);
        this.purchasesView.jb_save.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == purchasesView.jb_findSupplier)
            findSupplier();
        else if(a.getSource() == purchasesView.jb_findProduct)
            findProduct();
        
        else if(a.getSource() == purchasesView.jb_add)
            addProduct();
        else if(a.getSource() == purchasesView.jb_remove)
            removeProduct();
        
        else if(a.getSource() == purchasesView.jb_new)
            newPurchase();
        else if(a.getSource() == purchasesView.jb_save)
            savePurchase();
    }
    
    public void initView() {
        purchasesModel.initValues();
        purchasesModel.setValues();
        
        purchasesModel.initPurchase();
        purchasesModel.setPurchase();
    }
    
    public void findSupplier() {
        try {
            int supplierID = Integer.parseInt(purchasesView.jtf_supplierID.getText());
            if(purchasesModel.findSupplier(supplierID))
                purchasesView.jtf_name.setText(purchasesModel.supplierName);
            else {
                JOptionPane.showMessageDialog(null, "No existe este registro en la tabla." , "Aviso", JOptionPane.WARNING_MESSAGE);
                purchasesView.jtf_supplierID.setText("");
                purchasesView.jtf_name.setText("");
            }
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void findProduct() {
        try {
            int productID = Integer.parseInt(purchasesView.jtf_productID.getText());
            if(purchasesModel.findProduct(productID)) {
                purchasesView.jtf_product.setText(purchasesModel.product);
                purchasesView.jtf_purchaseCost.setText("" + purchasesModel.purchaseCost);
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe este registro en la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
                purchasesView.jtf_productID.setText("");
                purchasesView.jtf_product.setText("");
                purchasesView.jtf_purchaseCost.setText("");
            }
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addProduct() {
        try {           
            int purchaseID = purchasesModel.getPurchaseID();           
            String product = purchasesView.jtf_product.getText();
            int quantity = Integer.parseInt(purchasesView.jtf_quantity.getText());
            int purchaseCost = Integer.parseInt(purchasesView.jtf_purchaseCost.getText());
            int totalProduct = (quantity * purchaseCost);
            
            purchasesView.jtf_date.setText(day.toString());
            purchasesView.jtf_sub.setText("" + totalProduct);
            purchasesModel.addProduct(product, quantity, purchaseCost);           
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeProduct() {
        int tableRow = purchasesView.jt_detailPurchases.getSelectedRows().length;
        for(int i = 0; i < tableRow; i++) {
            purchasesModel.firstTable.removeRow(purchasesView.jt_detailPurchases.getSelectedRow());
        }
        int sub = Integer.parseInt(purchasesView.jt_detailPurchases.getValueAt(purchasesView.jt_detailPurchases.getModel().getRowCount() -1, 4) + "");
        purchasesView.jtf_sub.setText("" + sub);
    }
    
    public void newPurchase() {
        JOptionPane.showMessageDialog(null, "Ahora puedes realizar una nueva compra.");
        purchasesView.jtf_supplierID.setText("");
        purchasesView.jtf_name.setText("");
        purchasesView.jtf_productID.setText("");
        purchasesView.jtf_product.setText("");
        purchasesView.jtf_purchaseCost.setText("");
        purchasesView.jtf_quantity.setText("");
        purchasesView.jtf_date.setText("");
        purchasesView.jtf_sub.setText("");
        purchasesView.jtf_total.setText("");
        for(int i = 0; i < purchasesModel.firstTable.getRowCount(); i++) {
            purchasesModel.firstTable.removeRow(i);
            i -= 1;
        }
        for(int i = 0; i < purchasesModel.secondTable.getColumnCount(); i++) {
            purchasesModel.secondTable.removeRow(i);
            i -= 1;
        }
    }
    
    public void savePurchase() {
        try {
            JOptionPane.showMessageDialog(null, "Tu compra se ha realizado exitosamente.", "Compra completada", JOptionPane.INFORMATION_MESSAGE);
            String supplierName = purchasesView.jtf_name.getText();
            String date = purchasesView.jtf_date.getText();
            int totalPurchase = 0;
            for(int i = 0; i < purchasesView.jt_detailPurchases.getRowCount(); i++) {
                int total = Integer.parseInt(purchasesView.jt_detailPurchases.getValueAt(i, 4) + "");
                totalPurchase += total;
            }
            purchasesView.jtf_total.setText("" + totalPurchase);
            purchasesModel.addPurchase(supplierName, totalPurchase);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void showRecords() {
        purchasesView.jt_detailPurchases.setModel(purchasesModel.firstTable);
        purchasesView.jt_purchases.setModel(purchasesModel.secondTable);
    }
}
