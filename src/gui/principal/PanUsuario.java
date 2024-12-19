package gui.principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PanUsuario extends javax.swing.JPanel {
    
    public PanUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pwdContraseña = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 784));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Usuario         :");
        add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Contraseña   :");
        add(jLabel2);

        txtUsuario.setPreferredSize(new java.awt.Dimension(260, 40));
        add(txtUsuario);

        pwdContraseña.setForeground(new java.awt.Color(204, 204, 204));
        pwdContraseña.setPreferredSize(new java.awt.Dimension(260, 40));
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
        String usuario = txtUsuario.getText();
        String contraseña = new String(pwdContraseña.getPassword());
 
        if (usuario.equals("12345678") && contraseña.equals("12345678")) {
            FrmVentanaPrincipalUsuario ventanaPrincipalUsuario = new FrmVentanaPrincipalUsuario();
            ventanaPrincipalUsuario.setVisible(true);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this); 
            topFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txtUsuario;
}
