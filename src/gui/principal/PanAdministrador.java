/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.principal;

/**
 *
 * @author jhose
 */
public class PanAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form PanAdministrador
     */
    public PanAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        //setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(btnContinuar);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txtAdministrador;
    // End of variables declaration//GEN-END:variables
}
