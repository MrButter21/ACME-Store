package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        CustomersModel customersModel = new CustomersModel();
        CustomersView customersView = new CustomersView();
        CustomersController customersController = new CustomersController(customersModel, customersView);
        
        SuppliersModel suppliersModel = new SuppliersModel();
        SuppliersView suppliersView = new SuppliersView();
        SuppliersController suppliersController = new SuppliersController(suppliersModel, suppliersView);
        
        ProductsModel productsModel = new ProductsModel();
        ProductsView productsView = new ProductsView();
        ProductsController productsController = new ProductsController(productsModel, productsView);
        
        JPanel paneArray[] = new JPanel[3];
        paneArray[0] = customersView;
        paneArray[1] = suppliersView;
        paneArray[2] = productsView;
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    } 
}
