package gui.operacionesEmpleado;
import javax.swing.table.DefaultTableModel;


public class PamMovimientos extends javax.swing.JPanel {

    DefaultTableModel mt = new DefaultTableModel();
    public PamMovimientos() {
        initComponents();
        String ids[] = {"Dia","Mes","Año","Tipo","Monto"};
        mt.setColumnIdentifiers(ids);
        tblMovimientos.setModel(mt);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panBlanco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();

        panBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panBlanco.setPreferredSize(new java.awt.Dimension(1140, 784));

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        panBlanco.add(jScrollPane1);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panBlanco;
    private javax.swing.JTable tblMovimientos;
}
