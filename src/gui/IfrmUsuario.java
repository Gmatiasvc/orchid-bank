package gui;

public class IfrmUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmUsuario
     */
    public IfrmUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCuentasUsuario = new javax.swing.JMenu();
        mniVerResumen = new javax.swing.JMenuItem();
        mnuVerActividad = new javax.swing.JMenuItem();
        mniRealizarTransferencia = new javax.swing.JMenuItem();
        mniEditarInformacion = new javax.swing.JMenuItem();
        mnuSalir3 = new javax.swing.JMenu();

        mnuCuentasUsuario.setText("Cuentas");

        mniVerResumen.setText("Ver Resumen");
        mnuCuentasUsuario.add(mniVerResumen);

        mnuVerActividad.setText("Ver Actividad");
        mnuVerActividad.setToolTipText("");
        mnuCuentasUsuario.add(mnuVerActividad);

        mniRealizarTransferencia.setText("Realizar Transferencia");
        mnuCuentasUsuario.add(mniRealizarTransferencia);

        mniEditarInformacion.setText("Editar Informacion");
        mnuCuentasUsuario.add(mniEditarInformacion);

        jMenuBar1.add(mnuCuentasUsuario);

        mnuSalir3.setText("Salir");
        jMenuBar1.add(mnuSalir3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniEditarInformacion;
    private javax.swing.JMenuItem mniRealizarTransferencia;
    private javax.swing.JMenuItem mniVerResumen;
    private javax.swing.JMenu mnuCuentasUsuario;
    private javax.swing.JMenu mnuSalir3;
    private javax.swing.JMenuItem mnuVerActividad;
    // End of variables declaration                   
}