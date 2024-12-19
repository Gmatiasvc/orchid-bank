package gui.operacionesUsuario;

public class PanChequesEmision extends javax.swing.JPanel {

    public PanChequesEmision() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panNumeroCheque = new javax.swing.JPanel();
        lblNumeroCheque = new javax.swing.JLabel();
        txtNumeroCheque = new javax.swing.JTextField();
        panImporte = new javax.swing.JPanel();
        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        panNombreDestinatario = new javax.swing.JPanel();
        lblNombreDestinatario = new javax.swing.JLabel();
        txtNombreDestinatario = new javax.swing.JTextField();
        panNumeroCuenta = new javax.swing.JPanel();
        lblNumeroCuenta = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 710));
        jPanel1.setRequestFocusEnabled(false);

        lblNumeroCheque.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCheque.setText("NUMERO DE CHEQUE");
        lblNumeroCheque.setAlignmentX(0.5F);
        lblNumeroCheque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumeroCheque.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCheque.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCheque.setText("Ingrese el numero de cheque");
        txtNumeroCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroChequeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroChequeLayout = new javax.swing.GroupLayout(panNumeroCheque);
        panNumeroCheque.setLayout(panNumeroChequeLayout);
        panNumeroChequeLayout.setHorizontalGroup(
            panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCheque)
                .addContainerGap())
        );
        panNumeroChequeLayout.setVerticalGroup(
            panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNumeroChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblNumeroCheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(panNumeroCheque);

        lblImporte.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblImporte.setText("IMPORTE");
        lblImporte.setAlignmentX(0.5F);
        lblImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtImporte.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(204, 204, 204));
        txtImporte.setText("Ingrese el importe");
        txtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panImporteLayout = new javax.swing.GroupLayout(panImporte);
        panImporte.setLayout(panImporteLayout);
        panImporteLayout.setHorizontalGroup(
            panImporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panImporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );
        panImporteLayout.setVerticalGroup(
            panImporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panImporteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panImporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(panImporte);

        lblNombreDestinatario.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNombreDestinatario.setText("NOMBRE DEL DESTINATARIO");
        lblNombreDestinatario.setAlignmentX(0.5F);
        lblNombreDestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombreDestinatario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombreDestinatario.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreDestinatario.setText("Ingrese el nombre del destinatario");
        txtNombreDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNombreDestinatarioLayout = new javax.swing.GroupLayout(panNombreDestinatario);
        panNombreDestinatario.setLayout(panNombreDestinatarioLayout);
        panNombreDestinatarioLayout.setHorizontalGroup(
            panNombreDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNombreDestinatarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDestinatario)
                .addContainerGap())
        );
        panNombreDestinatarioLayout.setVerticalGroup(
            panNombreDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNombreDestinatarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panNombreDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblNombreDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(panNombreDestinatario);

        lblNumeroCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCuenta.setText("NUMERO DE CUENTA");
        lblNumeroCuenta.setAlignmentX(0.5F);
        lblNumeroCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumeroCuenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCuenta.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCuenta.setText("Ingrese el numero de cuenta");
        txtNumeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroCuentaLayout = new javax.swing.GroupLayout(panNumeroCuenta);
        panNumeroCuenta.setLayout(panNumeroCuentaLayout);
        panNumeroCuentaLayout.setHorizontalGroup(
            panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCuenta)
                .addContainerGap())
        );
        panNumeroCuentaLayout.setVerticalGroup(
            panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panNumeroCuenta);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear cheque");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroChequeActionPerformed

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteActionPerformed

    private void txtNombreDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDestinatarioActionPerformed

    private void txtNumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblNombreDestinatario;
    private javax.swing.JLabel lblNumeroCheque;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JPanel panImporte;
    private javax.swing.JPanel panNombreDestinatario;
    private javax.swing.JPanel panNumeroCheque;
    private javax.swing.JPanel panNumeroCuenta;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNombreDestinatario;
    private javax.swing.JTextField txtNumeroCheque;
    private javax.swing.JTextField txtNumeroCuenta;
}