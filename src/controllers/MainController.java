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
    CustomersView customersView;
    
    JPanel paneArray [];

    public MainController(MainModel mainModel, MainView mainView, JPanel[] paneArray) {
        this.mainModel = mainModel;
        this.mainView = mainView;
        this.paneArray = paneArray;
        
        this.mainView.jmi_customers.addActionListener(this);
        this.mainView.jmi_exit.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent x) {
        if(x.getSource() == mainView.jmi_customers)
            customersPane();
        else if(x.getSource() == mainView.jmi_exit)
            close();
    }
    
    public void initView() {
        mainView.setTitle("ACME-Store");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
    }
    
    public void customersPane() {
        mainView.setContentPane(paneArray[0]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void close() {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION)
            System.exit(0);
    }
}
