package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.ProductsModel;
import views.ProductsView;
import views.PurchasesView;
import views.SalesView;

public class ProductsController implements ActionListener {
    ProductsModel productsModel;
    ProductsView productsView;
    PurchasesView purchasesView;
    SalesView salesView;

    public ProductsController(ProductsModel productsModel, ProductsView productsView, PurchasesView purchasesView, SalesView salesView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
        this.purchasesView = purchasesView;
        this.salesView = salesView;
        
        this.productsView.jb_first.addActionListener(this);
        this.productsView.jb_previous.addActionListener(this);
        this.productsView.jb_next.addActionListener(this);
        this.productsView.jb_last.addActionListener(this);
        
        this.productsView.jb_add.addActionListener(this);
        this.productsView.jb_edit.addActionListener(this);
        this.productsView.jb_remove.addActionListener(this);
        this.productsView.jb_find.addActionListener(this);
        
        this.productsView.jb_update.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == productsView.jb_first)
            firstProduct();
        else if(a.getSource() == productsView.jb_previous)
            previousProduct();
        else if(a.getSource() == productsView.jb_next)
            nextProduct();
        else if(a.getSource() == productsView.jb_last)
            lastProduct();
        
        else if(a.getSource() == productsView.jb_add)
            addProduct();
        else if(a.getSource() == productsView.jb_edit)
            editProduct();
        else if(a.getSource() == productsView.jb_remove)
            removeProduct();
        else if(a.getSource() == productsView.jb_find)
            findProduct();
        
        else if(a.getSource() == productsView.jb_update)
            updateTable();
    }
    
    public void initView() {
        productsModel.initValues();
        productsModel.setValues();
    }
    
    public void showValues() {
        productsView.jtf_id.setText("" + productsModel.getProductID());
        productsView.jtf_product.setText(productsModel.getProduct());
        productsView.jtf_description.setText(productsModel.getDescription());
        productsView.jtf_purchaseCost.setText("" + productsModel.getPurchaseCost());
        productsView.jtf_saleCost.setText("" + productsModel.getSaleCost());
        productsView.jtf_stock.setText("" + productsModel.getStock());
    }
    
    public void firstProduct() {
        productsModel.moveToFirst();
        showValues();
    }
    
    public void previousProduct() {
        productsModel.moveToPrevious();
        showValues();
    }
    
    public void nextProduct() {
        productsModel.moveToNext();
        showValues();
    }
    
    public void lastProduct() {
        productsModel.moveToLast();
        showValues();
    }
    
    public void addProduct() {
        try {
            String product = productsView.jtf_product.getText();
            String description = productsView.jtf_description.getText();
            int purchaseCost = Integer.parseInt(productsView.jtf_purchaseCost.getText());
            int saleCost = Integer.parseInt(productsView.jtf_saleCost.getText());
            int stock = Integer.parseInt(productsView.jtf_stock.getText());
            productsModel.addProduct(product, description, purchaseCost, saleCost, stock);
            productsModel.setValues();
            showValues();
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editProduct() {
        try {
            int productID = Integer.parseInt(productsView.jtf_id.getText());
            String product = productsView.jtf_product.getText();
            String description = productsView.jtf_description.getText();
            int purchaseCost = Integer.parseInt(productsView.jtf_purchaseCost.getText());
            int saleCost = Integer.parseInt(productsView.jtf_saleCost.getText());
            int stock = Integer.parseInt(productsView.jtf_stock.getText());
            productsModel.editProduct(productID, product, description, purchaseCost, saleCost, stock);
            productsModel.setValues();
            showValues();
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Valor numérico incorrecto o campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeProduct() {
        JOptionPane.showMessageDialog(null, "No puedes eliminar este campo. Tiene registros existentes de compras y ventas ", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
    public void findProduct() {
        String product = JOptionPane.showInputDialog(null, "Introduce el producto que deseas buscar:", "Búsqueda por producto", JOptionPane.INFORMATION_MESSAGE);
        if(productsModel.findProduct(product))
            JOptionPane.showMessageDialog(null, product + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, product + " no existe en la base de datos. Intente de nuevo", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
    
    public void updateForPurchase() {
        String product = purchasesView.jtf_product.getText();
        int quantity = Integer.parseInt(purchasesView.jtf_quantity.getText());
        int stock = productsModel.getStock();
        stock = stock - quantity;
        productsModel.updateForPurchase(product, quantity, stock);
        productsModel.setValues();
        showValues();
    }
    
    public void updateForSale() {
        String product = salesView.jtf_product.getText();
        int quantity = Integer.parseInt(salesView.jtf_quantity.getText());
        int stock = productsModel.getStock();
        stock = stock - quantity;
        productsModel.updateForSale(product, quantity, stock);
        productsModel.setValues();
        showValues();
    }
    
    public void updateTable() {
        for(int i = 0; i < productsModel.tableModel.getRowCount(); i++) {
            productsModel.tableModel.removeRow(i);
            i -= 1;
        }
        updateForPurchase();
        updateForSale();
    }
    
    private void showRecords() {
        productsView.jt_productsTable.setModel(productsModel.tableModel);
        productsModel.populateTable();
    }
}
