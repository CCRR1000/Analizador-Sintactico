
package frontend;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import analisisLexico.ErrorLexico;

public class PanelErrores extends javax.swing.JPanel {

    private ArrayList<ErrorLexico> listaErrores;
    DefaultTableModel modeloTablaError = new DefaultTableModel();
    
    public PanelErrores(ArrayList<ErrorLexico> listaErrores) {
        
        initComponents();
        inicializarTabla();
        this.listaErrores = listaErrores;
        llenarTablaErrores();
        
    }
    
    public void inicializarTabla() {
        modeloTablaError.addColumn("Cadena");
        modeloTablaError.addColumn("Fila");
        modeloTablaError.addColumn("Columna");
        modeloTablaError.addColumn("Descripcion");

        this.jTableTokens.setModel(modeloTablaError);        
    }

    public void llenarTablaErrores() {
        
        for (int i = 0; i < listaErrores.size(); i++) {
            modeloTablaError.addRow(listaErrores.get(i).getArray());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelError = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTokens = new javax.swing.JTable();
        jLblTitulo = new javax.swing.JLabel();

        setOpaque(false);

        jPanelError.setLayout(new java.awt.GridLayout(1, 0));

        jTableTokens.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTableTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cadena", "Fila", "Columna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTokens);

        jPanelError.add(jScrollPane1);

        jTabbedPane1.addTab("Errores", jPanelError);

        jLblTitulo.setFont(new java.awt.Font("Corbel Light", 1, 16)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Salida de Resultados");
        jLblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JPanel jPanelError;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableTokens;
    // End of variables declaration//GEN-END:variables
}
