package gui.operacionesEmpleado;

public class PanCrearCuentaCorriente extends javax.swing.JPanel {

    public PanCrearCuentaCorriente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panNumeroCheque = new javax.swing.JPanel();
        lblNumeroCuenta = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        panFechaApertura = new javax.swing.JPanel();
        lblFechaApertura = new javax.swing.JLabel();
        txtFechaApertura = new javax.swing.JTextField();
        panSaldoInicial = new javax.swing.JPanel();
        lblSaldoInicial = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        panTipoMoneda = new javax.swing.JPanel();
        lblTipoMoneda = new javax.swing.JLabel();
        txtTipoMoneda = new javax.swing.JTextField();
        panTitularDeLaCuenta = new javax.swing.JPanel();
        lblTitularDeLaCuenta = new javax.swing.JLabel();
        txtTitularDeLaCuenta = new javax.swing.JTextField();
        panInteresAplicado = new javax.swing.JPanel();
        lblInteresAplicado = new javax.swing.JLabel();
        txtInteresAplicado = new javax.swing.JTextField();
        panLimiteSobregiro = new javax.swing.JPanel();
        lblLimiteSobregiro = new javax.swing.JLabel();
        txtLimiteSobregiro = new javax.swing.JTextField();
        panLimiteCheques = new javax.swing.JPanel();
        lblLimiteCheques = new javax.swing.JLabel();
        txtLimiteCheques = new javax.swing.JTextField();
        panNumeroCheques = new javax.swing.JPanel();
        lblNumeroCheques = new javax.swing.JLabel();
        txtNumeroCheques = new javax.swing.JTextField();
        panComisionPorCheque = new javax.swing.JPanel();
        lblComisionPorCheque = new javax.swing.JLabel();
        txtComisionPorCheque = new javax.swing.JTextField();
        jbtGuardar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1120, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNumeroCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroCuenta.setText("NUMERO DE CUENTA");
        lblNumeroCuenta.setAlignmentX(0.5F);
        lblNumeroCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumeroCuenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCuenta.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCuenta.setText("...");
        txtNumeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroChequeLayout = new javax.swing.GroupLayout(panNumeroCheque);
        panNumeroCheque.setLayout(panNumeroChequeLayout);
        panNumeroChequeLayout.setHorizontalGroup(
            panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panNumeroChequeLayout.setVerticalGroup(
            panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panNumeroChequeLayout.createSequentialGroup()
                        .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panNumeroCheque);

        lblFechaApertura.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblFechaApertura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaApertura.setText("FECHA APERTURA");
        lblFechaApertura.setAlignmentX(0.5F);
        lblFechaApertura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtFechaApertura.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFechaApertura.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaApertura.setText("...");
        txtFechaApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaAperturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFechaAperturaLayout = new javax.swing.GroupLayout(panFechaApertura);
        panFechaApertura.setLayout(panFechaAperturaLayout);
        panFechaAperturaLayout.setHorizontalGroup(
            panFechaAperturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFechaAperturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaApertura, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panFechaAperturaLayout.setVerticalGroup(
            panFechaAperturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFechaAperturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFechaAperturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaApertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panFechaApertura);

        lblSaldoInicial.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblSaldoInicial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaldoInicial.setText("SALDO INICIAL");
        lblSaldoInicial.setAlignmentX(0.5F);
        lblSaldoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtSaldoInicial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSaldoInicial.setForeground(new java.awt.Color(204, 204, 204));
        txtSaldoInicial.setText("...");
        txtSaldoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSaldoInicialLayout = new javax.swing.GroupLayout(panSaldoInicial);
        panSaldoInicial.setLayout(panSaldoInicialLayout);
        panSaldoInicialLayout.setHorizontalGroup(
            panSaldoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaldoInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panSaldoInicialLayout.setVerticalGroup(
            panSaldoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSaldoInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSaldoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSaldoInicialLayout.createSequentialGroup()
                        .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panSaldoInicial);

        lblTipoMoneda.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTipoMoneda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTipoMoneda.setText("TIPO DE MONEDA");
        lblTipoMoneda.setAlignmentX(0.5F);
        lblTipoMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtTipoMoneda.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTipoMoneda.setForeground(new java.awt.Color(204, 204, 204));
        txtTipoMoneda.setText("...");
        txtTipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTipoMonedaLayout = new javax.swing.GroupLayout(panTipoMoneda);
        panTipoMoneda.setLayout(panTipoMonedaLayout);
        panTipoMonedaLayout.setHorizontalGroup(
            panTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTipoMonedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTipoMonedaLayout.setVerticalGroup(
            panTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTipoMonedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTipoMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoMoneda))
                .addContainerGap())
        );

        jPanel1.add(panTipoMoneda);

        lblTitularDeLaCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitularDeLaCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitularDeLaCuenta.setText("TITULAR DE LA CUENTA");
        lblTitularDeLaCuenta.setAlignmentX(0.5F);
        lblTitularDeLaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtTitularDeLaCuenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTitularDeLaCuenta.setForeground(new java.awt.Color(204, 204, 204));
        txtTitularDeLaCuenta.setText("...");
        txtTitularDeLaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitularDeLaCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTitularDeLaCuentaLayout = new javax.swing.GroupLayout(panTitularDeLaCuenta);
        panTitularDeLaCuenta.setLayout(panTitularDeLaCuentaLayout);
        panTitularDeLaCuentaLayout.setHorizontalGroup(
            panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitularDeLaCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitularDeLaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitularDeLaCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTitularDeLaCuentaLayout.setVerticalGroup(
            panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitularDeLaCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitularDeLaCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panTitularDeLaCuentaLayout.createSequentialGroup()
                        .addComponent(txtTitularDeLaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panTitularDeLaCuenta);

        lblInteresAplicado.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblInteresAplicado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInteresAplicado.setText("INTERES APLICADO");
        lblInteresAplicado.setAlignmentX(0.5F);
        lblInteresAplicado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtInteresAplicado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInteresAplicado.setForeground(new java.awt.Color(204, 204, 204));
        txtInteresAplicado.setText("...");
        txtInteresAplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresAplicadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panInteresAplicadoLayout = new javax.swing.GroupLayout(panInteresAplicado);
        panInteresAplicado.setLayout(panInteresAplicadoLayout);
        panInteresAplicadoLayout.setHorizontalGroup(
            panInteresAplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInteresAplicadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInteresAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInteresAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panInteresAplicadoLayout.setVerticalGroup(
            panInteresAplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInteresAplicadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInteresAplicadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInteresAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panInteresAplicadoLayout.createSequentialGroup()
                        .addComponent(txtInteresAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panInteresAplicado);

        lblLimiteSobregiro.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteSobregiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteSobregiro.setText("LIMITE DE SOBREGIRO");
        lblLimiteSobregiro.setAlignmentX(0.5F);
        lblLimiteSobregiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtLimiteSobregiro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtLimiteSobregiro.setForeground(new java.awt.Color(204, 204, 204));
        txtLimiteSobregiro.setText("...");
        txtLimiteSobregiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteSobregiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteSobregiroLayout = new javax.swing.GroupLayout(panLimiteSobregiro);
        panLimiteSobregiro.setLayout(panLimiteSobregiroLayout);
        panLimiteSobregiroLayout.setHorizontalGroup(
            panLimiteSobregiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteSobregiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteSobregiro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLimiteSobregiro, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteSobregiroLayout.setVerticalGroup(
            panLimiteSobregiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteSobregiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteSobregiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLimiteSobregiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLimiteSobregiroLayout.createSequentialGroup()
                        .addComponent(txtLimiteSobregiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panLimiteSobregiro);

        lblLimiteCheques.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques.setText("LIMITE DE CHEQUEZ");
        lblLimiteCheques.setAlignmentX(0.5F);
        lblLimiteCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtLimiteCheques.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtLimiteCheques.setForeground(new java.awt.Color(204, 204, 204));
        txtLimiteCheques.setText("...");
        txtLimiteCheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteChequesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteChequesLayout = new javax.swing.GroupLayout(panLimiteCheques);
        panLimiteCheques.setLayout(panLimiteChequesLayout);
        panLimiteChequesLayout.setHorizontalGroup(
            panLimiteChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteChequesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLimiteCheques, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteChequesLayout.setVerticalGroup(
            panLimiteChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteChequesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLimiteCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLimiteChequesLayout.createSequentialGroup()
                        .addComponent(txtLimiteCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques);

        lblNumeroCheques.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblNumeroCheques.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroCheques.setText("NUMERO DE CHEQUEZ");
        lblNumeroCheques.setAlignmentX(0.5F);
        lblNumeroCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNumeroCheques.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNumeroCheques.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroCheques.setText("...");
        txtNumeroCheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroChequesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNumeroChequesLayout = new javax.swing.GroupLayout(panNumeroCheques);
        panNumeroCheques.setLayout(panNumeroChequesLayout);
        panNumeroChequesLayout.setHorizontalGroup(
            panNumeroChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNumeroChequesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCheques, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panNumeroChequesLayout.setVerticalGroup(
            panNumeroChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNumeroChequesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNumeroChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroCheques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panNumeroChequesLayout.createSequentialGroup()
                        .addComponent(txtNumeroCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panNumeroCheques);

        lblComisionPorCheque.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblComisionPorCheque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblComisionPorCheque.setText("COMISION POR CHEQUE");
        lblComisionPorCheque.setAlignmentX(0.5F);
        lblComisionPorCheque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtComisionPorCheque.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtComisionPorCheque.setForeground(new java.awt.Color(204, 204, 204));
        txtComisionPorCheque.setText("...");
        txtComisionPorCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComisionPorChequeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panComisionPorChequeLayout = new javax.swing.GroupLayout(panComisionPorCheque);
        panComisionPorCheque.setLayout(panComisionPorChequeLayout);
        panComisionPorChequeLayout.setHorizontalGroup(
            panComisionPorChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panComisionPorChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComisionPorCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComisionPorCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panComisionPorChequeLayout.setVerticalGroup(
            panComisionPorChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panComisionPorChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panComisionPorChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComisionPorCheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panComisionPorChequeLayout.createSequentialGroup()
                        .addComponent(txtComisionPorCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panComisionPorCheque);

        jbtGuardar.setBackground(new java.awt.Color(51, 51, 255));
        jbtGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jbtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtGuardar.setText("GUARDAR");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtGuardar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaActionPerformed

    private void txtFechaAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaAperturaActionPerformed

    private void txtSaldoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoInicialActionPerformed

    private void txtTipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoMonedaActionPerformed

    private void txtTitularDeLaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitularDeLaCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitularDeLaCuentaActionPerformed

    private void txtInteresAplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresAplicadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresAplicadoActionPerformed

    private void txtLimiteSobregiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimiteSobregiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimiteSobregiroActionPerformed

    private void txtLimiteChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimiteChequesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimiteChequesActionPerformed

    private void txtNumeroChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroChequesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroChequesActionPerformed

    private void txtComisionPorChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComisionPorChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComisionPorChequeActionPerformed

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtGuardarActionPerformed

    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JLabel lblComisionPorCheque;
    private javax.swing.JLabel lblFechaApertura;
    private javax.swing.JLabel lblInteresAplicado;
    private javax.swing.JLabel lblLimiteCheques;
    private javax.swing.JLabel lblLimiteSobregiro;
    private javax.swing.JLabel lblNumeroCheques;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JLabel lblTipoMoneda;
    private javax.swing.JLabel lblTitularDeLaCuenta;
    private javax.swing.JPanel panComisionPorCheque;
    private javax.swing.JPanel panFechaApertura;
    private javax.swing.JPanel panInteresAplicado;
    private javax.swing.JPanel panLimiteCheques;
    private javax.swing.JPanel panLimiteSobregiro;
    private javax.swing.JPanel panNumeroCheque;
    private javax.swing.JPanel panNumeroCheques;
    private javax.swing.JPanel panSaldoInicial;
    private javax.swing.JPanel panTipoMoneda;
    private javax.swing.JPanel panTitularDeLaCuenta;
    private javax.swing.JTextField txtComisionPorCheque;
    private javax.swing.JTextField txtFechaApertura;
    private javax.swing.JTextField txtInteresAplicado;
    private javax.swing.JTextField txtLimiteCheques;
    private javax.swing.JTextField txtLimiteSobregiro;
    private javax.swing.JTextField txtNumeroCheques;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldoInicial;
    private javax.swing.JTextField txtTipoMoneda;
    private javax.swing.JTextField txtTitularDeLaCuenta;
}
