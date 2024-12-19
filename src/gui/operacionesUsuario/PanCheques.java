package gui.operacionesUsuario;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;

public class PanCheques extends javax.swing.JPanel {

    private final javax.swing.ButtonGroup buttonGroupOpciones;

    public PanCheques() {
        initComponents();
        buttonGroupOpciones = new ButtonGroup();
        buttonGroupOpciones.add(jrbEmitirCheque);
        buttonGroupOpciones.add(jrbCobrarCheque);
        buttonGroupOpciones.add(jrbVerificarCheque);
        buttonGroupOpciones.add(jrbDevolverCheque);  
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panChequez = new javax.swing.JPanel();
        jrbEmitirCheque = new javax.swing.JRadioButton();
        jrbCobrarCheque = new javax.swing.JRadioButton();
        jrbVerificarCheque = new javax.swing.JRadioButton();
        jrbDevolverCheque = new javax.swing.JRadioButton();
        panOpcionesChequez = new javax.swing.JPanel();

        panChequez.setBackground(new java.awt.Color(255, 255, 255));
        panChequez.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panChequez.setMinimumSize(new java.awt.Dimension(0, 0));
        panChequez.setPreferredSize(new java.awt.Dimension(1140, 784));
        panChequez.setRequestFocusEnabled(false);

        jrbEmitirCheque.setText("Emitir Cheque");
        jrbEmitirCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEmitirChequeActionPerformed(evt);
            }
        });
        panChequez.add(jrbEmitirCheque);

        jrbCobrarCheque.setText("Cobrar Cheque");
        jrbCobrarCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobrarChequeActionPerformed(evt);
            }
        });
        panChequez.add(jrbCobrarCheque);

        jrbVerificarCheque.setText("Verificar cheque");
        jrbVerificarCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVerificarChequeActionPerformed(evt);
            }
        });
        panChequez.add(jrbVerificarCheque);

        jrbDevolverCheque.setText("Devolver Cheque");
        jrbDevolverCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDevolverChequeActionPerformed(evt);
            }
        });
        panChequez.add(jrbDevolverCheque);

        panOpcionesChequez.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panOpcionesChequezLayout = new javax.swing.GroupLayout(panOpcionesChequez);
        panOpcionesChequez.setLayout(panOpcionesChequezLayout);
        panOpcionesChequezLayout.setHorizontalGroup(
            panOpcionesChequezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        panOpcionesChequezLayout.setVerticalGroup(
            panOpcionesChequezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        panChequez.add(panOpcionesChequez);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panChequez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panChequez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrbEmitirChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEmitirChequeActionPerformed
        PanChequesEmision pamChequezEmision = new PanChequesEmision();
        pamChequezEmision.setSize(1100,710);
        pamChequezEmision.setLocation(0,0);

        panOpcionesChequez.removeAll();
        panOpcionesChequez.add(pamChequezEmision,BorderLayout.CENTER);
        panOpcionesChequez.revalidate();
        panOpcionesChequez.repaint();
    }//GEN-LAST:event_jrbEmitirChequeActionPerformed

    private void jrbCobrarChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobrarChequeActionPerformed
        PanChequesCobrar pamChequezCobrar = new PanChequesCobrar();
        pamChequezCobrar.setSize(1100,710);
        pamChequezCobrar.setLocation(0,0);

        panOpcionesChequez.removeAll();
        panOpcionesChequez.add(pamChequezCobrar,BorderLayout.CENTER);
        panOpcionesChequez.revalidate();
        panOpcionesChequez.repaint();
    }//GEN-LAST:event_jrbCobrarChequeActionPerformed

    private void jrbVerificarChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVerificarChequeActionPerformed
        PanChequesVerificar pamChequezVerificar = new PanChequesVerificar();
        pamChequezVerificar.setSize(1100,710);
        pamChequezVerificar.setLocation(0,0);

        panOpcionesChequez.removeAll();
        panOpcionesChequez.add(pamChequezVerificar,BorderLayout.CENTER);
        panOpcionesChequez.revalidate();
        panOpcionesChequez.repaint();
    }//GEN-LAST:event_jrbVerificarChequeActionPerformed

    private void jrbDevolverChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDevolverChequeActionPerformed
        PanChequesDevolucion pamChequezDevolucion = new PanChequesDevolucion();
        pamChequezDevolucion.setSize(1100,710);
        pamChequezDevolucion.setLocation(0,0);

        panOpcionesChequez.removeAll();
        panOpcionesChequez.add(pamChequezDevolucion,BorderLayout.CENTER);
        panOpcionesChequez.revalidate();
        panOpcionesChequez.repaint();
    }
	
    private javax.swing.JRadioButton jrbCobrarCheque;
    private javax.swing.JRadioButton jrbDevolverCheque;
    private javax.swing.JRadioButton jrbEmitirCheque;
    private javax.swing.JRadioButton jrbVerificarCheque;
    private javax.swing.JPanel panChequez;
    private javax.swing.JPanel panOpcionesChequez;
}
