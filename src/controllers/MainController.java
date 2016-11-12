package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.MainModel;
import views.*;

public class MainController implements ActionListener {
    MainModel mainModel;
    
    MainView mainView;
    
    LoginView loginView;
    UsersView usersView;
    
    CustomersView customersView;
    SuppliersView suppliersView;
    ProductsView productsView;
    
    PurchasesView purchasesView;
    SalesView salesView;
    
    JPanel paneArray [];

    public MainController(MainModel mainModel, MainView mainView, JPanel[] paneArray) {
        this.mainModel = mainModel;
        this.mainView = mainView;
        this.paneArray = paneArray;
        
        this.mainView.jmi_login.addActionListener(this);
        this.mainView.jmi_users.addActionListener(this);
        this.mainView.jmi_exit.addActionListener(this);
        
        this.mainView.jmi_customers.addActionListener(this);
        this.mainView.jmi_suppliers.addActionListener(this);
        this.mainView.jmi_products.addActionListener(this);
        
        this.mainView.jmi_purchases.addActionListener(this);
        this.mainView.jmi_sales.addActionListener(this);
   
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent x) {
        if(x.getSource() == mainView.jmi_login)
            loginPane();
        else if(x.getSource() == mainView.jmi_users)
            usersPane();
        else if(x.getSource() == mainView.jmi_exit)
            close();
                
        else if(x.getSource() == mainView.jmi_customers)
            customersPane();
        else if(x.getSource() == mainView.jmi_suppliers)
            suppliersPane();
        else if(x.getSource() == mainView.jmi_products)
            productsPane();
        
        else if(x.getSource() == mainView.jmi_purchases)
            purchasesPane();
        else if(x.getSource() == mainView.jmi_sales)
            salesPane();
    }
    
    public void initView() {
        mainView.setTitle("ACME-Store");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
        
        mainView.jm_options.setEnabled(true);        
        mainView.jmi_login.setEnabled(true);
        mainView.jmi_users.setEnabled(false);
        mainView.jmi_exit.setEnabled(true);
        
        mainView.jm_catalog.setEnabled(false);       
        mainView.jmi_customers.setEnabled(false);
        mainView.jmi_suppliers.setEnabled(false);
        mainView.jmi_products.setEnabled(false);
        
        mainView.jm_operations.setEnabled(false);       
        mainView.jmi_purchases.setEnabled(false);
        mainView.jmi_sales.setEnabled(false);
        
        mainView.jm_reports.setEnabled(false);       
        mainView.jmi_customersReport.setEnabled(false);
        mainView.jmi_suppliersReport.setEnabled(false);
        mainView.jmi_productsReport.setEnabled(false);
        mainView.jmi_purchasesReport.setEnabled(false);
        mainView.jmi_salesReport.setEnabled(false);
        
        mainView.jl_title.setVisible(true);
    }
    
    public void loginPane() {
        mainView.setContentPane(paneArray[0]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void usersPane() {
        mainView.setContentPane(paneArray[1]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void customersPane() {
        mainView.setContentPane(paneArray[2]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void suppliersPane() {
        mainView.setContentPane(paneArray[3]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void productsPane() {
        mainView.setContentPane(paneArray[4]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void purchasesPane() {
        mainView.setContentPane(paneArray[5]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void salesPane() {
        mainView.setContentPane(paneArray[6]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void close() {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION)
            System.exit(0);
    }
}
