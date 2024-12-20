/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion.OperacionesUsuario;

/**
 *
 * @author edu11
 */
public class PanEditarInformacion extends javax.swing.JPanel {

    /**
     * Creates new form PanEditarInformacion
     */
    public PanEditarInformacion() {
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

        lblEstado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        cmbEstadoCuenta = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDirección = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1140, 784));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstado.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblEstado.setText("Estado:");
        add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 30));

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 80, 30));

        lblApellido.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblApellido.setText("Apellido:");
        add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 80, 30));

        lblDireccion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblDireccion.setText("Dirección:");
        add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, 30));

        lblTelefono.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTelefono.setText("Teléfono:");
        add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 90, 30));

        lblEmail.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 60, 30));

        cmbEstadoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(cmbEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 400, 30));

        btnCancelar.setBackground(new java.awt.Color(51, 51, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 51, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        txtEmail.setText("jTextField1");
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 400, 30));

        txtNombre.setText("jTextField1");
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 400, 30));

        txtApellido.setText("jTextField1");
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 400, 30));

        txtDirección.setText("jTextField1");
        add(txtDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 400, 30));

        txtTelefono.setText("jTextField1");
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbEstadoCuenta;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDirección;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
