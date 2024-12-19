package gui.operacionesEmpleado;

public class PanInformacionCuenta extends javax.swing.JPanel {

    public PanInformacionCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblNombreApellido = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNombreApellido = new javax.swing.JTextField();
        lblCelular1 = new javax.swing.JLabel();
        txtCelular1 = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 784));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");
        jPanel1.add(lblEmail);

        lblNombreApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreApellido.setText("Nombre y apellido:");
        jPanel1.add(lblNombreApellido);

        txtEmail.setToolTipText("");
        jPanel1.add(txtEmail);
        jPanel1.add(txtNombreApellido);

        lblCelular1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCelular1.setText("Celular:");
        jPanel1.add(lblCelular1);
        jPanel1.add(txtCelular1);

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonto.setText("Monto:");
        jPanel1.add(lblMonto);
        jPanel1.add(txtCelular);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }
	
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreApellido;
}
