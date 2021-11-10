
package otrasFunciones;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.*;

public class Busqueda {

    public static int contador;
    
    public static void buscar(JTextArea jTextArea, String palabraBuscar) {

        DefaultHighlighter.DefaultHighlightPainter resaltador = new DefaultHighlighter.DefaultHighlightPainter(new Color(255, 205, 155));
        Highlighter resaltado = jTextArea.getHighlighter();
        resaltado.removeAllHighlights();

        String textoBusqueda = jTextArea.getText();
        int indice;
        contador = 0;

        for (int i = 0; i < textoBusqueda.length() - palabraBuscar.length() + 1; i++) {

            indice = i;
            String cadena = "";
            
            for (int j = 0; j < palabraBuscar.length(); j++) {

                if (textoBusqueda.charAt(indice) == palabraBuscar.charAt(j)) {
                    cadena = (cadena + textoBusqueda.charAt(indice));

                    if (iguales(cadena, palabraBuscar)) {
                        
                        contador++;
                        
                        try {
                            resaltado.addHighlight(i, i+palabraBuscar.length(), resaltador);
                            
                        } catch (BadLocationException ex) {
                            JOptionPane.showMessageDialog(null, "No se pudo resaltar la palabra" + ex.getMessage());
                        }
                    }
                }
                indice++;
            }
        }
    }

    public static boolean iguales(String cadena1, String cadena2) {
        
        if (cadena1.length() == cadena2.length()) {            
            for (int i = 0; i < cadena1.length(); i++) {                
                if (cadena1.charAt(i) != cadena2.charAt(i)) {                    
                    return false;
                }
            }
            return true;            
        } else {
            return false;
        }
        
    }
    
   
}
