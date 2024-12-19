package gui.operacionesEmpleado;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
public class PamCrearUsuario extends javax.swing.JPanel {

    private final javax.swing.ButtonGroup buttonGroupOpciones;

    public PamCrearUsuario() {
        initComponents();
        buttonGroupOpciones = new ButtonGroup();
        buttonGroupOpciones.add(jrbCuentaAhorro);
        buttonGroupOpciones.add(jrbCuentaCorriente);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        jrbCuentaAhorro = new javax.swing.JRadioButton();
        jrbCuentaCorriente = new javax.swing.JRadioButton();
        panContenido = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1284, 784));

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));

        jrbCuentaAhorro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbCuentaAhorro.setForeground(new java.awt.Color(0, 51, 255));
        jrbCuentaAhorro.setText("Cuenta ahorro");
        jrbCuentaAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCuentaAhorroActionPerformed(evt);
            }
        });
        panBlanco.add(jrbCuentaAhorro);

        jrbCuentaCorriente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jrbCuentaCorriente.setForeground(new java.awt.Color(0, 51, 255));
        jrbCuentaCorriente.setText("Cuenta corriente");
        jrbCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCuentaCorrienteActionPerformed(evt);
            }
        });
        panBlanco.add(jrbCuentaCorriente);

        panContenido.setBackground(new java.awt.Color(204, 204, 204));
        panContenido.setPreferredSize(new java.awt.Dimension(1120, 680));

        javax.swing.GroupLayout panContenidoLayout = new javax.swing.GroupLayout(panContenido);
        panContenido.setLayout(panContenidoLayout);
        panContenidoLayout.setHorizontalGroup(
            panContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        panContenidoLayout.setVerticalGroup(
            panContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        panBlanco.add(panContenido);
        panContenido.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCuentaCorrienteActionPerformed
        PanCrearCuentaCorriente panCrearCuentaCorriente = new PanCrearCuentaCorriente();
        panCrearCuentaCorriente.setSize(1100,670);
        panCrearCuentaCorriente.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(panCrearCuentaCorriente,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }//GEN-LAST:event_jrbCuentaCorrienteActionPerformed

    private void jrbCuentaAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCuentaAhorroActionPerformed
        PanCrearCuentaAhorro panCrearCuentaAhorro = new PanCrearCuentaAhorro();
        panCrearCuentaAhorro.setSize(1100,670);
        panCrearCuentaAhorro.setLocation(0,0);

        panContenido.removeAll();
        panContenido.add(panCrearCuentaAhorro,BorderLayout.CENTER);
        panContenido.revalidate();
        panContenido.repaint();
    }
    private javax.swing.JRadioButton jrbCuentaAhorro;
    private javax.swing.JRadioButton jrbCuentaCorriente;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JPanel panContenido;
}
