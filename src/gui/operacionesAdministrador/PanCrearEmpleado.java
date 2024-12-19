package gui.operacionesAdministrador;

public class PanCrearEmpleado extends javax.swing.JPanel {

    public PanCrearEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        txtSueldo = new javax.swing.JTextField();
        txtTipoDocumento = new javax.swing.JTextField();
        txtFechaIncorporacion = new javax.swing.JTextField();
        txtNumeroDocumento = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContenedorNumeroDocumento = new javax.swing.JTextField();
        txtContenedorNombre = new javax.swing.JTextField();
        txtContenedoTipoDocumento = new javax.swing.JTextField();
        txtContenedorFechaIncorporacion = new javax.swing.JTextField();
        txtContenedorCargo = new javax.swing.JTextField();
        txtContenedorSueldo = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));

        txtSueldo.setBackground(new java.awt.Color(51, 51, 255));
        txtSueldo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSueldo.setText("Sueldo");
        panBlanco.add(txtSueldo);

        txtTipoDocumento.setBackground(new java.awt.Color(51, 51, 255));
        txtTipoDocumento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoDocumento.setText("Tipo de documento:");
        panBlanco.add(txtTipoDocumento);

        txtFechaIncorporacion.setBackground(new java.awt.Color(51, 51, 255));
        txtFechaIncorporacion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtFechaIncorporacion.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaIncorporacion.setText("Fecha incorporación:");
        panBlanco.add(txtFechaIncorporacion);

        txtNumeroDocumento.setBackground(new java.awt.Color(51, 51, 255));
        txtNumeroDocumento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtNumeroDocumento.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroDocumento.setText("Numero de documento");
        panBlanco.add(txtNumeroDocumento);

        txtCargo.setBackground(new java.awt.Color(51, 51, 255));
        txtCargo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(255, 255, 255));
        txtCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCargo.setText("Cargo");
        panBlanco.add(txtCargo);

        txtNombre.setBackground(new java.awt.Color(51, 51, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre:");
        panBlanco.add(txtNombre);

        txtContenedorNumeroDocumento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedorNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedorNumeroDocumentoActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedorNumeroDocumento);

        txtContenedorNombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedorNombreActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedorNombre);

        txtContenedoTipoDocumento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedoTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedoTipoDocumentoActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedoTipoDocumento);

        txtContenedorFechaIncorporacion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedorFechaIncorporacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedorFechaIncorporacionActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedorFechaIncorporacion);

        txtContenedorCargo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedorCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedorCargoActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedorCargo);

        txtContenedorSueldo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtContenedorSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContenedorSueldoActionPerformed(evt);
            }
        });
        panBlanco.add(txtContenedorSueldo);

        btnCrear.setBackground(new java.awt.Color(51, 51, 255));
        btnCrear.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24-em-plus.png"))); // NOI18N
        btnCrear.setText("Crear empleado");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panBlanco.add(btnCrear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtContenedorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContenedorNombreActionPerformed

    private void txtContenedoTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedoTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContenedoTipoDocumentoActionPerformed

    private void txtContenedorNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedorNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContenedorNumeroDocumentoActionPerformed

    private void txtContenedorFechaIncorporacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedorFechaIncorporacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContenedorFechaIncorporacionActionPerformed

    private void txtContenedorCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedorCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContenedorCargoActionPerformed

    private void txtContenedorSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContenedorSueldoActionPerformed
        // TODO add your handling code here:
    }
	
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtContenedoTipoDocumento;
    private javax.swing.JTextField txtContenedorCargo;
    private javax.swing.JTextField txtContenedorFechaIncorporacion;
    private javax.swing.JTextField txtContenedorNombre;
    private javax.swing.JTextField txtContenedorNumeroDocumento;
    private javax.swing.JTextField txtContenedorSueldo;
    private javax.swing.JTextField txtFechaIncorporacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTipoDocumento;
}
