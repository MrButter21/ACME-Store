package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.MainModel;
import views.*;

import javax.swing.JPanel;

public class MainController implements ActionListener {
    MainModel mainModel;
    
    MainView mainView;
    UsersView usersView;
    CustomersView customersView;
    SuppliersView suppliersView;
    ProductsView productsView;
    
    JPanel paneArray [];

    public MainController(MainModel mainModel, MainView mainView, JPanel[] paneArray) {
        this.mainModel = mainModel;
        this.mainView = mainView;
        this.paneArray = paneArray;
        
        this.mainView.jmi_users.addActionListener(this);
        this.mainView.jmi_customers.addActionListener(this);
        this.mainView.jmi_suppliers.addActionListener(this);
        this.mainView.jmi_products.addActionListener(this);
        this.mainView.jmi_exit.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent x) {
        if(x.getSource() == mainView.jmi_users)
            usersPane();
        else if(x.getSource() == mainView.jmi_customers)
            customersPane();
        else if(x.getSource() == mainView.jmi_suppliers)
            suppliersPane();
        else if(x.getSource() == mainView.jmi_products)
            productsPane();
        else if(x.getSource() == mainView.jmi_exit)
            close();
    }
    
    public void initView() {
        mainView.setTitle("ACME-Store");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
    }
    
    public void usersPane() {
        mainView.setContentPane(paneArray[0]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void customersPane() {
        mainView.setContentPane(paneArray[1]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void suppliersPane() {
        mainView.setContentPane(paneArray[2]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void productsPane() {
        mainView.setContentPane(paneArray[3]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void close() {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION)
            System.exit(0);
    }
}
