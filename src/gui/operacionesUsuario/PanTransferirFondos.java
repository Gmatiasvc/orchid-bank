/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.operacionesUsuario;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jhose
 */
public class PanTransferirFondos extends javax.swing.JPanel {
    
    /**
     * Creates new form PanTransferirFondos
     */
    private JTextField jTextFieldCantidad;
    private JTextField jTextFieldCuentaOrigen;
    private JTextField jTextFieldCuentaDestino;
    public PanTransferirFondos() {
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

        panBlanco = new javax.swing.JPanel();
        lblImporteRetiro = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtImporteRetirar = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 784));

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));
        panBlanco.setRequestFocusEnabled(false);

        lblImporteRetiro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblImporteRetiro.setForeground(new java.awt.Color(51, 51, 255));
        lblImporteRetiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImporteRetiro.setText("Importe a Transferir");

        lblcontraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(51, 51, 255));
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontraseña.setText("Numero de Cuenta");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnRetirar.setBackground(new java.awt.Color(51, 51, 255));
        btnRetirar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.gif"))); // NOI18N
        btnRetirar.setText("Transferir");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBlancoLayout = new javax.swing.GroupLayout(panBlanco);
        panBlanco.setLayout(panBlancoLayout);
        panBlancoLayout.setHorizontalGroup(
            panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBlancoLayout.createSequentialGroup()
                .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBlancoLayout.createSequentialGroup()
                        .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBlancoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panBlancoLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lblImporteRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImporteRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panBlancoLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        panBlancoLayout.setVerticalGroup(
            panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBlancoLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontraseña))
                .addGap(18, 18, 18)
                .addGroup(panBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImporteRetiro)
                    .addComponent(txtImporteRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnRetirar)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
      double cantidadTransferir = Double.parseDouble(jTextFieldCantidad.getText());  // cantidad a transferir
    String cuentaOrigen = jTextFieldCuentaOrigen.getText();  // cuenta de origen
    String cuentaDestino = jTextFieldCuentaDestino.getText();  // cuenta de destino

    // Verificamos si la cantidad que se desea transferir es válida
    if (cantidadTransferir <= 0) {
        JOptionPane.showMessageDialog(this, "La cantidad a transferir debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salimos del método si la cantidad no es válida
    }

    // Verificamos que la cuenta de origen exista
    Cuenta cuentaOrig = obtenerCuenta(cuentaOrigen);  // Método que busca la cuenta de origen en el sistema
    if (cuentaOrig == null) {
        JOptionPane.showMessageDialog(this, "La cuenta de origen no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salimos del método si la cuenta de origen no se encuentra
    }

    // Verificamos que el saldo de la cuenta de origen sea suficiente
    if (cuentaOrig.getSaldo() < cantidadTransferir) {
        JOptionPane.showMessageDialog(this, "No tienes suficiente saldo en la cuenta de origen.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salimos del método si el saldo no es suficiente
    }

    // Verificamos que la cuenta de destino exista
    Cuenta cuentaDest = obtenerCuenta(cuentaDestino);  // Método que busca la cuenta de destino en el sistema
    if (cuentaDest == null) {
        JOptionPane.showMessageDialog(this, "La cuenta de destino no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salimos del método si la cuenta de destino no se encuentra
    }

    // Realizamos la transferencia
    cuentaOrig.reducirSaldo(cantidadTransferir);  // Método que reduce el saldo de la cuenta de origen
    cuentaDest.aumentarSaldo(cantidadTransferir);  // Método que aumenta el saldo de la cuenta de destino

    // Confirmación de la transferencia
    JOptionPane.showMessageDialog(this, "Transferencia realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
}

// Método que obtiene una cuenta en base a un número de cuenta
private Cuenta obtenerCuenta(String numeroCuenta) {
        Iterable<Cuenta> cuentas = null;
    // Aquí deberías implementar la lógica de búsqueda de la cuenta en tu sistema
    // Esto puede ser, por ejemplo, una búsqueda en una base de datos o en una lista de cuentas
    // Este es un ejemplo de cómo podría hacerlo.
    for (Cuenta cuenta : cuentas) {  // "cuentas" es la lista de todas las cuentas
        if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
            return cuenta;  // Retorna la cuenta si se encuentra
        }
    }
    return null;  // Retorna null si no se encuentra la cuenta
}

// Clase Cuenta (esto es solo un ejemplo, debes tener tu propia implementación)
class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void reducirSaldo(double cantidad) {
        saldo -= cantidad;  // Reduce el saldo en la cantidad especificada
    }

    public void aumentarSaldo(double cantidad) {
        saldo += cantidad;  // Aumenta el saldo en la cantidad especificada
    }   

// TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel lblImporteRetiro;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtImporteRetirar;
    // End of variables declaration//GEN-END:variables
}
