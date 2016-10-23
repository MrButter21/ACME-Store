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
public class ProductsView extends javax.swing.JPanel {

    /**
     * Creates new form CustomersView
     */
    public ProductsView() {
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
        jtf_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_product = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_description = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_purchaseCost = new javax.swing.JTextField();
        jtf_saleCost = new javax.swing.JTextField();
        jtf_stock = new javax.swing.JTextField();
        jb_add = new javax.swing.JButton();
        jb_remove = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jb_find = new javax.swing.JButton();
        jb_first = new javax.swing.JButton();
        jb_previous = new javax.swing.JButton();
        jb_next = new javax.swing.JButton();
        jb_last = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_productsTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 121, 107));

        jLabel1.setBackground(new java.awt.Color(0, 121, 107));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Producto");

        jtf_id.setBackground(new java.awt.Color(0, 150, 136));
        jtf_id.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_id.setForeground(new java.awt.Color(255, 255, 255));
        jtf_id.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto");

        jtf_product.setBackground(new java.awt.Color(0, 150, 136));
        jtf_product.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_product.setForeground(new java.awt.Color(255, 255, 255));
        jtf_product.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción");

        jtf_description.setBackground(new java.awt.Color(0, 150, 136));
        jtf_description.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_description.setForeground(new java.awt.Color(255, 255, 255));
        jtf_description.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio de compra");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio de venta");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Existencias");

        jtf_purchaseCost.setBackground(new java.awt.Color(0, 150, 136));
        jtf_purchaseCost.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_purchaseCost.setForeground(new java.awt.Color(255, 255, 255));
        jtf_purchaseCost.setBorder(null);

        jtf_saleCost.setBackground(new java.awt.Color(0, 150, 136));
        jtf_saleCost.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_saleCost.setForeground(new java.awt.Color(255, 255, 255));
        jtf_saleCost.setBorder(null);

        jtf_stock.setBackground(new java.awt.Color(0, 150, 136));
        jtf_stock.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_stock.setForeground(new java.awt.Color(255, 255, 255));
        jtf_stock.setBorder(null);

        jb_add.setBackground(new java.awt.Color(0, 121, 107));
        jb_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_user.png"))); // NOI18N
        jb_add.setBorder(null);
        jb_add.setBorderPainted(false);

        jb_remove.setBackground(new java.awt.Color(0, 121, 107));
        jb_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove_user.png"))); // NOI18N
        jb_remove.setBorder(null);
        jb_remove.setBorderPainted(false);

        jb_edit.setBackground(new java.awt.Color(0, 121, 107));
        jb_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_user.png"))); // NOI18N
        jb_edit.setBorder(null);
        jb_edit.setBorderPainted(false);

        jb_find.setBackground(new java.awt.Color(0, 121, 107));
        jb_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_user.png"))); // NOI18N
        jb_find.setBorder(null);
        jb_find.setBorderPainted(false);

        jb_first.setBackground(new java.awt.Color(0, 121, 107));
        jb_first.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/first.png"))); // NOI18N
        jb_first.setBorder(null);
        jb_first.setBorderPainted(false);

        jb_previous.setBackground(new java.awt.Color(0, 121, 107));
        jb_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/previous.png"))); // NOI18N
        jb_previous.setBorder(null);
        jb_previous.setBorderPainted(false);
        jb_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_previousActionPerformed(evt);
            }
        });

        jb_next.setBackground(new java.awt.Color(0, 121, 107));
        jb_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next.png"))); // NOI18N
        jb_next.setBorder(null);
        jb_next.setBorderPainted(false);
        jb_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nextActionPerformed(evt);
            }
        });

        jb_last.setBackground(new java.awt.Color(0, 121, 107));
        jb_last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/last.png"))); // NOI18N
        jb_last.setBorder(null);
        jb_last.setBorderPainted(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jt_productsTable.setBackground(new java.awt.Color(0, 150, 136));
        jt_productsTable.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jt_productsTable.setForeground(new java.awt.Color(255, 255, 255));
        jt_productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Descripcion", "$ Compra", "$ Venta", "Stock"
            }
        ));
        jt_productsTable.setGridColor(new java.awt.Color(0, 121, 107));
        jt_productsTable.setSelectionBackground(new java.awt.Color(0, 121, 107));
        jt_productsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jt_productsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_first)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_previous))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_product)
                                            .addComponent(jtf_description))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_purchaseCost))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_saleCost))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jb_next)
                                .addGap(165, 165, 165)
                                .addComponent(jb_last))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_stock)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_add)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_remove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_edit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jb_find))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jtf_purchaseCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jtf_saleCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jtf_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jtf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_remove))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_find)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_first)
                    .addComponent(jb_previous)
                    .addComponent(jb_next)
                    .addComponent(jb_last))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_previousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_previousActionPerformed

    private void jb_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_nextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_add;
    public javax.swing.JButton jb_edit;
    public javax.swing.JButton jb_find;
    public javax.swing.JButton jb_first;
    public javax.swing.JButton jb_last;
    public javax.swing.JButton jb_next;
    public javax.swing.JButton jb_previous;
    public javax.swing.JButton jb_remove;
    public javax.swing.JTable jt_productsTable;
    public javax.swing.JTextField jtf_description;
    public javax.swing.JTextField jtf_id;
    public javax.swing.JTextField jtf_product;
    public javax.swing.JTextField jtf_purchaseCost;
    public javax.swing.JTextField jtf_saleCost;
    public javax.swing.JTextField jtf_stock;
    // End of variables declaration//GEN-END:variables
}