package gui.operacionesUsuario;

public class PamRetirar extends javax.swing.JPanel {

    public PamRetirar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        lblImporteRetiro = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtImporteRetirar = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));

        lblImporteRetiro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblImporteRetiro.setForeground(new java.awt.Color(51, 51, 255));
        lblImporteRetiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImporteRetiro.setText("Importe a retirar :");
        panBlanco.add(lblImporteRetiro);

        lblcontraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(51, 51, 255));
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontraseña.setText("Contraseña :");
        panBlanco.add(lblcontraseña);
        panBlanco.add(txtImporteRetirar);
        panBlanco.add(txtContraseña);

        btnRetirar.setBackground(new java.awt.Color(51, 51, 255));
        btnRetirar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.gif"))); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        panBlanco.add(btnRetirar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
    }
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel lblImporteRetiro;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtImporteRetirar;
}
