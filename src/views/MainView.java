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
        jmi_customers = new javax.swing.JMenuItem();
        jmi_suppliers = new javax.swing.JMenuItem();
        jmi_products = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();

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
        jm_options.add(jmi_customers);

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
        jm_options.add(jmi_suppliers);

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
        jm_options.add(jmi_products);

        jmi_exit.setBackground(new java.awt.Color(0, 121, 107));
        jmi_exit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_exit.setForeground(new java.awt.Color(255, 255, 255));
        jmi_exit.setText("Salir");
        jmi_exit.setBorder(null);
        jmi_exit.setBorderPainted(false);
        jm_options.add(jmi_exit);

        jmb_menu.add(jm_options);

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
    private javax.swing.JMenu jm_options;
    private javax.swing.JMenuBar jmb_menu;
    public javax.swing.JMenuItem jmi_customers;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_products;
    public javax.swing.JMenuItem jmi_suppliers;
    // End of variables declaration//GEN-END:variables
}
