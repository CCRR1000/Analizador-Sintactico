
package frontend;

import otrasFunciones.Busqueda;
import javax.swing.JTextArea;

public class PanelBusquedaResultados extends javax.swing.JPanel {

    
    public PanelBusquedaResultados() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBusqueda = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setOpaque(false);

        jLblTitulo.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Resultados de Búsqueda");
        jLblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextAreaBusqueda.setEditable(false);
        jTextAreaBusqueda.setColumns(20);
        jTextAreaBusqueda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextAreaBusqueda.setRows(5);
        jTextAreaBusqueda.setOpaque(false);
        jScrollPane1.setViewportView(jTextAreaBusqueda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void mostrarConteo() {
        jLblTitulo.setText("Resultados de Búsqueda:  "+ Busqueda.contador + " coincidencias");
    }
    
    public JTextArea getjTextAreaBusqueda() {
        return jTextAreaBusqueda;
    }

    public void setjTextAreaBusqueda(JTextArea jTextAreaBusqueda) {
        this.jTextAreaBusqueda = jTextAreaBusqueda;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBusqueda;
    // End of variables declaration//GEN-END:variables

}
