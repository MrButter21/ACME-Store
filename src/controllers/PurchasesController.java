package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.PurchasesModel;
import views.PurchasesView;

public class PurchasesController implements ActionListener {
    PurchasesModel purchasesModel;
    PurchasesView purchasesView;

    public PurchasesController(PurchasesModel purchasesModel, PurchasesView purchasesView) {
        this.purchasesModel = purchasesModel;
        this.purchasesView = purchasesView;
        
        this.purchasesView.jb_findSupplier.addActionListener(this);
        this.purchasesView.jb_findProduct.addActionListener(this);
        this.purchasesView.jb_add.addActionListener(this);
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
        else if(a.getSource() == purchasesView.jb_new)
            newPurchase();
        else if(a.getSource() == purchasesView.jb_save)
            savePurchase();
    }
    
    public void initView() {
        purchasesModel.initValues();
        purchasesModel.setValues();
    }
    
    public void findSupplier() {             
        int supplierID = Integer.parseInt(purchasesView.jtf_supplierID.getText());
        if(purchasesModel.findSupplier(supplierID))
            purchasesView.jtf_name.setText(purchasesModel.supplierName);
        else {
            JOptionPane.showMessageDialog(null, "No existe este registro en la tabla." , "Aviso", JOptionPane.WARNING_MESSAGE);
            purchasesView.jtf_supplierID.setText("");
            purchasesView.jtf_name.setText("");
        }
    }
    
    public void findProduct() {             
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
    
    public void addProduct() {
        int supplierID = Integer.parseInt(purchasesView.jtf_supplierID.getText());
        String name = purchasesView.jtf_name.getText();
        int productID = Integer.parseInt(purchasesView.jtf_productID.getText());
        String product = purchasesView.jtf_product.getText();
        float purchaseCost = Float.parseFloat(purchasesView.jtf_purchaseCost.getText());
        int quantity = Integer.parseInt(purchasesView.jtf_quantity.getText());
        int vat = 15;
        float subtotal = ((float)(purchaseCost * 0.15) + purchaseCost);
        float total = subtotal * quantity;
        purchasesView.jtf_vat.setText("" + vat + " %" + " =" + " 0.15");
        purchasesView.jtf_sub.setText("" + subtotal + " $");
        purchasesView.jtf_total.setText("" + total + " $");
        purchasesModel.addProduct(supplierID, name, productID, product, purchaseCost, quantity, vat, subtotal, total);
    }
    
    public void newPurchase() {
        JOptionPane.showMessageDialog(null, "Ahora puedes realizar una nueva compra.");
        purchasesView.jtf_supplierID.setText("");
        purchasesView.jtf_name.setText("");
        purchasesView.jtf_productID.setText("");
        purchasesView.jtf_product.setText("");
        purchasesView.jtf_purchaseCost.setText("");
        purchasesView.jtf_quantity.setText("");
        purchasesView.jtf_vat.setText("");
        purchasesView.jtf_sub.setText("");
        purchasesView.jtf_total.setText("");
        for(int i = 0; i < purchasesModel.tableModel.getRowCount(); i++) {
            purchasesModel.tableModel.removeRow(i);
            i -= 1;
        }
    }
    
    public void savePurchase() {
        if(purchasesView.jtf_supplierID.getText().isEmpty() || purchasesView.jtf_name.getText().isEmpty() ||
        purchasesView.jtf_productID.getText().isEmpty() || purchasesView.jtf_product.getText().isEmpty() ||
        purchasesView.jtf_purchaseCost.getText().isEmpty() || purchasesView.jtf_quantity.getText().isEmpty() ||
        purchasesView.jtf_vat.getText().isEmpty() || purchasesView.jtf_sub.getText().isEmpty() || purchasesView.jtf_total.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puedes efectuar la compra. Existen campos vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Tu compra se ha realizado exitosamente.", "Compra completada", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void showRecords() {
        purchasesView.jt_purchasesTable.setModel(purchasesModel.tableModel);
    }
}
