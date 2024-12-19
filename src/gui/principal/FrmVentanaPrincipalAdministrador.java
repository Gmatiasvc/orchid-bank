
package gui.principal;

import gui.operacionesAdministrador.PanCrearEmpleado;
import gui.operacionesAdministrador.PanInformacionCuenta;
import gui.operacionesAdministrador.PanListaEmpleados;
import gui.operacionesAdministrador.PanListaUsuarios;
import gui.operacionesAdministrador.PanMovimientos;
import java.awt.BorderLayout;


public class FrmVentanaPrincipalAdministrador extends javax.swing.JFrame {
    
    private final javax.swing.ButtonGroup buttonGroupOpciones;
    public FrmVentanaPrincipalAdministrador() {
        initComponents();
        
        buttonGroupOpciones = new javax.swing.ButtonGroup();
        buttonGroupOpciones.add(jrbCrearEmpleado);
        buttonGroupOpciones.add(jrbListaEmpleado);
        buttonGroupOpciones.add(jrbClientesRegistrados);
        buttonGroupOpciones.add(jrbInformacionCuenta);
        buttonGroupOpciones.add(jrbMovimientos);
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
        lblAdministrador = new javax.swing.JLabel();
        jrbCrearEmpleado = new javax.swing.JRadioButton();
        jrbListaEmpleado = new javax.swing.JRadioButton();
        jrbClientesRegistrados = new javax.swing.JRadioButton();
        jrbInformacionCuenta = new javax.swing.JRadioButton();
        jrbMovimientos = new javax.swing.JRadioButton();
        panContenido = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1440, 960));

        panOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panOpciones.setPreferredSize(new java.awt.Dimension(300, 960));

        lblAdministrador.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(0, 51, 255));
        lblAdministrador.setText("Menu");

        jrbCrearEmpleado.setBackground(new java.awt.Color(0, 51, 255));
        jrbCrearEmpleado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbCrearEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jrbCrearEmpleado.setText("Crear empleado");
        jrbCrearEmpleado.setToolTipText("");
        jrbCrearEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbCrearEmpleado.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCrearEmpleadoActionPerformed(evt);
            }
        });

        jrbListaEmpleado.setBackground(new java.awt.Color(0, 51, 255));
        jrbListaEmpleado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbListaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jrbListaEmpleado.setText("Lista empleados");
        jrbListaEmpleado.setToolTipText("");
        jrbListaEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbListaEmpleado.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbListaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbListaEmpleadoActionPerformed(evt);
            }
        });

        jrbClientesRegistrados.setBackground(new java.awt.Color(0, 51, 255));
        jrbClientesRegistrados.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbClientesRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        jrbClientesRegistrados.setText("Clientes registrados");
        jrbClientesRegistrados.setToolTipText("");
        jrbClientesRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbClientesRegistrados.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbClientesRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbClientesRegistradosActionPerformed(evt);
            }
        });

        jrbInformacionCuenta.setBackground(new java.awt.Color(0, 51, 255));
        jrbInformacionCuenta.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jrbInformacionCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jrbInformacionCuenta.setText("Informacion cuenta");
        jrbInformacionCuenta.setToolTipText("");
        jrbInformacionCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbInformacionCuenta.setPreferredSize(new java.awt.Dimension(240, 40));
        jrbInformacionCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInformacionCuentaActionPerformed(evt);
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

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbInformacionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbClientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbListaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblAdministrador)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblAdministrador)
                .addGap(57, 57, 57)
                .addComponent(jrbInformacionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbListaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbClientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(523, Short.MAX_VALUE))
        );

        panBlanco.add(panOpciones);

        panContenido.setBackground(new java.awt.Color(255, 255, 255));
        panContenido.setPreferredSize(new java.awt.Dimension(1140, 784));
        panContenido.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCrearEmpleadoActionPerformed
        cargarPanel(new PanCrearEmpleado());
    }//GEN-LAST:event_jrbCrearEmpleadoActionPerformed

    private void jrbListaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbListaEmpleadoActionPerformed
        cargarPanel(new PanListaEmpleados());
    }//GEN-LAST:event_jrbListaEmpleadoActionPerformed

    private void jrbClientesRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbClientesRegistradosActionPerformed
      cargarPanel(new PanListaUsuarios());
    }//GEN-LAST:event_jrbClientesRegistradosActionPerformed

    private void jrbInformacionCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInformacionCuentaActionPerformed
       cargarPanel(new PanInformacionCuenta());
    }//GEN-LAST:event_jrbInformacionCuentaActionPerformed

    private void jrbMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMovimientosActionPerformed
       cargarPanel(new PanMovimientos());
    }//GEN-LAST:event_jrbMovimientosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmVentanaPrincipalAdministrador().setVisible(true);
        });
    }

    private javax.swing.JButton btnSalir;
    private javax.swing.JRadioButton jrbClientesRegistrados;
    private javax.swing.JRadioButton jrbCrearEmpleado;
    private javax.swing.JRadioButton jrbInformacionCuenta;
    private javax.swing.JRadioButton jrbListaEmpleado;
    private javax.swing.JRadioButton jrbMovimientos;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JPanel panContenido;
    private javax.swing.JPanel panOpciones;
}
