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
public class PurchasesReportView extends javax.swing.JPanel {

    /**
     * Creates new form CustomersView
     */
    public PurchasesReportView() {
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

        jLabel1 = new javax.swing.JLabel();
        jb_report = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcb_suppliers = new javax.swing.JComboBox<>();
        jb_findSupplier = new javax.swing.JButton();
        jb_supplierPurchases = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcb_products = new javax.swing.JComboBox<>();
        jb_findProduct = new javax.swing.JButton();
        jb_productPurchases = new javax.swing.JButton();
        jb_allPurchases = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_purchasesTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(63, 81, 181));

        jLabel1.setBackground(new java.awt.Color(0, 121, 107));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTE DE COMPRAS");

        jb_report.setBackground(new java.awt.Color(48, 63, 159));
        jb_report.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jb_report.setForeground(new java.awt.Color(255, 255, 255));
        jb_report.setText("VER REPORTE");
        jb_report.setBorder(null);
        jb_report.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jcb_suppliers.setBackground(new java.awt.Color(48, 63, 159));
        jcb_suppliers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jcb_suppliers.setForeground(new java.awt.Color(255, 255, 255));
        jcb_suppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rubi", "Sergio", "Alessandra", "Oswaldo", "Sarah" }));
        jcb_suppliers.setBorder(null);
        jcb_suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_suppliersActionPerformed(evt);
            }
        });

        jb_findSupplier.setBackground(new java.awt.Color(48, 63, 159));
        jb_findSupplier.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jb_findSupplier.setForeground(new java.awt.Color(255, 255, 255));
        jb_findSupplier.setText("Buscar");
        jb_findSupplier.setBorder(null);
        jb_findSupplier.setBorderPainted(false);

        jb_supplierPurchases.setBackground(new java.awt.Color(48, 63, 159));
        jb_supplierPurchases.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jb_supplierPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jb_supplierPurchases.setText("PROVEEDORES");
        jb_supplierPurchases.setBorder(null);
        jb_supplierPurchases.setBorderPainted(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto");

        jcb_products.setBackground(new java.awt.Color(48, 63, 159));
        jcb_products.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jcb_products.setForeground(new java.awt.Color(255, 255, 255));
        jcb_products.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate", "Cereal", "Galletas", "Pasta", "Atún" }));
        jcb_products.setBorder(null);
        jcb_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_productsActionPerformed(evt);
            }
        });

        jb_findProduct.setBackground(new java.awt.Color(48, 63, 159));
        jb_findProduct.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jb_findProduct.setForeground(new java.awt.Color(255, 255, 255));
        jb_findProduct.setText("Buscar");
        jb_findProduct.setBorder(null);
        jb_findProduct.setBorderPainted(false);

        jb_productPurchases.setBackground(new java.awt.Color(48, 63, 159));
        jb_productPurchases.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jb_productPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jb_productPurchases.setText("PRODUCTOS");
        jb_productPurchases.setBorder(null);
        jb_productPurchases.setBorderPainted(false);
        jb_productPurchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_productPurchasesActionPerformed(evt);
            }
        });

        jb_allPurchases.setBackground(new java.awt.Color(48, 63, 159));
        jb_allPurchases.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jb_allPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jb_allPurchases.setText("TODAS");
        jb_allPurchases.setBorder(null);
        jb_allPurchases.setBorderPainted(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jt_purchasesTable.setBackground(new java.awt.Color(48, 63, 159));
        jt_purchasesTable.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jt_purchasesTable.setForeground(new java.awt.Color(255, 255, 255));
        jt_purchasesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Compras de la tienda"
            }
        ));
        jt_purchasesTable.setGridColor(new java.awt.Color(63, 81, 181));
        jt_purchasesTable.setSelectionBackground(new java.awt.Color(48, 63, 159));
        jt_purchasesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jt_purchasesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addComponent(jb_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_allPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcb_products, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_findProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_productPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_findSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_supplierPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_findSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_supplierPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_findProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_productPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_allPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_report, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_suppliersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_suppliersActionPerformed

    private void jcb_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_productsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_productsActionPerformed

    private void jb_productPurchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_productPurchasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_productPurchasesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_allPurchases;
    public javax.swing.JButton jb_findProduct;
    public javax.swing.JButton jb_findSupplier;
    public javax.swing.JButton jb_productPurchases;
    public javax.swing.JButton jb_report;
    public javax.swing.JButton jb_supplierPurchases;
    public javax.swing.JComboBox<String> jcb_products;
    public javax.swing.JComboBox<String> jcb_suppliers;
    public javax.swing.JTable jt_purchasesTable;
    // End of variables declaration//GEN-END:variables
}