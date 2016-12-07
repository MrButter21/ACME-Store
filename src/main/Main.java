package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
              
        UsersModel usersModel = new UsersModel();
        UsersView usersView = new UsersView();
        UsersController usersController = new UsersController(usersModel, usersView);
        
        CustomersModel customersModel = new CustomersModel();
        CustomersView customersView = new CustomersView();
        CustomersController customersController = new CustomersController(customersModel, customersView);
        
        SuppliersModel suppliersModel = new SuppliersModel();
        SuppliersView suppliersView = new SuppliersView();
        SuppliersController suppliersController = new SuppliersController(suppliersModel, suppliersView);
        
        ProductsModel productsModel = new ProductsModel();
        ProductsView productsView = new ProductsView();
        ProductsController productsController = new ProductsController(productsModel, productsView);
        
        PurchasesModel purchasesModel = new PurchasesModel();
        PurchasesView purchasesView = new PurchasesView();
        PurchasesController purchasesController = new PurchasesController(purchasesModel, purchasesView);
        
        SalesModel salesModel = new SalesModel();
        SalesView salesView = new SalesView();
        SalesController salesController = new SalesController(salesModel, salesView);
        
        CustomersReportModel customersReportModel = new CustomersReportModel();
        CustomersReportView customersReportView = new CustomersReportView();
        CustomersReportController customersReportController = new CustomersReportController(customersReportModel, customersReportView);
        
        SuppliersReportModel suppliersReportModel = new SuppliersReportModel();
        SuppliersReportView suppliersReportView = new SuppliersReportView();
        SuppliersReportController suppliersReportController = new SuppliersReportController(suppliersReportModel, suppliersReportView);
        
        ProductsReportModel productsReportModel = new ProductsReportModel();
        ProductsReportView productsReportView = new ProductsReportView();
        ProductsReportController productsReportController = new ProductsReportController(productsReportModel, productsReportView);
        
        PurchasesReportModel purchasesReportModel = new PurchasesReportModel();
        PurchasesReportView purchasesReportView = new PurchasesReportView();
        PurchasesReportController purchasesReportController = new PurchasesReportController(purchasesReportModel, purchasesReportView);
        
        SalesReportModel salesReportModel = new SalesReportModel();
        SalesReportView salesReportView = new SalesReportView();
        SalesReportController salesReportController = new SalesReportController(salesReportModel, salesReportView);
                
        JPanel paneArray[] = new JPanel[12];
        paneArray[0] = loginView;
        paneArray[1] = usersView;
        
        paneArray[2] = customersView;
        paneArray[3] = suppliersView;
        paneArray[4] = productsView;
        
        paneArray[5] = purchasesView;
        paneArray[6] = salesView;
        
        paneArray[7] = customersReportView;
        paneArray[8] = suppliersReportView;
        paneArray[9] = productsReportView;
        paneArray[10] = purchasesReportView;
        paneArray[11] = salesReportView;
                
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
        
        LoginController loginController = new LoginController(loginModel, loginView, mainView);
    } 
}
