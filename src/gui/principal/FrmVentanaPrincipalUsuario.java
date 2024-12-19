/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.principal;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;

import gui.operacionesUsuario.PanCheques;
import gui.operacionesUsuario.PanConsultarSaldo;
import gui.operacionesUsuario.PanEstadoCuenta;
import gui.operacionesUsuario.PanRetirar;
import gui.operacionesUsuario.PanTransferirFondos;

/**
 *
 * @author jhose
 */
public class FrmVentanaPrincipalUsuario extends javax.swing.JFrame {

    private final javax.swing.ButtonGroup buttonGroupOpciones;
    
    /**
     * Creates new form FrmVentanaPrincipalUsuario
     */
    public FrmVentanaPrincipalUsuario() {
        initComponents();
        buttonGroupOpciones = new ButtonGroup();
        buttonGroupOpciones.add(jrbRetirar);
        buttonGroupOpciones.add(jrbTransferirFondos);
        buttonGroupOpciones.add(jrbEstadoCuenta);
        buttonGroupOpciones.add(jrbCheques);
        buttonGroupOpciones.add(jrbConsultarSaldo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        panContenido = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jrbRetirar = new javax.swing.JRadioButton();
        jrbTransferirFondos = new javax.swing.JRadioButton();
        jrbEstadoCuenta = new javax.swing.JRadioButton();
        jrbCheques = new javax.swing.JRadioButton();
        jrbConsultarSaldo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1440, 960));
        //panBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panBlanco.add(panContenido); //new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panBlanco.add(btnSalir);// new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 960));

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 51, 255));
        lblUsuario.setText("Menu");

        jrbRetirar.setBackground(new java.awt.Color(0, 51, 255));
        jrbRetirar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbRetirar.setForeground(new java.awt.Color(255, 255, 255));
        jrbRetirar.setText("Retirar");
        jrbRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbRetirar.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRetirarActionPerformed(evt);
            }
        });

        jrbTransferirFondos.setBackground(new java.awt.Color(0, 51, 255));
        jrbTransferirFondos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbTransferirFondos.setForeground(new java.awt.Color(255, 255, 255));
        jrbTransferirFondos.setText("Transferir fondos");
        jrbTransferirFondos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbTransferirFondos.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbTransferirFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTransferirFondosActionPerformed(evt);
            }
        });

        jrbEstadoCuenta.setBackground(new java.awt.Color(0, 51, 255));
        jrbEstadoCuenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbEstadoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jrbEstadoCuenta.setText("Estado cuenta");
        jrbEstadoCuenta.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbEstadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoCuentaActionPerformed(evt);
            }
        });

        jrbCheques.setBackground(new java.awt.Color(0, 51, 255));
        jrbCheques.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbCheques.setForeground(new java.awt.Color(255, 255, 255));
        jrbCheques.setText("Cheques");
        jrbCheques.setToolTipText("");
        jrbCheques.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbCheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbChequesActionPerformed(evt);
            }
        });

        jrbConsultarSaldo.setBackground(new java.awt.Color(0, 51, 255));
        jrbConsultarSaldo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbConsultarSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jrbConsultarSaldo.setText("Consultar saldo");
        jrbConsultarSaldo.setPreferredSize(new java.awt.Dimension(200, 40));
        jrbConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbConsultarSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jrbTransferirFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbEstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblUsuario)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblUsuario)
                .addGap(54, 54, 54)
                .addComponent(jrbRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbTransferirFondos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );

        panBlanco.add(jPanel1);// new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRetirarActionPerformed
        PanRetirar pamRetirar = new PanRetirar();
        pamRetirar.setSize(1140,784);
        pamRetirar.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(pamRetirar,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbRetirarActionPerformed

    private void jrbTransferirFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTransferirFondosActionPerformed
        PanTransferirFondos pamTransferirFondos = new PanTransferirFondos();
        pamTransferirFondos.setSize(1140,784);
        pamTransferirFondos.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(pamTransferirFondos,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbTransferirFondosActionPerformed

    private void jrbChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbChequesActionPerformed
        PanCheques pamCheques = new PanCheques();
        pamCheques.setSize(1140,784);
        pamCheques.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(pamCheques,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbChequesActionPerformed

    private void jrbConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbConsultarSaldoActionPerformed
        PanConsultarSaldo pamConsultarSaldo = new PanConsultarSaldo();
        pamConsultarSaldo.setSize(1140,784);
        pamConsultarSaldo.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(pamConsultarSaldo,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbConsultarSaldoActionPerformed

    private void jrbEstadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoCuentaActionPerformed
        PanEstadoCuenta pamEstadoCuenta = new PanEstadoCuenta();
        pamEstadoCuenta.setSize(1140,784);
        pamEstadoCuenta.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(pamEstadoCuenta,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbEstadoCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FrmVentanaPrincipalUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbCheques;
    private javax.swing.JRadioButton jrbConsultarSaldo;
    private javax.swing.JRadioButton jrbEstadoCuenta;
    private javax.swing.JRadioButton jrbRetirar;
    private javax.swing.JRadioButton jrbTransferirFondos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JPanel panContenido;
    // End of variables declaration//GEN-END:variables
}