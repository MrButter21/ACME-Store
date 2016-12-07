package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.SuppliersReportModel;
import views.SuppliersReportView;

public class SuppliersReportController implements ActionListener {
    SuppliersReportModel suppliersReportModel;
    SuppliersReportView suppliersReportView;

    public SuppliersReportController(SuppliersReportModel suppliersReportModel, SuppliersReportView suppliersReportView) {
        this.suppliersReportModel = suppliersReportModel;
        this.suppliersReportView = suppliersReportView;
        
        this.suppliersReportView.jb_findSupplier.addActionListener(this);
        this.suppliersReportView.jb_findCity.addActionListener(this);
        this.suppliersReportView.jb_allSuppliers.addActionListener(this);
        this.suppliersReportView.jb_report.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent r) {
        if(r.getSource() == suppliersReportView.jb_findSupplier)
            findSupplier();
        else if(r.getSource() == suppliersReportView.jb_findCity)
            findCity();
        else if(r.getSource() == suppliersReportView.jb_allSuppliers)
            allSuppliers();
        else if(r.getSource() == suppliersReportView.jb_report)
            showReport();
    }
    
    public void initView() {
        suppliersReportModel.initValues();
        suppliersReportModel.setValues();
    }
    
    public void findSupplier() {
        String name = suppliersReportView.jcb_suppliers.getSelectedItem().toString();
        suppliersReportView.jt_suppliersTable.setModel(suppliersReportModel.tableModel);
        suppliersReportModel.findSupplier(name);
    }
    
    public void findCity() {
        String city = suppliersReportView.jcb_cities.getSelectedItem().toString();
        suppliersReportView.jt_suppliersTable.setModel(suppliersReportModel.tableModel);
        suppliersReportModel.findCity(city);
    }
    
    public void allSuppliers() {
        suppliersReportView.jt_suppliersTable.setModel(suppliersReportModel.tableModel);
        suppliersReportModel.allSuppliers();
        suppliersReportModel.setValues();
    }
    
    public void showReport() {
        
    }
}
