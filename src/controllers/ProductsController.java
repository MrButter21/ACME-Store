package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.ProductsModel;
import views.ProductsView;

public class ProductsController implements ActionListener {
    ProductsModel productsModel;
    ProductsView productsView;

    public ProductsController(ProductsModel productsModel, ProductsView productsView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
        
        this.productsView.jb_first.addActionListener(this);
        this.productsView.jb_previous.addActionListener(this);
        this.productsView.jb_next.addActionListener(this);
        this.productsView.jb_last.addActionListener(this);
        
        this.productsView.jb_add.addActionListener(this);
        this.productsView.jb_edit.addActionListener(this);
        this.productsView.jb_remove.addActionListener(this);
        this.productsView.jb_find.addActionListener(this);
        
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
        String product = productsView.jtf_product.getText();
        String description = productsView.jtf_description.getText();
        float purchaseCost = Float.parseFloat(productsView.jtf_purchaseCost.getText());
        float saleCost = Float.parseFloat(productsView.jtf_saleCost.getText());
        int stock = Integer.parseInt(productsView.jtf_stock.getText());
        productsModel.addProduct(product, description, purchaseCost, saleCost, stock);
        productsModel.setValues();
        showValues();
    }
    
    public void editProduct() {
        int productID = Integer.parseInt(productsView.jtf_id.getText());
        String product = productsView.jtf_product.getText();
        String description = productsView.jtf_description.getText();
        float purchaseCost = Float.parseFloat(productsView.jtf_purchaseCost.getText());
        float saleCost = Float.parseFloat(productsView.jtf_saleCost.getText());
        int stock = Integer.parseInt(productsView.jtf_stock.getText());
        productsModel.editProduct(productID, product, description, purchaseCost, saleCost, stock);
        productsModel.setValues();
        showValues();
    }
    
    public void removeProduct() {
        int productID = Integer.parseInt(productsView.jtf_id.getText());
        productsModel.removeProduct(productID);
        productsModel.setValues();
        showValues();
    }
    
    public void findProduct() {
        String name = JOptionPane.showInputDialog(null, "Introduce el nombre que deseas buscar:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(name.equals(productsView.jtf_product.getText()))
            JOptionPane.showMessageDialog(null, name + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " no existe en la base de datos. Intente de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    private void showRecords() {
        productsView.jt_productsTable.setModel(productsModel.tableModel);
        productsModel.populateTable();
    }
}
