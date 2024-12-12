package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipalOrquiBank extends javax.swing.JFrame {

    // Constructor
    public FrmPrincipalOrquiBank() {
        initComponents();
    }

    // Método de inicialización del JFrame
    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuLogin = new javax.swing.JMenu();
        mniAdministrador = new javax.swing.JMenuItem();
        mniEmpleado = new javax.swing.JMenuItem();
        mniUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniAcercaDe = new javax.swing.JMenuItem();

        mnuLogin.setText("Log-in");

        mniAdministrador.setText("Administrador");
        mniAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAdministradorActionPerformed(evt);
            }
        });
        mnuLogin.add(mniAdministrador);

        mniEmpleado.setText("Empleado");
        mniEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpleadoActionPerformed(evt);
            }
        });
        mnuLogin.add(mniEmpleado);

        mniUsuario.setText("Usuario");
        mniUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuarioActionPerformed(evt);
            }
        });
        mnuLogin.add(mniUsuario);

        jMenuBar1.add(mnuLogin);

        jMenu1.setText("Ayuda");

        mniAcercaDe.setText("AcercaDe");
        jMenu1.add(mniAcercaDe);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        // Create DesktopPane for InternalFrames
        desktopPane = new javax.swing.JDesktopPane();
        setContentPane(desktopPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    // Action Listeners para el menú "Log-in"
    private void mniAdministradorActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        abrirLogin("Administrador");
    }                                                 

    private void mniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        abrirLogin("Empleado");
    }                                            

    private void mniUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        abrirLogin("Usuario");
    }                                           

    // Método para abrir el Login
    private void abrirLogin(String tipo) {
        String dni = JOptionPane.showInputDialog(this, "Usuario:", tipo + " Log-in", JOptionPane.QUESTION_MESSAGE);
        if (dni != null && dni.matches("\\d{8}")) {
            String password = JOptionPane.showInputDialog(this, "Contraseña:", tipo + " Log-in", JOptionPane.QUESTION_MESSAGE);
            if (password != null && password.equals(dni)) {
                JOptionPane.showMessageDialog(this, "¡Bienvenido, " + tipo + "!", "Log-in exitoso", JOptionPane.INFORMATION_MESSAGE);
                abrirFrame(tipo);
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para abrir el InternalFrame correspondiente
    private void abrirFrame(String tipo) {
        // Crear y agregar InternalFrames según el tipo
        if (tipo.equals("Administrador")) {
            IfrmAdministrador frmAdmin = new IfrmAdministrador();
            desktopPane.add(frmAdmin);
            frmAdmin.setVisible(true);
        } else if (tipo.equals("Empleado")) {
            IfrmEmpleado frmEmpleado = new IfrmEmpleado();
            desktopPane.add(frmEmpleado);
            frmEmpleado.setVisible(true);
        } else if (tipo.equals("Usuario")) {
            IfrmUsuario frmUsuario = new IfrmUsuario();
            desktopPane.add(frmUsuario);
            frmUsuario.setVisible(true);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalOrquiBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenuItem mniAdministrador;
    private javax.swing.JMenuItem mniEmpleado;
    private javax.swing.JMenuItem mniUsuario;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration                   
}