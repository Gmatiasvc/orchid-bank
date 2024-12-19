package gui.principal;
 import javax.swing.*;

 public class PanEmpleado extends javax.swing.JPanel {


    public PanEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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

        lblEmpleado.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 51, 255));
        lblEmpleado.setText("Empleado     :");
        add(lblEmpleado);

        txtEmpleado.setPreferredSize(new java.awt.Dimension(260, 40));
        add(txtEmpleado);

        lblContraseña.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 51, 255));
        lblContraseña.setText("Contraseña  :");
        add(lblContraseña);

        pwdContraseña1.setForeground(new java.awt.Color(204, 204, 204));
        pwdContraseña1.setPreferredSize(new java.awt.Dimension(260, 40));
        add(pwdContraseña1);

        btnContinuar.setBackground(new java.awt.Color(0, 51, 255));
        btnContinuar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
                            
        String usuario = txtEmpleado.getText();
        String contraseña = new String(pwdContraseña1.getPassword()); 

        if (usuario.equals("12345678") && contraseña.equals("12345678")) {
            FrmVentanaPrincipalEmpleado ventanaPrincipalEmpleado = new FrmVentanaPrincipalEmpleado();
            ventanaPrincipalEmpleado.setVisible(true);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this); 
            topFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed


    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JPasswordField pwdContraseña1;
    private javax.swing.JTextField txtEmpleado;

}
