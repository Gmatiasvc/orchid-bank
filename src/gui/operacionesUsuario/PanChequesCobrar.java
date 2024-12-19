package gui.operacionesUsuario;

public class PanChequesCobrar extends javax.swing.JPanel {

    public PanChequesCobrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panNumeroCuentaBeneficiario = new javax.swing.JPanel();
        panNumeroCheque = new javax.swing.JPanel();
        lblNumeroCheque = new javax.swing.JLabel();
        txtNumeroCheque = new javax.swing.JTextField();
        panImporte = new javax.swing.JPanel();
        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        panNombreEmisor = new javax.swing.JPanel();
        lblNombreEmisor = new javax.swing.JLabel();
        txtNombreEmisor = new javax.swing.JTextField();
        panNumeroCuenta = new javax.swing.JPanel();
        lblNumeroCuentaBeneficiario = new javax.swing.JLabel();
        txtNumeroCuentaBeneficiario = new javax.swing.JTextField();
        panNumeroCuentaLibrador = new javax.swing.JPanel();
        lblNumeroCuentaLibrador = new javax.swing.JLabel();
        txtNumeroCuentaLibrador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 710));

        panNumeroCuentaBeneficiario.setBackground(new java.awt.Color(255, 255, 255));
        panNumeroCuentaBeneficiario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panNumeroCuentaBeneficiario.setMinimumSize(new java.awt.Dimension(0, 0));
        panNumeroCuentaBeneficiario.setPreferredSize(new java.awt.Dimension(1100, 710));
        panNumeroCuentaBeneficiario.setRequestFocusEnabled(false);

        panNumeroCheque.setRequestFocusEnabled(false);

        lblNumeroCheque.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCheque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
                .addComponent(txtNumeroCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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

        panNumeroCuentaBeneficiario.add(panNumeroCheque);

        lblImporte.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblImporte.setText("IMPORTE A COBRAR");
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
                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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

        panNumeroCuentaBeneficiario.add(panImporte);

        lblNombreEmisor.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNombreEmisor.setText("NOMBRE DEL EMISOR");
        lblNombreEmisor.setAlignmentX(0.5F);
        lblNombreEmisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombreEmisor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombreEmisor.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreEmisor.setText("Ingrese el nombre del destinatario");
        txtNombreEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNombreEmisorLayout = new javax.swing.GroupLayout(panNombreEmisor);
        panNombreEmisor.setLayout(panNombreEmisorLayout);
        panNombreEmisorLayout.setHorizontalGroup(
            panNombreEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNombreEmisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panNombreEmisorLayout.setVerticalGroup(
            panNombreEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNombreEmisorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panNombreEmisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblNombreEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panNumeroCuentaBeneficiario.add(panNombreEmisor);

        lblNumeroCuentaBeneficiario.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCuentaBeneficiario.setText(" NUMERO DE CUENTA DELBENEFICIARIO");
        lblNumeroCuentaBeneficiario.setToolTipText("");
        lblNumeroCuentaBeneficiario.setAlignmentX(0.5F);
        lblNumeroCuentaBeneficiario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNumeroCuentaBeneficiario.setMaximumSize(new java.awt.Dimension(328, 22));
        lblNumeroCuentaBeneficiario.setMinimumSize(new java.awt.Dimension(328, 22));
        lblNumeroCuentaBeneficiario.setPreferredSize(new java.awt.Dimension(328, 22));

        txtNumeroCuentaBeneficiario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCuentaBeneficiario.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCuentaBeneficiario.setText("Ingrese el numero de cuenta");
        txtNumeroCuentaBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaBeneficiarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroCuentaLayout = new javax.swing.GroupLayout(panNumeroCuenta);
        panNumeroCuenta.setLayout(panNumeroCuentaLayout);
        panNumeroCuentaLayout.setHorizontalGroup(
            panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCuentaBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCuentaBeneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panNumeroCuentaLayout.setVerticalGroup(
            panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNumeroCuentaBeneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroCuentaBeneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panNumeroCuentaBeneficiario.add(panNumeroCuenta);

        lblNumeroCuentaLibrador.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCuentaLibrador.setText("NUMERO DE CUENTA DEL LIBRADOR");
        lblNumeroCuentaLibrador.setAlignmentX(0.5F);
        lblNumeroCuentaLibrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumeroCuentaLibrador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCuentaLibrador.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCuentaLibrador.setText("Ingrese el numero de cuenta");
        txtNumeroCuentaLibrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaLibradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroCuentaLibradorLayout = new javax.swing.GroupLayout(panNumeroCuentaLibrador);
        panNumeroCuentaLibrador.setLayout(panNumeroCuentaLibradorLayout);
        panNumeroCuentaLibradorLayout.setHorizontalGroup(
            panNumeroCuentaLibradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLibradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCuentaLibrador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCuentaLibrador, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panNumeroCuentaLibradorLayout.setVerticalGroup(
            panNumeroCuentaLibradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroCuentaLibradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroCuentaLibradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNumeroCuentaLibrador, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblNumeroCuentaLibrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panNumeroCuentaBeneficiario.add(panNumeroCuentaLibrador);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cobrar cheque");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panNumeroCuentaBeneficiario.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panNumeroCuentaBeneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panNumeroCuentaBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroChequeActionPerformed

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteActionPerformed

    private void txtNombreEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmisorActionPerformed

    private void txtNumeroCuentaBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaBeneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaBeneficiarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumeroCuentaLibradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaLibradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaLibradorActionPerformed

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblNombreEmisor;
    private javax.swing.JLabel lblNumeroCheque;
    private javax.swing.JLabel lblNumeroCuentaBeneficiario;
    private javax.swing.JLabel lblNumeroCuentaLibrador;
    private javax.swing.JPanel panImporte;
    private javax.swing.JPanel panNombreEmisor;
    private javax.swing.JPanel panNumeroCheque;
    private javax.swing.JPanel panNumeroCuenta;
    private javax.swing.JPanel panNumeroCuentaBeneficiario;
    private javax.swing.JPanel panNumeroCuentaLibrador;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNombreEmisor;
    private javax.swing.JTextField txtNumeroCheque;
    private javax.swing.JTextField txtNumeroCuentaBeneficiario;
    private javax.swing.JTextField txtNumeroCuentaLibrador;
}
