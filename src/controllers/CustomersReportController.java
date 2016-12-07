package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.CustomersReportModel;
import views.CustomersReportView;

public class CustomersReportController implements ActionListener {
    CustomersReportModel customersReportModel;
    CustomersReportView customersReportView;

    public CustomersReportController(CustomersReportModel customersReportModel, CustomersReportView customersReportView) {
        this.customersReportModel = customersReportModel;
        this.customersReportView = customersReportView;
        
        this.customersReportView.jb_findCustomer.addActionListener(this);
        this.customersReportView.jb_findCity.addActionListener(this);
        this.customersReportView.jb_allCustomers.addActionListener(this);
        this.customersReportView.jb_report.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent r) {
        if(r.getSource() == customersReportView.jb_findCustomer)
            findCustomer();
        else if(r.getSource() == customersReportView.jb_findCity)
            findCity();
        else if(r.getSource() == customersReportView.jb_allCustomers)
            allCustomers();
        else if(r.getSource() == customersReportView.jb_report)
            showReport();
    }
    
    public void initView() {
        customersReportModel.initValues();
        customersReportModel.setValues();
    }
    
    public void findCustomer() {
        String name = customersReportView.jcb_customers.getSelectedItem().toString();
        customersReportView.jt_customersTable.setModel(customersReportModel.tableModel);
        customersReportModel.findCustomer(name);
    }
    
    public void findCity() {
        String city = customersReportView.jcb_cities.getSelectedItem().toString();
        customersReportView.jt_customersTable.setModel(customersReportModel.tableModel);
        customersReportModel.findCity(city);
    }
    
    public void allCustomers() {
        customersReportView.jt_customersTable.setModel(customersReportModel.tableModel);
        customersReportModel.allCustomers();
        customersReportModel.setValues();
    }
    
    public void showReport() {
        
    }
}
