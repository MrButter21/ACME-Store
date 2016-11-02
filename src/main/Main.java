package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
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
        
        JPanel paneArray[] = new JPanel[4];
        paneArray[0] = usersView;
        paneArray[1] = customersView;
        paneArray[2] = suppliersView;
        paneArray[3] = productsView;
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    } 
}
