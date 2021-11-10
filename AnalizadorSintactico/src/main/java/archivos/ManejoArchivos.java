/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author CIROSS
 */
public class ManejoArchivos {

    public static File archivo;

    public static void abrirArchivo(Container container, JTextArea txArea) {

        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(container);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            archivo = fileChosser.getSelectedFile();

            try {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                txArea.setText("");
                while ((linea = br.readLine()) != null) {
                    txArea.append(linea + "\n");
                }
                fr.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido abrir el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido abrir el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

        }
    }

    public static void guardarArchivo(Component container, JTextArea txArea){

        if (archivo != null) {
            guardar(txArea);
        } else {
            guardarComo(container, txArea);
        }

    }
    
    public static void guardar(JTextArea txArea) {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(txArea.getText());
            bw.close();
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "El archivo no se ha guardado correctamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }   
        
    }
    
    public static void guardarComo(Component container, JTextArea txArea) {
 
        JFileChooser fileChosser = new JFileChooser();
        fileChosser.showSaveDialog(container);
        archivo = new File(fileChosser.getSelectedFile() + ".txt");

        guardar(txArea);
    }
    

}
