package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.SalesReportModel;
import views.SalesReportView;

public class SalesReportController implements ActionListener {
    SalesReportModel salesReportModel;
    SalesReportView salesReportView;

    public SalesReportController(SalesReportModel salesReportModel, SalesReportView salesReportView) {
        this.salesReportModel = salesReportModel;
        this.salesReportView = salesReportView;
        
        this.salesReportView.jb_findCustomer.addActionListener(this);
        this.salesReportView.jb_findProduct.addActionListener(this);
        
        this.salesReportView.jb_customerSales.addActionListener(this);
        this.salesReportView.jb_productSales.addActionListener(this);
        this.salesReportView.jb_allSales.addActionListener(this);
        this.salesReportView.jb_report.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == salesReportView.jb_findCustomer)
            findCustomer();
        else if(a.getSource() == salesReportView.jb_findProduct)
            findProduct();
        
        else if(a.getSource() == salesReportView.jb_customerSales)
            customerSales();
        else if(a.getSource() == salesReportView.jb_productSales)
            productSales();
        else if(a.getSource() == salesReportView.jb_allSales)
            allSales();
        else if(a.getSource() == salesReportView.jb_report)
            showReport();
    }
    
    public void initView() {       
        salesReportModel.initValues();
        salesReportModel.setValues();
    }
    
    public void findCustomer() {
        String name = salesReportView.jcb_customers.getSelectedItem().toString();
        salesReportView.jt_salesTable.setModel(salesReportModel.tableModel);
        salesReportView.jt_salesTable.setModel(salesReportModel.firstTable);
        salesReportModel.findCustomer(name);
    }
    
    public void findProduct() {
        String product = salesReportView.jcb_products.getSelectedItem().toString();
        salesReportView.jt_salesTable.setModel(salesReportModel.tableModel);
        salesReportView.jt_salesTable.setModel(salesReportModel.secondTable);
        salesReportModel.findProduct(product);
    }
    
    public void customerSales() {
        salesReportView.jt_salesTable.setModel(salesReportModel.tableModel);
        salesReportView.jt_salesTable.setModel(salesReportModel.thirdTable);
        salesReportModel.customerSales();
        salesReportModel.setValues();
    }
    
    public void productSales() {
        salesReportView.jt_salesTable.setModel(salesReportModel.tableModel);
        salesReportView.jt_salesTable.setModel(salesReportModel.fourthTable);
        salesReportModel.productSales();
        salesReportModel.setValues();
    }
    
    public void allSales() {
        salesReportView.jt_salesTable.setModel(salesReportModel.tableModel);
        salesReportView.jt_salesTable.setModel(salesReportModel.fifthTable);
        salesReportModel.allSales();
        salesReportModel.setValues();
    }
    
    public void showReport() {
        
    }
}
