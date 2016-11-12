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
public class SalesView extends javax.swing.JPanel {

    /**
     * Creates new form CustomersView
     */
    public SalesView() {
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
        jLabel2 = new javax.swing.JLabel();
        jtf_customerID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jb_findCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_salesTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_productID = new javax.swing.JTextField();
        jtf_product = new javax.swing.JTextField();
        jb_findProduct = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtf_saleCost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_quantity = new javax.swing.JTextField();
        jb_add = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtf_vat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_sub = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtf_total = new javax.swing.JTextField();
        jb_save = new javax.swing.JButton();
        jb_new = new javax.swing.JButton();

        setBackground(new java.awt.Color(63, 81, 181));

        jLabel1.setBackground(new java.awt.Color(0, 121, 107));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente");

        jtf_customerID.setBackground(new java.awt.Color(48, 63, 159));
        jtf_customerID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_customerID.setForeground(new java.awt.Color(255, 255, 255));
        jtf_customerID.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jtf_name.setBackground(new java.awt.Color(48, 63, 159));
        jtf_name.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_name.setForeground(new java.awt.Color(255, 255, 255));
        jtf_name.setBorder(null);

        jb_findCustomer.setBackground(new java.awt.Color(63, 81, 181));
        jb_findCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_user.png"))); // NOI18N
        jb_findCustomer.setBorder(null);
        jb_findCustomer.setBorderPainted(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jt_salesTable.setBackground(new java.awt.Color(48, 63, 159));
        jt_salesTable.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jt_salesTable.setForeground(new java.awt.Color(255, 255, 255));
        jt_salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Producto", "Precio de venta", "Cantidad", "Subtotal"
            }
        ));
        jt_salesTable.setGridColor(new java.awt.Color(63, 81, 181));
        jt_salesTable.setSelectionBackground(new java.awt.Color(0, 121, 107));
        jt_salesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jt_salesTable);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Producto");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Producto");

        jtf_productID.setBackground(new java.awt.Color(48, 63, 159));
        jtf_productID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_productID.setForeground(new java.awt.Color(255, 255, 255));
        jtf_productID.setBorder(null);

        jtf_product.setBackground(new java.awt.Color(48, 63, 159));
        jtf_product.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_product.setForeground(new java.awt.Color(255, 255, 255));
        jtf_product.setBorder(null);

        jb_findProduct.setBackground(new java.awt.Color(63, 81, 181));
        jb_findProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_product.png"))); // NOI18N
        jb_findProduct.setBorder(null);
        jb_findProduct.setBorderPainted(false);
        jb_findProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_findProductActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio de venta");

        jtf_saleCost.setBackground(new java.awt.Color(48, 63, 159));
        jtf_saleCost.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_saleCost.setForeground(new java.awt.Color(255, 255, 255));
        jtf_saleCost.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad");

        jtf_quantity.setBackground(new java.awt.Color(48, 63, 159));
        jtf_quantity.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_quantity.setForeground(new java.awt.Color(255, 255, 255));
        jtf_quantity.setBorder(null);

        jb_add.setBackground(new java.awt.Color(63, 81, 181));
        jb_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_product.png"))); // NOI18N
        jb_add.setBorder(null);
        jb_add.setBorderPainted(false);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IVA");

        jtf_vat.setBackground(new java.awt.Color(48, 63, 159));
        jtf_vat.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_vat.setForeground(new java.awt.Color(255, 255, 255));
        jtf_vat.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Subtotal");

        jtf_sub.setBackground(new java.awt.Color(48, 63, 159));
        jtf_sub.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_sub.setForeground(new java.awt.Color(255, 255, 255));
        jtf_sub.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total");

        jtf_total.setBackground(new java.awt.Color(48, 63, 159));
        jtf_total.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_total.setForeground(new java.awt.Color(255, 255, 255));
        jtf_total.setBorder(null);

        jb_save.setBackground(new java.awt.Color(48, 63, 159));
        jb_save.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jb_save.setForeground(new java.awt.Color(255, 255, 255));
        jb_save.setText("Cerrar venta");
        jb_save.setBorder(null);
        jb_save.setBorderPainted(false);

        jb_new.setBackground(new java.awt.Color(48, 63, 159));
        jb_new.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jb_new.setForeground(new java.awt.Color(255, 255, 255));
        jb_new.setText("Nueva venta");
        jb_new.setBorder(null);
        jb_new.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_saleCost))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_product))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_productID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_customerID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_name))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_quantity)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_findProduct)
                            .addComponent(jb_add)
                            .addComponent(jb_findCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_sub))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_vat, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jb_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jb_new, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_total)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtf_customerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jtf_productID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jtf_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_findCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_findProduct)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_new, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtf_saleCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb_add)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtf_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jtf_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_findProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_findProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_findProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_add;
    public javax.swing.JButton jb_findCustomer;
    public javax.swing.JButton jb_findProduct;
    public javax.swing.JButton jb_new;
    public javax.swing.JButton jb_save;
    public javax.swing.JTable jt_salesTable;
    public javax.swing.JTextField jtf_customerID;
    public javax.swing.JTextField jtf_name;
    public javax.swing.JTextField jtf_product;
    public javax.swing.JTextField jtf_productID;
    public javax.swing.JTextField jtf_quantity;
    public javax.swing.JTextField jtf_saleCost;
    public javax.swing.JTextField jtf_sub;
    public javax.swing.JTextField jtf_total;
    public javax.swing.JTextField jtf_vat;
    // End of variables declaration//GEN-END:variables
}
