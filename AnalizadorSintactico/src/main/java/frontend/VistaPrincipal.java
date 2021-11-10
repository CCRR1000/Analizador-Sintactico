
package frontend;

import archivos.ManejoArchivos;
import analisisLexico.AnalizadorLexico;
import otrasFunciones.Busqueda;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import analisisLexico.ErrorLexico;
import tokens.Token;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import otrasFunciones.UndoRedo;
/**
 *
 * @author CIROSS
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private AnalizadorLexico aLexico = new AnalizadorLexico();
    private UndoRedo undoredo;
        
    /**
     * Creates new form Analizador
     */
    public VistaPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        getIcono();
        numeracionArea = new JTextArea();
        jScrollPane.setRowHeaderView(mostrarNumeroFilas());      
        undoredo = new UndoRedo(jTextAreaEdicion);
        
    }

    
    /**
     * Método que asigna el ícono a la ventana del analizador
     */
    public void getIcono(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/frontend/images/AnalizarIcon.png"));
        setIconImage(icono.getImage());       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGeneral = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaEdicion = new javax.swing.JTextArea();
        jPanelResultados = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCortar = new javax.swing.JButton();
        jButtonCopiar = new javax.swing.JButton();
        jButtonPegar = new javax.swing.JButton();
        jButtonDeshacer = new javax.swing.JButton();
        jButtonRehacer = new javax.swing.JButton();
        jButtonAnalizar = new javax.swing.JButton();
        jPanelBuscar = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jPanelUbicacion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFila = new javax.swing.JLabel();
        jLabelNumFila = new javax.swing.JLabel();
        jLabelColumna = new javax.swing.JLabel();
        jLabelNumColumna = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEdicion = new javax.swing.JMenu();
        jMenuItemCortar = new javax.swing.JMenuItem();
        jMenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemPegar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemDeshacer = new javax.swing.JMenuItem();
        jMenuItemRehacer = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDE Simulator");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelGeneral.setBackground(new java.awt.Color(50, 50, 50));
        jPanelGeneral.setLayout(new java.awt.BorderLayout());

        jPanelCentral.setOpaque(false);
        jPanelCentral.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane.setBorder(null);

        jTextAreaEdicion.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaEdicion.setColumns(20);
        jTextAreaEdicion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextAreaEdicion.setRows(5);
        jTextAreaEdicion.setBorder(null);
        jTextAreaEdicion.setSelectionColor(new java.awt.Color(0, 204, 204));
        jTextAreaEdicion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaEdicionCaretUpdate(evt);
            }
        });
        jScrollPane.setViewportView(jTextAreaEdicion);

        jPanelCentral.add(jScrollPane);

        jPanelResultados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelResultados.setOpaque(false);
        jPanelResultados.setLayout(new java.awt.GridLayout(1, 0));
        jPanelCentral.add(jPanelResultados);

        jPanelGeneral.add(jPanelCentral, java.awt.BorderLayout.CENTER);

        jPanelSuperior.setOpaque(false);

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setOpaque(false);
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotones.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBotones.setOpaque(false);
        jPanelBotones.setLayout(new javax.swing.BoxLayout(jPanelBotones, javax.swing.BoxLayout.LINE_AXIS));

        jButtonNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Nuevo.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo  ");
        jButtonNuevo.setBorder(null);
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonNuevo);

        jButtonAbrir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAbrir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAbrir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Abrir.png"))); // NOI18N
        jButtonAbrir.setText("Abrir  ");
        jButtonAbrir.setBorder(null);
        jButtonAbrir.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAbrir);

        jButtonGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar  ");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonGuardar);

        jButtonCortar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCortar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCortar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Cortar.png"))); // NOI18N
        jButtonCortar.setText("Cortar  ");
        jButtonCortar.setBorder(null);
        jButtonCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCortarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonCortar);

        jButtonCopiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCopiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Copiar.png"))); // NOI18N
        jButtonCopiar.setText("Copiar  ");
        jButtonCopiar.setBorder(null);
        jButtonCopiar.setContentAreaFilled(false);
        jButtonCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonCopiar);

        jButtonPegar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPegar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPegar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Pegar.png"))); // NOI18N
        jButtonPegar.setText("Pegar  ");
        jButtonPegar.setBorder(null);
        jButtonPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPegarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonPegar);

        jButtonDeshacer.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDeshacer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDeshacer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Deshacer.png"))); // NOI18N
        jButtonDeshacer.setText("Deshacer  ");
        jButtonDeshacer.setBorder(null);
        jButtonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeshacerActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonDeshacer);

        jButtonRehacer.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRehacer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRehacer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Rehacer.png"))); // NOI18N
        jButtonRehacer.setText("Rehacer  ");
        jButtonRehacer.setBorder(null);
        jButtonRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRehacerActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonRehacer);

        jButtonAnalizar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Archivo.png"))); // NOI18N
        jButtonAnalizar.setText("Generar Archivo");
        jButtonAnalizar.setBorder(null);
        jButtonAnalizar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAnalizar);

        jPanelHeader.add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        jPanelBuscar.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBuscar.setOpaque(false);
        jPanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscar.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanelBuscar.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        jButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Buscar.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelBuscar.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 50, 50));

        jPanelHeader.add(jPanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 280, 50));

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelGeneral.add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelUbicacion.setOpaque(false);
        jPanelUbicacion.setPreferredSize(new java.awt.Dimension(988, 35));
        jPanelUbicacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 5));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabelFila.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFila.setText("Fila: ");
        jPanel1.add(jLabelFila);

        jLabelNumFila.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNumFila.setText("1");
        jLabelNumFila.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jLabelNumFila);

        jLabelColumna.setForeground(new java.awt.Color(204, 204, 204));
        jLabelColumna.setText("  Columna: ");
        jPanel1.add(jLabelColumna);

        jLabelNumColumna.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNumColumna.setText("1");
        jLabelNumColumna.setToolTipText("");
        jLabelNumColumna.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jLabelNumColumna);

        jPanelUbicacion.add(jPanel1);

        jPanelGeneral.add(jPanelUbicacion, java.awt.BorderLayout.PAGE_END);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jPanelGeneral.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jPanelGeneral.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setBorderPainted(false);

        jMenuArchivo.setBackground(new java.awt.Color(51, 51, 51));
        jMenuArchivo.setForeground(new java.awt.Color(204, 204, 204));
        jMenuArchivo.setText("Archivo");

        jMenuItemNuevo.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemNuevo.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemNuevo);

        jMenuItemAbrir.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemAbrir.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuItemGuardar.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardar);

        jMenuItemGuardarComo.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemGuardarComo.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemGuardarComo.setText("Guardar como");
        jMenuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarComoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardarComo);

        jSeparator1.setBackground(new java.awt.Color(70, 70, 70));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuArchivo.add(jSeparator1);

        jMenuItemSalir.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemSalir.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuEdicion.setForeground(new java.awt.Color(204, 204, 204));
        jMenuEdicion.setText("Edición");
        jMenuEdicion.setToolTipText("");

        jMenuItemCortar.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemCortar.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemCortar.setText("Cortar");
        jMenuItemCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCortarActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemCortar);

        jMenuItemCopiar.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemCopiar.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemCopiar.setText("Copiar");
        jMenuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopiarActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemCopiar);

        jMenuItemPegar.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemPegar.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemPegar.setText("Pegar");
        jMenuItemPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPegarActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemPegar);

        jSeparator2.setBackground(new java.awt.Color(70, 70, 70));
        jMenuEdicion.add(jSeparator2);

        jMenuItemDeshacer.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemDeshacer.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemDeshacer.setText("Deshacer");
        jMenuItemDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeshacerActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemDeshacer);

        jMenuItemRehacer.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemRehacer.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemRehacer.setText("Rehacer");
        jMenuItemRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRehacerActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemRehacer);

        jMenuBar1.add(jMenuEdicion);

        jMenuAcercaDe.setForeground(new java.awt.Color(204, 204, 204));
        jMenuAcercaDe.setText("Acerca de...");

        jMenuItemAcercaDe.setBackground(new java.awt.Color(70, 70, 70));
        jMenuItemAcercaDe.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemAcercaDe.setText("Acerca de IDE Simulator");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if (jTextFieldBuscar.getText().isEmpty() || jTextAreaEdicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY TEXTO PARA REALIZAR LA BUSQUEDA");
        } else {
            
            PanelBusquedaResultados pnlBusqueda = new PanelBusquedaResultados();
            pnlBusqueda.getjTextAreaBusqueda().append(jTextAreaEdicion.getText());
            pnlBusqueda.setVisible(true);
            
            Busqueda.buscar(pnlBusqueda.getjTextAreaBusqueda(), jTextFieldBuscar.getText());
            pnlBusqueda.mostrarConteo();
            jPanelResultados.removeAll();
            
            jPanelResultados.add(pnlBusqueda);
            jPanelResultados.repaint();
            jPanelResultados.revalidate();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        
        archivos.ManejoArchivos.abrirArchivo(this, jTextAreaEdicion);
        limpiarResultados(false);
        setTitle("Analizador Léxico - " + ManejoArchivos.archivo.getName());
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizarActionPerformed
        
        aLexico.analizar(jTextAreaEdicion.getText()+" ");
        manejarPaneles();
    }//GEN-LAST:event_jButtonAnalizarActionPerformed

    private void jTextAreaEdicionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaEdicionCaretUpdate
        int pos = evt.getDot(); //mira los pasos del puntero

        try {
            int fil = jTextAreaEdicion.getLineOfOffset(pos) + 1; //devuelve la fila
            int col = pos - jTextAreaEdicion.getLineStartOffset(fil - 1) + 1; //devuelve la columna
            this.jLabelNumColumna.setText(col + "");
            this.jLabelNumFila.setText(fil + "");
            actualizarNumeroFila();
            
            undoredo.notarEdiciones(jButtonDeshacer, jButtonRehacer);
            undoredo.notarEdiciones(jMenuItemDeshacer, jMenuItemRehacer);

        } catch (BadLocationException exc) {
            System.out.println(exc);
        }
    }//GEN-LAST:event_jTextAreaEdicionCaretUpdate

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        
        limpiarResultados(true);
        ManejoArchivos.archivo = null;
        setTitle("Analizador Léxico");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        ManejoArchivos.guardarArchivo(this, jTextAreaEdicion);
        setTitle("Analizador Léxico - " + ManejoArchivos.archivo.getName());
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jMenuItemPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPegarActionPerformed
        jTextAreaEdicion.paste();
    }//GEN-LAST:event_jMenuItemPegarActionPerformed

    private void jButtonCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCortarActionPerformed
        jTextAreaEdicion.cut();
    }//GEN-LAST:event_jButtonCortarActionPerformed

    private void jButtonCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarActionPerformed
        jTextAreaEdicion.copy();
    }//GEN-LAST:event_jButtonCopiarActionPerformed

    private void jButtonPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPegarActionPerformed
        jTextAreaEdicion.paste();
    }//GEN-LAST:event_jButtonPegarActionPerformed

    private void jButtonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeshacerActionPerformed
        try {
            this.undoredo.undo();
        } catch (CannotUndoException e) {
            JOptionPane.showMessageDialog(null, "No hay ediciones para deshacer", "Deshacer edición", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeshacerActionPerformed

    private void jButtonRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRehacerActionPerformed
        try {
            this.undoredo.redo();
        } catch (CannotRedoException e) {
            JOptionPane.showMessageDialog(null, "No hay ediciones para rehacer", "Rehacer edición", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRehacerActionPerformed

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
        jButtonNuevoActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        jButtonAbrirActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        jButtonGuardarActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarComoActionPerformed
        ManejoArchivos.guardarComo(this, jTextAreaEdicion);
        setTitle("Analizador Léxico - " + ManejoArchivos.archivo.getName());
    }//GEN-LAST:event_jMenuItemGuardarComoActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCortarActionPerformed
        jTextAreaEdicion.cut();
    }//GEN-LAST:event_jMenuItemCortarActionPerformed

    private void jMenuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopiarActionPerformed
        jTextAreaEdicion.copy();
    }//GEN-LAST:event_jMenuItemCopiarActionPerformed

    private void jMenuItemDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeshacerActionPerformed
        jButtonDeshacerActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemDeshacerActionPerformed

    private void jMenuItemRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRehacerActionPerformed
        jButtonRehacerActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemRehacerActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        Color fondo = new Color(60,60,60);
        UIManager ui = null;
        ui.put("OptionPane.background", fondo);
        ui.put("Panel.background", fondo);

        String info = " PROYECTO FINAL\n"
        + "\n AUTOR:   Jaqueline Michelle Cifuentes Rodas"
        + "\n REGISTRO ACADEMICO:   201130968"
        + "\n CURSO:   Lenguajes Formales y de Programación";

        JTextArea infoTextArea = new JTextArea();
        infoTextArea.setText(info);
        infoTextArea.setBackground(fondo);
        infoTextArea.setForeground(new Color (200,200,200));
        infoTextArea.setFont(new Font("Tahoma", 1, 14));
        infoTextArea.setEditable(false);

        ImageIcon icono = new ImageIcon(getClass().getResource("/frontend/images/escudo.png"));
        JOptionPane.showMessageDialog(null, infoTextArea, "Acerca de IDE Simulator", JOptionPane.PLAIN_MESSAGE, icono);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

   
    private void manejarPaneles() {
        
        jPanelResultados.removeAll();
        jPanelResultados.setOpaque(false);
        
        if ("".equals(jTextAreaEdicion.getText())) {

            JLabel label = new JLabel("Ingrese un texto para analizar", SwingConstants.CENTER);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Consolas",0, 18));
            jPanelResultados.add(label);
            
        } else if (aLexico.getListaErrores().isEmpty()) {
            PanelTokens pnlToken = new PanelTokens(aLexico.getListaTokens());
            pnlToken.setVisible(true);
            jPanelResultados.add(pnlToken);
            
        } else {
            PanelErrores pnlError = new PanelErrores(aLexico.getListaErrores());
            pnlError.setVisible(true);
            jPanelResultados.add(pnlError);
            
        }
        
        jPanelResultados.repaint();
        jPanelResultados.revalidate();
    }
    
    private void limpiarResultados(boolean borrarTexto) {
        
        if (borrarTexto) {
            jTextAreaEdicion.setText("");
        }
        
        jPanelResultados.removeAll();
        jPanelResultados.repaint();
        jPanelResultados.revalidate();
        
    }
    
    int tFilas = 0;
    private void actualizarNumeroFila() {
            
        //tFilas = jTextAreaEdicion.getLineCount();
        numeracionArea.setText("");
        for (int i = 0; i < jTextAreaEdicion.getLineCount(); i++) {
            numeracionArea.append(" "+(i+1)+"\n");
            
        }

    }
    
    private JTextArea numeracionArea;
    
    private JTextArea mostrarNumeroFilas() {
        
        numeracionArea.setFont(new java.awt.Font("Consolas", 0, 14));
        numeracionArea.setBackground(new Color(50, 50, 50));
        numeracionArea.setForeground(Color.GRAY);        
        numeracionArea.setEditable(false);
        numeracionArea.append(" 1");
        
        return numeracionArea;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonAnalizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCopiar;
    private javax.swing.JButton jButtonCortar;
    private javax.swing.JButton jButtonDeshacer;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonPegar;
    private javax.swing.JButton jButtonRehacer;
    private javax.swing.JLabel jLabelColumna;
    private javax.swing.JLabel jLabelFila;
    private javax.swing.JLabel jLabelNumColumna;
    private javax.swing.JLabel jLabelNumFila;
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemCortar;
    private javax.swing.JMenuItem jMenuItemDeshacer;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemPegar;
    private javax.swing.JMenuItem jMenuItemRehacer;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelUbicacion;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextAreaEdicion;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables

}
