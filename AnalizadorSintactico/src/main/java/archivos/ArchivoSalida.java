
package archivos;

import java.awt.Component;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class ArchivoSalida {
    
    public static File archivo;

    public static void generarArchivo(Component container, JTextArea txArea, File archivo){

        try {

            JFileChooser fileChosser = new JFileChooser();
            fileChosser.showSaveDialog(container);
            archivo = new File(fileChosser.getSelectedFile() + ".html");

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(txArea.getText());

            
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
/*
    // inicio nueva parte
    String linea = "", documento, finDoc;

    documento = "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<title>" + archivo.getName() + "</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1>Salida de Datos</h1>\n"
            + "<p>";

    finDoc = "</p>\n</body>"
            + "\n</html>";

    for (int i = 0; i < txArea.getText().length(); i++) {
        if (txArea.getText().charAt(i) != '\n') {
            linea += txArea.getText().charAt(i);
        } else {
            if ("".equals(linea)) {
                documento += "</p>\n<p>";
            } else {
                documento += "<br>" + linea + "\n";
                linea = "";
            }
        }
    }
    documento += finDoc;
    bw.write(documento);
    // fin nueva parte
*/