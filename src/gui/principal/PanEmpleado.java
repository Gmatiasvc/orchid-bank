/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.principal;

import components.Login;
import javax.swing.*;

/**
 *
 * @author jhose
 */
public class PanEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form PanEmpleado
     */
    private Login loginHandler;

    public PanEmpleado(Login login) {
        initComponents();
        loginHandler = login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdContraseña = new javax.swing.JPasswordField();
        lblEmpleado = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pwdContraseña1 = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();

        pwdContraseña.setForeground(new java.awt.Color(204, 204, 204));

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 784));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpleado.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 51, 255));
        lblEmpleado.setText("Empleado     :");
        add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        txtEmpleado.setPreferredSize(new java.awt.Dimension(260, 40));
        add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 51, 255));
        lblContraseña.setText("Contraseña  :");
        add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        pwdContraseña1.setForeground(new java.awt.Color(204, 204, 204));
        pwdContraseña1.setPreferredSize(new java.awt.Dimension(260, 40));
        add(pwdContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(0, 51, 255));
        btnContinuar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        String usuario = txtEmpleado.getText();
        String contraseña = new String(pwdContraseña1.getPassword());
        boolean sucess = loginHandler.loginEmployee(usuario, contraseña);
        if (sucess) {
            FrmVentanaPrincipalEmpleado ventanaPrincipalEmpleado = new FrmVentanaPrincipalEmpleado();
            ventanaPrincipalEmpleado.setVisible(true);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JPasswordField pwdContraseña1;
    private javax.swing.JTextField txtEmpleado;
    // End of variables declaration//GEN-END:variables

}
