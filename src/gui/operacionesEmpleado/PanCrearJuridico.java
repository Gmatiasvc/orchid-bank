/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.operacionesEmpleado;

import java.awt.Color;
import java.util.ArrayList;

import common.exceptions.ClientNotFound;
import common.exceptions.InvalidInput;
import common.logger.Logger;
import components.Employee;
import functions.stringFormatter;
import objects.accounts.Persona;

/**
 *
 * @author edu11
 */
public class PanCrearJuridico extends javax.swing.JPanel {

    /**
     * Creates new form PanCrearCuentaAhorro2
     */
	private Employee comp;

    public PanCrearJuridico(Employee comp) {
		this.comp = comp;
        initComponents();
		cmbRepresentante.removeAllItems();
		for(Persona i: comp.getListaNaturales().getList()){
			cmbRepresentante.addItem(i.getIdString());
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panSaldoInicial = new javax.swing.JPanel();
        lblSaldoInicial = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        panTitularDeLaCuenta = new javax.swing.JPanel();
        lblTitularDeLaCuenta = new javax.swing.JLabel();
        cmbRepresentante = new javax.swing.JComboBox<>();
        jbtGuardar = new javax.swing.JButton();
        panSaldoInicial1 = new javax.swing.JPanel();
        lblSaldoInicial1 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        panLimiteCheques3 = new javax.swing.JPanel();
        lblLimiteCheques3 = new javax.swing.JLabel();
        txtDistrict = new javax.swing.JTextField();
        panLimiteCheques1 = new javax.swing.JPanel();
        lblLimiteCheques1 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        panLimiteCheques4 = new javax.swing.JPanel();
        lblLimiteCheques4 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        panLimiteCheques2 = new javax.swing.JPanel();
        lblLimiteCheques2 = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        panLimiteCheques6 = new javax.swing.JPanel();
        lblLimiteCheques6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        panLimiteCheques5 = new javax.swing.JPanel();
        lblLimiteCheques5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        panTitularDeLaCuenta1 = new javax.swing.JPanel();
        lblTitularDeLaCuenta1 = new javax.swing.JLabel();
        txtIncorpDoc = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1120, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaldoInicial.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblSaldoInicial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaldoInicial.setText("NOMBRE DE LA COMPAÑIA");
        lblSaldoInicial.setAlignmentX(0.5F);
        lblSaldoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCompanyName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCompanyName.setForeground(new java.awt.Color(204, 204, 204));
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
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
                .addComponent(txtCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panSaldoInicialLayout.setVerticalGroup(
            panSaldoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSaldoInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSaldoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 920, 40));

        lblTitularDeLaCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitularDeLaCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitularDeLaCuenta.setText("REPRESENTANTE");
        lblTitularDeLaCuenta.setAlignmentX(0.5F);
        lblTitularDeLaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbRepresentante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panTitularDeLaCuentaLayout = new javax.swing.GroupLayout(panTitularDeLaCuenta);
        panTitularDeLaCuenta.setLayout(panTitularDeLaCuentaLayout);
        panTitularDeLaCuentaLayout.setHorizontalGroup(
            panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitularDeLaCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitularDeLaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRepresentante, 0, 251, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTitularDeLaCuentaLayout.setVerticalGroup(
            panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitularDeLaCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTitularDeLaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitularDeLaCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cmbRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panTitularDeLaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 430, 40));

        jbtGuardar.setBackground(new java.awt.Color(51, 51, 255));
        jbtGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jbtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtGuardar.setText("GUARDAR");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        lblSaldoInicial1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblSaldoInicial1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaldoInicial1.setText("RUC");
        lblSaldoInicial1.setAlignmentX(0.5F);
        lblSaldoInicial1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRuc.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRuc.setForeground(new java.awt.Color(204, 204, 204));
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSaldoInicial1Layout = new javax.swing.GroupLayout(panSaldoInicial1);
        panSaldoInicial1.setLayout(panSaldoInicial1Layout);
        panSaldoInicial1Layout.setHorizontalGroup(
            panSaldoInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaldoInicial1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaldoInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        panSaldoInicial1Layout.setVerticalGroup(
            panSaldoInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSaldoInicial1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSaldoInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoInicial1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panSaldoInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 480, 40));

        lblLimiteCheques3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques3.setText("DISTRITO");
        lblLimiteCheques3.setAlignmentX(0.5F);
        lblLimiteCheques3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtDistrict.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDistrict.setForeground(new java.awt.Color(204, 204, 204));
        txtDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistrictActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques3Layout = new javax.swing.GroupLayout(panLimiteCheques3);
        panLimiteCheques3.setLayout(panLimiteCheques3Layout);
        panLimiteCheques3Layout.setHorizontalGroup(
            panLimiteCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDistrict, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteCheques3Layout.setVerticalGroup(
            panLimiteCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCheques3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, 40));

        lblLimiteCheques1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques1.setText("REGION");
        lblLimiteCheques1.setAlignmentX(0.5F);
        lblLimiteCheques1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtRegion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRegion.setForeground(new java.awt.Color(204, 204, 204));
        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques1Layout = new javax.swing.GroupLayout(panLimiteCheques1);
        panLimiteCheques1.setLayout(panLimiteCheques1Layout);
        panLimiteCheques1Layout.setHorizontalGroup(
            panLimiteCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques1)
                .addGap(18, 18, 18)
                .addComponent(txtRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteCheques1Layout.setVerticalGroup(
            panLimiteCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCheques1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 40));

        lblLimiteCheques4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques4.setText("DIRECCION");
        lblLimiteCheques4.setAlignmentX(0.5F);
        lblLimiteCheques4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtAdress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(204, 204, 204));
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques4Layout = new javax.swing.GroupLayout(panLimiteCheques4);
        panLimiteCheques4.setLayout(panLimiteCheques4Layout);
        panLimiteCheques4Layout.setHorizontalGroup(
            panLimiteCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques4)
                .addContainerGap(814, Short.MAX_VALUE))
            .addGroup(panLimiteCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panLimiteCheques4Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(txtAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panLimiteCheques4Layout.setVerticalGroup(
            panLimiteCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panLimiteCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panLimiteCheques4Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel1.add(panLimiteCheques4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        lblLimiteCheques2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques2.setText("PROVINCIA");
        lblLimiteCheques2.setAlignmentX(0.5F);
        lblLimiteCheques2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtProvince.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtProvince.setForeground(new java.awt.Color(204, 204, 204));
        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques2Layout = new javax.swing.GroupLayout(panLimiteCheques2);
        panLimiteCheques2.setLayout(panLimiteCheques2Layout);
        panLimiteCheques2Layout.setHorizontalGroup(
            panLimiteCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProvince, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteCheques2Layout.setVerticalGroup(
            panLimiteCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCheques2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        lblLimiteCheques6.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques6.setText("CORREO ELECTRONICO");
        lblLimiteCheques6.setAlignmentX(0.5F);
        lblLimiteCheques6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques6Layout = new javax.swing.GroupLayout(panLimiteCheques6);
        panLimiteCheques6.setLayout(panLimiteCheques6Layout);
        panLimiteCheques6Layout.setHorizontalGroup(
            panLimiteCheques6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteCheques6Layout.setVerticalGroup(
            panLimiteCheques6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteCheques6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCheques6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 460, 40));

        lblLimiteCheques5.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblLimiteCheques5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimiteCheques5.setText("TELEFONO");
        lblLimiteCheques5.setAlignmentX(0.5F);
        lblLimiteCheques5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtPhoneNumber.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLimiteCheques5Layout = new javax.swing.GroupLayout(panLimiteCheques5);
        panLimiteCheques5.setLayout(panLimiteCheques5Layout);
        panLimiteCheques5Layout.setHorizontalGroup(
            panLimiteCheques5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLimiteCheques5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimiteCheques5)
                .addGap(12, 12, 12)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLimiteCheques5Layout.setVerticalGroup(
            panLimiteCheques5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLimiteCheques5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLimiteCheques5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteCheques5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panLimiteCheques5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 450, 40));

        lblTitularDeLaCuenta1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitularDeLaCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitularDeLaCuenta1.setText("DOCUMENTO DE INCORPORACION");
        lblTitularDeLaCuenta1.setAlignmentX(0.5F);
        lblTitularDeLaCuenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtIncorpDoc.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtIncorpDoc.setForeground(new java.awt.Color(204, 204, 204));
        txtIncorpDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncorpDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTitularDeLaCuenta1Layout = new javax.swing.GroupLayout(panTitularDeLaCuenta1);
        panTitularDeLaCuenta1.setLayout(panTitularDeLaCuenta1Layout);
        panTitularDeLaCuenta1Layout.setHorizontalGroup(
            panTitularDeLaCuenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitularDeLaCuenta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitularDeLaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIncorpDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTitularDeLaCuenta1Layout.setVerticalGroup(
            panTitularDeLaCuenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitularDeLaCuenta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTitularDeLaCuenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitularDeLaCuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIncorpDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(panTitularDeLaCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 920, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
		String companyName = txtCompanyName.getText();
		String ruc = txtRuc.getText();
		String region= txtRegion.getText();
		String district= txtDistrict.getText();
		String province= txtProvince.getText();
		String adress= txtAdress.getText();
		String phoneNumber= txtPhoneNumber.getText();
		String email= txtEmail.getText();
		String incorporationDoc = txtIncorpDoc.getText();
		Persona representante;
		boolean status = false;
		try {
			representante = comp.searchNatural((String)cmbRepresentante.getSelectedItem());
		} catch (ClientNotFound e) {
			representante = new Persona(null, null, null, null, null, null, null, null, null);
			e.printStackTrace();
		}
		try {
			status = comp.createJurica(companyName, ruc, region, province, district, adress, phoneNumber, email, representante, incorporationDoc);
		} catch (InvalidInput e) {
			e.printStackTrace();
		}
		if (status){
			jbtGuardar.setBackground(new Color(51, 51, 255));
		}
		else{
			jbtGuardar.setBackground(new Color(255, 51, 51));
		}	
    }//GEN-LAST:event_jbtGuardarActionPerformed

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void txtDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistrictActionPerformed

    private void txtAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtIncorpDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncorpDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncorpDocActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRepresentante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JLabel lblLimiteCheques1;
    private javax.swing.JLabel lblLimiteCheques2;
    private javax.swing.JLabel lblLimiteCheques3;
    private javax.swing.JLabel lblLimiteCheques4;
    private javax.swing.JLabel lblLimiteCheques5;
    private javax.swing.JLabel lblLimiteCheques6;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JLabel lblSaldoInicial1;
    private javax.swing.JLabel lblTitularDeLaCuenta;
    private javax.swing.JLabel lblTitularDeLaCuenta1;
    private javax.swing.JPanel panLimiteCheques1;
    private javax.swing.JPanel panLimiteCheques2;
    private javax.swing.JPanel panLimiteCheques3;
    private javax.swing.JPanel panLimiteCheques4;
    private javax.swing.JPanel panLimiteCheques5;
    private javax.swing.JPanel panLimiteCheques6;
    private javax.swing.JPanel panSaldoInicial;
    private javax.swing.JPanel panSaldoInicial1;
    private javax.swing.JPanel panTitularDeLaCuenta;
    private javax.swing.JPanel panTitularDeLaCuenta1;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncorpDoc;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}