/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Sergio
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jmb_menu = new javax.swing.JMenuBar();
        jm_options = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_users = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();
        jm_catalog = new javax.swing.JMenu();
        jmi_customers = new javax.swing.JMenuItem();
        jmi_suppliers = new javax.swing.JMenuItem();
        jmi_products = new javax.swing.JMenuItem();
        jm_operations = new javax.swing.JMenu();
        jmi_purchases = new javax.swing.JMenuItem();
        jmi_sales = new javax.swing.JMenuItem();
        jm_reports = new javax.swing.JMenu();
        jmi_customersReport = new javax.swing.JMenuItem();
        jmi_suppliersReport = new javax.swing.JMenuItem();
        jmi_productsReport = new javax.swing.JMenuItem();
        jmi_purchasesReport = new javax.swing.JMenuItem();
        jmi_salesReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 150, 136));

        jPanel.setBackground(new java.awt.Color(0, 150, 136));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jmb_menu.setBackground(new java.awt.Color(0, 121, 107));
        jmb_menu.setBorder(null);

        jm_options.setBackground(new java.awt.Color(0, 121, 107));
        jm_options.setBorder(null);
        jm_options.setForeground(new java.awt.Color(255, 255, 255));
        jm_options.setText("Opciones de tienda");
        jm_options.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_login.setBackground(new java.awt.Color(0, 121, 107));
        jmi_login.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_login.setForeground(new java.awt.Color(255, 255, 255));
        jmi_login.setText("Iniciar sesión");
        jmi_login.setBorder(null);
        jmi_login.setBorderPainted(false);
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jm_options.add(jmi_login);

        jmi_users.setBackground(new java.awt.Color(0, 121, 107));
        jmi_users.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_users.setForeground(new java.awt.Color(255, 255, 255));
        jmi_users.setText("Usuarios");
        jmi_users.setBorder(null);
        jmi_users.setBorderPainted(false);
        jmi_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_usersActionPerformed(evt);
            }
        });
        jm_options.add(jmi_users);

        jmi_exit.setBackground(new java.awt.Color(0, 121, 107));
        jmi_exit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_exit.setForeground(new java.awt.Color(255, 255, 255));
        jmi_exit.setText("Salir");
        jmi_exit.setBorder(null);
        jmi_exit.setBorderPainted(false);
        jm_options.add(jmi_exit);

        jmb_menu.add(jm_options);

        jm_catalog.setBackground(new java.awt.Color(0, 121, 107));
        jm_catalog.setBorder(null);
        jm_catalog.setForeground(new java.awt.Color(255, 255, 255));
        jm_catalog.setText("Catálogos");
        jm_catalog.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_customers.setBackground(new java.awt.Color(0, 121, 107));
        jmi_customers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_customers.setForeground(new java.awt.Color(255, 255, 255));
        jmi_customers.setText("Clientes");
        jmi_customers.setBorder(null);
        jmi_customers.setBorderPainted(false);
        jmi_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_customersActionPerformed(evt);
            }
        });
        jm_catalog.add(jmi_customers);

        jmi_suppliers.setBackground(new java.awt.Color(0, 121, 107));
        jmi_suppliers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_suppliers.setForeground(new java.awt.Color(255, 255, 255));
        jmi_suppliers.setText("Proveedores");
        jmi_suppliers.setBorder(null);
        jmi_suppliers.setBorderPainted(false);
        jmi_suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_suppliersActionPerformed(evt);
            }
        });
        jm_catalog.add(jmi_suppliers);

        jmi_products.setBackground(new java.awt.Color(0, 121, 107));
        jmi_products.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_products.setForeground(new java.awt.Color(255, 255, 255));
        jmi_products.setText("Productos");
        jmi_products.setBorder(null);
        jmi_products.setBorderPainted(false);
        jmi_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_productsActionPerformed(evt);
            }
        });
        jm_catalog.add(jmi_products);

        jmb_menu.add(jm_catalog);

        jm_operations.setBackground(new java.awt.Color(0, 121, 107));
        jm_operations.setBorder(null);
        jm_operations.setForeground(new java.awt.Color(255, 255, 255));
        jm_operations.setText("Operaciones");
        jm_operations.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_purchases.setBackground(new java.awt.Color(0, 121, 107));
        jmi_purchases.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_purchases.setForeground(new java.awt.Color(255, 255, 255));
        jmi_purchases.setText("Compras");
        jmi_purchases.setBorder(null);
        jmi_purchases.setBorderPainted(false);
        jmi_purchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_purchasesActionPerformed(evt);
            }
        });
        jm_operations.add(jmi_purchases);

        jmi_sales.setBackground(new java.awt.Color(0, 121, 107));
        jmi_sales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_sales.setForeground(new java.awt.Color(255, 255, 255));
        jmi_sales.setText("Ventas");
        jmi_sales.setBorder(null);
        jmi_sales.setBorderPainted(false);
        jmi_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salesActionPerformed(evt);
            }
        });
        jm_operations.add(jmi_sales);

        jmb_menu.add(jm_operations);

        jm_reports.setBackground(new java.awt.Color(0, 121, 107));
        jm_reports.setBorder(null);
        jm_reports.setForeground(new java.awt.Color(255, 255, 255));
        jm_reports.setText("Reportes");
        jm_reports.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_customersReport.setBackground(new java.awt.Color(0, 121, 107));
        jmi_customersReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_customersReport.setForeground(new java.awt.Color(255, 255, 255));
        jmi_customersReport.setText("Clientes");
        jmi_customersReport.setBorder(null);
        jmi_customersReport.setBorderPainted(false);
        jmi_customersReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_customersReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_customersReport);

        jmi_suppliersReport.setBackground(new java.awt.Color(0, 121, 107));
        jmi_suppliersReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_suppliersReport.setForeground(new java.awt.Color(255, 255, 255));
        jmi_suppliersReport.setText("Proveedores");
        jmi_suppliersReport.setBorder(null);
        jmi_suppliersReport.setBorderPainted(false);
        jmi_suppliersReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_suppliersReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_suppliersReport);

        jmi_productsReport.setBackground(new java.awt.Color(0, 121, 107));
        jmi_productsReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_productsReport.setForeground(new java.awt.Color(255, 255, 255));
        jmi_productsReport.setText("Productos");
        jmi_productsReport.setBorder(null);
        jmi_productsReport.setBorderPainted(false);
        jmi_productsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_productsReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_productsReport);

        jmi_purchasesReport.setBackground(new java.awt.Color(0, 121, 107));
        jmi_purchasesReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_purchasesReport.setForeground(new java.awt.Color(255, 255, 255));
        jmi_purchasesReport.setText("Compras");
        jmi_purchasesReport.setBorder(null);
        jmi_purchasesReport.setBorderPainted(false);
        jmi_purchasesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_purchasesReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_purchasesReport);

        jmi_salesReport.setBackground(new java.awt.Color(0, 121, 107));
        jmi_salesReport.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_salesReport.setForeground(new java.awt.Color(255, 255, 255));
        jmi_salesReport.setText("Ventas");
        jmi_salesReport.setBorder(null);
        jmi_salesReport.setBorderPainted(false);
        jmi_salesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salesReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_salesReport);

        jmb_menu.add(jm_reports);

        setJMenuBar(jmb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_customersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_customersActionPerformed

    private void jmi_suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_suppliersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_suppliersActionPerformed

    private void jmi_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_productsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_productsActionPerformed

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void jmi_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_usersActionPerformed

    private void jmi_purchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_purchasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_purchasesActionPerformed

    private void jmi_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_salesActionPerformed

    private void jmi_customersReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_customersReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_customersReportActionPerformed

    private void jmi_suppliersReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_suppliersReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_suppliersReportActionPerformed

    private void jmi_productsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_productsReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_productsReportActionPerformed

    private void jmi_purchasesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_purchasesReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_purchasesReportActionPerformed

    private void jmi_salesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salesReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_salesReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel;
    private javax.swing.JMenu jm_catalog;
    private javax.swing.JMenu jm_operations;
    private javax.swing.JMenu jm_options;
    private javax.swing.JMenu jm_reports;
    private javax.swing.JMenuBar jmb_menu;
    public javax.swing.JMenuItem jmi_customers;
    public javax.swing.JMenuItem jmi_customersReport;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_login;
    public javax.swing.JMenuItem jmi_products;
    public javax.swing.JMenuItem jmi_productsReport;
    public javax.swing.JMenuItem jmi_purchases;
    public javax.swing.JMenuItem jmi_purchasesReport;
    public javax.swing.JMenuItem jmi_sales;
    public javax.swing.JMenuItem jmi_salesReport;
    public javax.swing.JMenuItem jmi_suppliers;
    public javax.swing.JMenuItem jmi_suppliersReport;
    public javax.swing.JMenuItem jmi_users;
    // End of variables declaration//GEN-END:variables
}
