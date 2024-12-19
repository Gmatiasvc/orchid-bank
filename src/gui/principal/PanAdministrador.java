package gui.principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class PanAdministrador extends javax.swing.JPanel {

    public PanAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblUsuario1 = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        txtAdministrador = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pwdContraseña = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();

        lblUsuario1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 51, 255));
        lblUsuario1.setText("Contraseña:");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1184, 784));

        lblAdministrador.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(0, 51, 255));
        lblAdministrador.setText("Administrador   :");
        lblAdministrador.setToolTipText("");
        add(lblAdministrador);
        add(txtAdministrador);

        lblContraseña.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 51, 255));
        lblContraseña.setText("Contraseña       :");
        add(lblContraseña);

        pwdContraseña.setForeground(new java.awt.Color(204, 204, 204));
        add(pwdContraseña);

        btnContinuar.setBackground(new java.awt.Color(0, 51, 255));
        btnContinuar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        String usuario = txtAdministrador.getText();
        String contraseña = new String(pwdContraseña.getPassword()); 

        if (usuario.equals("12345678") && contraseña.equals("12345678")) {
            FrmVentanaPrincipalAdministrador ventanaPrincipalAdministrador = new FrmVentanaPrincipalAdministrador();
            ventanaPrincipalAdministrador.setVisible(true);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this); 
            topFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed


    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txtAdministrador;
}
