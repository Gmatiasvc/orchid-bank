package gui.principal;

import gui.operacionesAdministrador.PanListaUsuarios;
import gui.operacionesEmpleado.PamCrearUsuario;
import gui.operacionesEmpleado.PanInformacionCuenta;
import gui.operacionesEmpleado.PamMovimientos;
import java.awt.BorderLayout;

public class FrmVentanaPrincipalEmpleado extends javax.swing.JFrame {
    
    private final javax.swing.ButtonGroup buttonGroupOpciones;

    public FrmVentanaPrincipalEmpleado() {
        initComponents();
        buttonGroupOpciones = new javax.swing.ButtonGroup();
        buttonGroupOpciones.add(jrbCrearUsuario);
        buttonGroupOpciones.add(jrbInformacionCuenta);
        buttonGroupOpciones.add(jrbMovimientos);
        buttonGroupOpciones.add(jrbListaUsuarios);
    }
    
    private void cargarPanel(javax.swing.JPanel panel) {
    panel.setSize(1100, 576);
    panel.setLocation(0, 0);

    panContenido.removeAll();
    panContenido.add(panel, BorderLayout.CENTER);
    panContenido.revalidate();
    panContenido.repaint();
    }
    

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        panOpciones = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        jrbInformacionCuenta = new javax.swing.JRadioButton();
        jrbCrearUsuario = new javax.swing.JRadioButton();
        jrbMovimientos = new javax.swing.JRadioButton();
        jrbListaUsuarios = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        panContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setMinimumSize(new java.awt.Dimension(1127, 960));
        panBlanco.setPreferredSize(new java.awt.Dimension(1440, 960));

        panOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panOpciones.setPreferredSize(new java.awt.Dimension(300, 960));

        lblEmpleado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 51, 255));
        lblEmpleado.setText("Menu");

        jrbInformacionCuenta.setBackground(new java.awt.Color(0, 51, 255));
        jrbInformacionCuenta.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbInformacionCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jrbInformacionCuenta.setText("Informacion de cuenta");
        jrbInformacionCuenta.setToolTipText("");
        jrbInformacionCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbInformacionCuenta.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbInformacionCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInformacionCuentaActionPerformed(evt);
            }
        });

        jrbCrearUsuario.setBackground(new java.awt.Color(0, 51, 255));
        jrbCrearUsuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jrbCrearUsuario.setText("Crear cuenta");
        jrbCrearUsuario.setToolTipText("");
        jrbCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbCrearUsuario.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCrearUsuarioActionPerformed(evt);
            }
        });

        jrbMovimientos.setBackground(new java.awt.Color(0, 51, 255));
        jrbMovimientos.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbMovimientos.setForeground(new java.awt.Color(255, 255, 255));
        jrbMovimientos.setText("Movimientos");
        jrbMovimientos.setToolTipText("");
        jrbMovimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbMovimientos.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMovimientosActionPerformed(evt);
            }
        });

        jrbListaUsuarios.setBackground(new java.awt.Color(0, 51, 255));
        jrbListaUsuarios.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jrbListaUsuarios.setText("Usuarios");
        jrbListaUsuarios.setToolTipText("");
        jrbListaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbListaUsuarios.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbListaUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblEmpleado))
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbInformacionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jrbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jrbListaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblEmpleado)
                .addGap(70, 70, 70)
                .addComponent(jrbInformacionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        panBlanco.add(panOpciones);

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panBlanco.add(btnSalir);

        panContenido.setBackground(new java.awt.Color(255, 255, 255));

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

        panBlanco.add(panContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jrbCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCrearUsuarioActionPerformed
        cargarPanel(new PamCrearUsuario());
    }//GEN-LAST:event_jrbCrearUsuarioActionPerformed

    private void jrbMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMovimientosActionPerformed
        cargarPanel(new PamMovimientos());
    }//GEN-LAST:event_jrbMovimientosActionPerformed

    private void jrbInformacionCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInformacionCuentaActionPerformed
        cargarPanel(new PanInformacionCuenta());
    }//GEN-LAST:event_jrbInformacionCuentaActionPerformed

    private void jrbListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbListaUsuariosActionPerformed
    cargarPanel(new PanListaUsuarios());
    }//GEN-LAST:event_jrbListaUsuariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       FrmOrquiBank returnOrquiBank = new FrmOrquiBank();
       returnOrquiBank.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmVentanaPrincipalEmpleado().setVisible(true);
        });
    }

    private javax.swing.JButton btnSalir;
    private javax.swing.JRadioButton jrbCrearUsuario;
    private javax.swing.JRadioButton jrbInformacionCuenta;
    private javax.swing.JRadioButton jrbListaUsuarios;
    private javax.swing.JRadioButton jrbMovimientos;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JPanel panContenido;
    private javax.swing.JPanel panOpciones;
}
