/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion.OperacionesUsuario;

/**
 *
 * @author edu11
 */
public class PanRealizarTranferencia extends javax.swing.JPanel {

    /**
     * Creates new form PanRealizarTranferencia
     */
    public PanRealizarTranferencia() {
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

        lblCuentaOrigen = new javax.swing.JLabel();
        cmbListaCuentaOrigen = new javax.swing.JComboBox<>();
        lblCuentaDestinatario = new javax.swing.JLabel();
        txtCuentaDestinatario1 = new javax.swing.JTextField();
        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        lblConcepto = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 556));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCuentaOrigen.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCuentaOrigen.setText("Cuenta Origen:");
        add(lblCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        cmbListaCuentaOrigen.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        cmbListaCuentaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbListaCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 380, 40));

        lblCuentaDestinatario.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCuentaDestinatario.setText("Cuenta del destinatario: ");
        add(lblCuentaDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        txtCuentaDestinatario1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtCuentaDestinatario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaDestinatario1ActionPerformed(evt);
            }
        });
        add(txtCuentaDestinatario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 380, 40));

        lblImporte.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblImporte.setText("Importe:");
        add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        txtImporte.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteActionPerformed(evt);
            }
        });
        add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 380, 40));

        lblConcepto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblConcepto.setText("Concepto:");
        add(lblConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        txtConcepto.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });
        add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 380, 40));

        btnTransferir.setBackground(new java.awt.Color(51, 51, 255));
        btnTransferir.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtCuentaDestinatario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaDestinatario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaDestinatario1ActionPerformed

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JComboBox<String> cmbListaCuentaOrigen;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblCuentaDestinatario;
    private javax.swing.JLabel lblCuentaOrigen;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtCuentaDestinatario1;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables
}