package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.PurchasesReportModel;
import views.PurchasesReportView;

public class PurchasesReportController implements ActionListener {
    PurchasesReportModel purchasesReportModel;
    PurchasesReportView purchasesReportView;

    public PurchasesReportController(PurchasesReportModel purchasesReportModel, PurchasesReportView purchasesReportView) {
        this.purchasesReportModel = purchasesReportModel;
        this.purchasesReportView = purchasesReportView;
        
        this.purchasesReportView.jb_findSupplier.addActionListener(this);
        this.purchasesReportView.jb_findProduct.addActionListener(this);
        
        this.purchasesReportView.jb_supplierPurchases.addActionListener(this);
        this.purchasesReportView.jb_productPurchases.addActionListener(this);
        this.purchasesReportView.jb_allPurchases.addActionListener(this);
        this.purchasesReportView.jb_report.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == purchasesReportView.jb_findSupplier)
            findSupplier();
        else if(a.getSource() == purchasesReportView.jb_findProduct)
            findProduct();
        
        else if(a.getSource() == purchasesReportView.jb_supplierPurchases)
            supplierPurchases();
        else if(a.getSource() == purchasesReportView.jb_productPurchases)
            productPurchases();
        else if(a.getSource() == purchasesReportView.jb_allPurchases)
            allPurchases();
        else if(a.getSource() == purchasesReportView.jb_report)
            showReport();
    }
    
    public void initView() {       
        purchasesReportModel.initValues();
        purchasesReportModel.setValues();
    }
    
    public void findSupplier() {
        String name = purchasesReportView.jcb_suppliers.getSelectedItem().toString();
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.tableModel);
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.firstTable);
        purchasesReportModel.findSupplier(name);
    }
    
    public void findProduct() {
        String product = purchasesReportView.jcb_products.getSelectedItem().toString();
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.tableModel);
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.secondTable);
        purchasesReportModel.findProduct(product);
    }
    
    public void supplierPurchases() {
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.tableModel);
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.thirdTable);
        purchasesReportModel.supplierPurchases();
        purchasesReportModel.setValues();
    }
    
    public void productPurchases() {
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.tableModel);
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.fourthTable);
        purchasesReportModel.productPurchases();
        purchasesReportModel.setValues();
    }
    
    public void allPurchases() {
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.tableModel);
        purchasesReportView.jt_purchasesTable.setModel(purchasesReportModel.fifthTable);
        purchasesReportModel.allPurchases();
        purchasesReportModel.setValues();
    }
    
    public void showReport() {
        
    }
}
