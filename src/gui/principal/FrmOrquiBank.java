package gui.principal;

import java.awt.BorderLayout;

public class FrmOrquiBank extends javax.swing.JFrame {

    public FrmOrquiBank() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        panAzul = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        btnUsuario = new java.awt.Button();
        btnAdministrador = new java.awt.Button();
        btnEmpleado = new java.awt.Button();
        txtInicioSecion = new javax.swing.JTextField();
        lblOrquibank = new javax.swing.JLabel();
        panContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1440, 960));

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setForeground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1440, 960));

        panAzul.setBackground(new java.awt.Color(51, 51, 255));
        panAzul.setPreferredSize(new java.awt.Dimension(300, 960));

        lblUsuario.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");
        lblUsuario.setPreferredSize(new java.awt.Dimension(148, 48));

        lblEmpleado.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado.setText("Empleado");

        lblAdministrador.setFont(new java.awt.Font("Roboto", 0, 32)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrador.setText("Administrador");

        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setPreferredSize(new java.awt.Dimension(40, 40));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnAdministrador.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        txtInicioSecion.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        txtInicioSecion.setForeground(new java.awt.Color(0, 51, 255));
        txtInicioSecion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicioSecion.setText("Iniciar Sesión");
        txtInicioSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioSecionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAzulLayout = new javax.swing.GroupLayout(panAzul);
        panAzul.setLayout(panAzulLayout);
        panAzulLayout.setHorizontalGroup(
            panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAzulLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInicioSecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panAzulLayout.createSequentialGroup()
                        .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panAzulLayout.createSequentialGroup()
                        .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpleado))
                    .addGroup(panAzulLayout.createSequentialGroup()
                        .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdministrador)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panAzulLayout.setVerticalGroup(
            panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAzulLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtInicioSecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(263, 263, 263)
                .addGroup(panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(panAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdministrador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(156, 156, 156))
        );

        lblOrquibank.setBackground(new java.awt.Color(255, 255, 255));
        lblOrquibank.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblOrquibank.setForeground(new java.awt.Color(0, 51, 255));
        lblOrquibank.setText("OrquiBank");

        panContenido.setBackground(new java.awt.Color(255, 255, 255));
        panContenido.setPreferredSize(new java.awt.Dimension(1140, 784));

        javax.swing.GroupLayout panContenidoLayout = new javax.swing.GroupLayout(panContenido);
        panContenido.setLayout(panContenidoLayout);
        panContenidoLayout.setHorizontalGroup(
            panContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        panContenidoLayout.setVerticalGroup(
            panContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBlancoLayout = new javax.swing.GroupLayout(panBlanco);
        panBlanco.setLayout(panBlancoLayout);
        panBlancoLayout.setHorizontalGroup(
            panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBlancoLayout.createSequentialGroup()
                .addComponent(panAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBlancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBlancoLayout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(lblOrquibank)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panBlancoLayout.setVerticalGroup(
            panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBlancoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblOrquibank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panBlanco);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        PanEmpleado panEmpleado = new PanEmpleado();
        panEmpleado.setSize(1127,784);
        panEmpleado.setLocation(0,0);
        
        panContenido.removeAll();
        panContenido.add(panEmpleado,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
        
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        PanAdministrador panAdministrador = new PanAdministrador();
        panAdministrador.setSize(1127,784);
        panAdministrador.setLocation(0,0);
        
        panContenido.removeAll();
        panContenido.add(panAdministrador,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        PanUsuario panUsuario = new PanUsuario();
        panUsuario.setSize(1127,784);
        panUsuario.setLocation(0,0);
        
        panContenido.removeAll();
        panContenido.add(panUsuario,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void txtInicioSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioSecionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioSecionActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new FrmOrquiBank().setVisible(true);
    });
}


    private java.awt.Button btnAdministrador;
    private java.awt.Button btnEmpleado;
    private java.awt.Button btnUsuario;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblOrquibank;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panAzul;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JPanel panContenido;
    private javax.swing.JTextField txtInicioSecion;
}
