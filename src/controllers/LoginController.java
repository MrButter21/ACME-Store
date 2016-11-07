package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import models.LoginModel;
import views.LoginView;
import views.MainView;

public class LoginController implements ActionListener {
    LoginModel loginModel;
    LoginView loginView;
    MainView mainView; 

    public LoginController(LoginModel loginModel, LoginView loginView, MainView mainView) {
        this.loginModel = loginModel;
        this.loginView = loginView;
        this.mainView = mainView;
        
        this.loginView.jb_login.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == loginView.jb_login)
            logIn();
    }
    
    public void initView() {
        loginModel.initValues();
    }
    
    public void logIn() {
        String user = loginView.jtf_user.getText();
        String password = loginView.jpf_password.getText();
        if(loginModel.login(user, password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido(a). Acabas de ingresar al sistema.");
            loginView.jl_title.setVisible(false);
            loginView.jl_header1.setVisible(false);
            loginView.jtf_user.setVisible(false);
            loginView.jl_header2.setVisible(false);
            loginView.jpf_password.setVisible(false);
            loginView.jb_login.setVisible(false);
            
            mainView.jmi_login.setEnabled(false);
            if(loginModel.level.equals("Administrador")) {
                mainView.jm_options.setEnabled(true);
                mainView.jm_catalog.setEnabled(true);
                mainView.jm_operations.setEnabled(true);
                mainView.jm_reports.setEnabled(true);
                
                mainView.jmi_users.setEnabled(true);
                mainView.jmi_exit.setEnabled(true);
                
                mainView.jmi_customers.setEnabled(true);
                mainView.jmi_suppliers.setEnabled(true);
                mainView.jmi_products.setEnabled(true);
        
                mainView.jmi_purchases.setEnabled(true);
                mainView.jmi_sales.setEnabled(true);
        
                mainView.jmi_customersReport.setEnabled(true);
                mainView.jmi_suppliersReport.setEnabled(true);
                mainView.jmi_productsReport.setEnabled(true);
                mainView.jmi_purchasesReport.setEnabled(true);
                mainView.jmi_salesReport.setEnabled(true);
            }
            else if(loginModel.level.equals("Cliente")) {
                mainView.jm_options.setEnabled(true);
                mainView.jm_operations.setEnabled(true);
                mainView.jm_reports.setEnabled(true);
                
                mainView.jmi_exit.setEnabled(true);
                
                mainView.jmi_purchases.setEnabled(true);
                mainView.jmi_sales.setEnabled(true);
                
                mainView.jmi_purchasesReport.setEnabled(true);
                mainView.jmi_salesReport.setEnabled(true);
            }
            else if(loginModel.level.equals("Proveedor")) {
                mainView.jm_options.setEnabled(true);
                mainView.jm_operations.setEnabled(true);
                mainView.jm_reports.setEnabled(true);
                
                mainView.jmi_exit.setEnabled(true);
                
                mainView.jmi_purchases.setEnabled(true);
                mainView.jmi_sales.setEnabled(true);
                
                mainView.jmi_purchasesReport.setEnabled(true);
                mainView.jmi_salesReport.setEnabled(true);
            }
        }
        else if(loginView.jtf_user.getText().isEmpty() || loginView.jpf_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacíos.");
        }
        else {
            JOptionPane.showMessageDialog(null, "No puedes ingresar. No eres un usuario válido.");
            loginView.jtf_user.setText("");
            loginView.jpf_password.setText("");
        }
    }
}
