package gui.operacionesUsuario;

// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import javax.swing.text.Document;
// import com.itextpdf.kernel.pdf.PdfDocument;
// import com.itextpdf.kernel.pdf.PdfWriter;
// import com.itextpdf.layout.Document;
// import com.itextpdf.layout.element.Paragraph;

public class PanEstadoCuenta extends javax.swing.JPanel {


    public PanEstadoCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        lblImporteRetiro = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtImporteRetirar = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1140, 784));

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));

        lblImporteRetiro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblImporteRetiro.setForeground(new java.awt.Color(51, 51, 255));
        lblImporteRetiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImporteRetiro.setText("Numero de Cuenta");
        panBlanco.add(lblImporteRetiro);

        lblcontraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(51, 51, 255));
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontraseña.setText("Nombre del Titular");
        panBlanco.add(lblcontraseña);
        panBlanco.add(txtImporteRetirar);

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //txtContraseñaActionPerformed(evt);
            }
        });
        panBlanco.add(txtContraseña);

        btnRetirar.setBackground(new java.awt.Color(51, 51, 255));
        btnRetirar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.gif"))); // NOI18N
        btnRetirar.setText("Generar Estado");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnRetirarActionPerformed(evt);
            }
        });
        panBlanco.add(btnRetirar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//     private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

//     }//GEN-LAST:event_txtContraseñaActionPerformed

//     private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
//          String numeroCuenta = jTextFieldNumeroCuenta.getText();  // Asegúrate de que este campo sea el correcto
//     String contrasena = new String(jPasswordFieldContrasena.getPassword());  // Asegúrate de que este campo sea el correcto

//     // Validación de las credenciales del usuario (ejemplo simple)
//     Cuenta cuenta = obtenerCuenta(numeroCuenta);
    
//     if (cuenta != null && cuenta.validarContrasena(contrasena)) {
//         // Si las credenciales son correctas, generar el PDF
        
//         try {
//             // Generar el archivo PDF
//             generarPDF(cuenta);
//             JOptionPane.showMessageDialog(null, "PDF generado correctamente.");
//         } catch (Exception ex) {
//             JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + ex.getMessage());
//         }
//     } else {
//         JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
//     }
// }

// // Método para obtener la cuenta según el número de cuenta
// private Cuenta obtenerCuenta(String numeroCuenta) {
//     // Simulamos obtener la cuenta (en un sistema real, esto puede venir de una base de datos)
//     if (numeroCuenta.equals("12345")) {
//         return new Cuenta("12345", "password123", 1500.00);
//     } else if (numeroCuenta.equals("67890")) {
//         return new Cuenta("67890", "password456", 2000.00);
//     }
//     return null; // Si no existe la cuenta
// }

// // Método para generar el PDF
// private void generarPDF(Cuenta cuenta) throws DocumentException, FileNotFoundException {
//     // Crear un documento PDF
//     Document document = new Document();
    
//     // Ruta donde se guardará el PDF (se guardará en la carpeta de tu proyecto)
//     String rutaPDF = "Cuenta_" + cuenta.getNumeroCuenta() + ".pdf";
//     PdfWriter.getInstance(document, new FileOutputStream(rutaPDF));
    
//     // Abrir el documento para agregar contenido
//     document.open();
    
//     // Agregar el contenido (número de cuenta y saldo)
//     document.add(new Paragraph("Número de Cuenta: " + cuenta.getNumeroCuenta()));
//     document.add(new Paragraph("Saldo: $" + cuenta.getSaldo()));
    
//     // Cerrar el documento
//     document.close();
// }

// // Clase Cuenta para representar las cuentas bancarias
// class Cuenta {
//     private String numeroCuenta;
//     private String contrasena;
//     private double saldo;

//     // Constructor
//     public Cuenta(String numeroCuenta, String contrasena, double saldo) {
//         this.numeroCuenta = numeroCuenta;
//         this.contrasena = contrasena;
//         this.saldo = saldo;
//     }

//     // Métodos de acceso
//     public String getNumeroCuenta() {
//         return numeroCuenta;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     // Método para validar la contraseña
//     public boolean validarContrasena(String contrasena) {
//         return this.contrasena.equals(contrasena);
//     }
//         // TODO add your handling code here:
//     }//GEN-LAST:event_btnRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel lblImporteRetiro;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtImporteRetirar;
    // End of variables declaration//GEN-END:variables
}
