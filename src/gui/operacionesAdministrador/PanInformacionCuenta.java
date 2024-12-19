package gui.operacionesAdministrador;

public class PanInformacionCuenta extends javax.swing.JPanel {

	public PanInformacionCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        lblSaldo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblNombreApellido = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtNombreApellido = new javax.swing.JTextField();
        lblCelular1 = new javax.swing.JLabel();
        txtCelular1 = new javax.swing.JTextField();

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 748));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaldo.setText("Saldo:");
        panBlanco.add(lblSaldo);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");
        panBlanco.add(lblEmail);

        lblNombreApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreApellido.setText("Nombre y apellido:");
        panBlanco.add(lblNombreApellido);

        txtEmail.setToolTipText("");
        panBlanco.add(txtEmail);
        panBlanco.add(txtCelular);
        panBlanco.add(txtNombreApellido);

        lblCelular1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCelular1.setText("Celular:");
        panBlanco.add(lblCelular1);
        panBlanco.add(txtCelular1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }

    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreApellido;

}
