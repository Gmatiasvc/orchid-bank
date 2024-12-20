/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.operacionesAdministrador;

import components.Admin;
import objects.accounts.Cuenta;

import javax.swing.table.DefaultTableModel;

import common.exceptions.AccountNotFound;
import common.exceptions.BadStringToParse;
import objects.accounts.CuentaAhorro;
import objects.accounts.CuentaCorriente;

/**
 *
 * @author jhose
 */
public class PanLogs extends javax.swing.JPanel {

    DefaultTableModel mt = new DefaultTableModel();
    private Admin comp;
    /**
     * Creates new form PanListaEmpleados
     */
    public PanLogs(Admin comp) {
        initComponents();
        String ids[] = {"Nombre","Apellidos","DNI","Telefono","Direccion","Coreo electronico","Sueldo"};
        mt.setColumnIdentifiers(ids);
        this.comp = comp;
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
        cmbAcc = new javax.swing.JComboBox<>();
        lblAccounts = new javax.swing.JLabel();

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));
        panBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAcc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbAccPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccActionPerformed(evt);
            }
        });
        panBlanco.add(cmbAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 40));

        lblAccounts.setBackground(new java.awt.Color(221, 221, 221));
        lblAccounts.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblAccounts.setForeground(new java.awt.Color(30, 30, 30));
        lblAccounts.setToolTipText("");
        lblAccounts.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panBlanco.add(lblAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 300, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccActionPerformed
        for (String i : comp.getListaNrosCuenta()) {
			cmbAcc.addItem(i);
			
		}
    }//GEN-LAST:event_cmbAccActionPerformed

    private void cmbAccPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbAccPopupMenuWillBecomeInvisible
        String number = cmbAcc.getSelectedItem().toString();
		try {
			if (number.charAt(0)=='1'){
				CuentaAhorro account = (CuentaAhorro) comp.searchCuenta(number);
				lblAccounts.setText(account.toString());
			}
			else {
				CuentaCorriente account = (CuentaCorriente) comp.searchCuenta(number);
				lblAccounts.setText(account.toString());
			}

		} catch (AccountNotFound | BadStringToParse e) {
			lblAccounts.setText("ERROR\nCuenta no encontrada");
		}

		
    }//GEN-LAST:event_cmbAccPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAcc;
    private javax.swing.JLabel lblAccounts;
    private javax.swing.JPanel panBlanco;
    // End of variables declaration//GEN-END:variables
}
