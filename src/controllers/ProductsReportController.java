package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ProductsReportModel;
import views.ProductsReportView;

public class ProductsReportController implements ActionListener {
    ProductsReportModel productsReportModel;
    ProductsReportView productsReportView;

    public ProductsReportController(ProductsReportModel productsReportModel, ProductsReportView productsReportView) {
        this.productsReportModel = productsReportModel;
        this.productsReportView = productsReportView;
        
        this.productsReportView.jb_findProduct.addActionListener(this);
        this.productsReportView.jb_findDesc.addActionListener(this);
        this.productsReportView.jb_allProducts.addActionListener(this);
        this.productsReportView.jb_report.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent r) {
        if(r.getSource() == productsReportView.jb_findProduct)
            findProduct();
        else if(r.getSource() == productsReportView.jb_findDesc)
            findDesc();
        else if(r.getSource() == productsReportView.jb_allProducts)
            allProducts();
        else if(r.getSource() == productsReportView.jb_report)
            showReport();
    }
    
    public void initView() {
        productsReportModel.initValues();
        productsReportModel.setValues();
    }
    
    public void findProduct() {
        String product = productsReportView.jcb_products.getSelectedItem().toString();
        productsReportView.jt_productsTable.setModel(productsReportModel.tableModel);
        productsReportModel.findProduct(product);
    }
    
    public void findDesc() {
        String description = productsReportView.jcb_desc.getSelectedItem().toString();
        productsReportView.jt_productsTable.setModel(productsReportModel.tableModel);
        productsReportModel.findDesc(description);
    }
    
    public void allProducts() {
        productsReportView.jt_productsTable.setModel(productsReportModel.tableModel);
        productsReportModel.allProducts();
        productsReportModel.setValues();
    }
    
    public void showReport() {
        
    }
}
