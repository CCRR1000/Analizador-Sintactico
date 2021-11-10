
package analisisLexico;

import java.util.ArrayList;
import tokens.*;
import analisisLexico.*;

public class AnalizadorLexico {
    
    ArrayList<Token> listaTokens = new ArrayList<>();
    ArrayList<ErrorLexico> listaErrores = new ArrayList<>();
    static String transiciones;
    int fila = 1, columna = 1;

    public void analizar(String texto) {
        
        listaTokens.clear();
        listaErrores.clear();
        transiciones = ("\n  TRANSICIONES EN EL AUTOMATA:\n  ---------------------------\n\n");    
        String cadena = "";
        int estadoActual = 0, numSimbolo=0;

        for (int i = 0; i < texto.length(); i++) {   
            
            char chr = texto.charAt(i);
            //numSimbolo = MatrizLexico.getNumSimbolo(chr);
            
            if ((texto.charAt(i) == ' ') || (texto.charAt(i) == '\n') || (texto.charAt(i) == '\t') || (texto.charAt(i) == '\r') || (texto.charAt(i) == '\f')) { 

                if ((Character.isWhitespace(chr) && ( estadoActual==1 || estadoActual == 3 || estadoActual == 13)
                    || (chr=='\n' && (estadoActual==3))) ) {
                    
                    this.addTransicion("  S" + estadoActual + "  ->");
                    //System.out.println("  S" + estadoActual + "  ->");
                    estadoActual = MatrizLexico.nuevoEstado(chr, estadoActual);
                    this.addTransicion("  " + chr + "  ->  S" + estadoActual + "\n");
                    //System.out.println("  " + chr + "  ->  S" + estadoActual + "\n");
                    cadena += chr;

                    if (estadoActual < 0) {
                        this.agregarError(cadena, estadoActual, fila, columna);                    
                        estadoActual = 0;
                        cadena = "";
                    }


                } else {

                    if (!cadena.isEmpty()) {
                        this.agregarToken(cadena, estadoActual, fila, columna);
                        estadoActual = 0;
                        cadena = "";
                    }
                }


                
            } else {
                
                this.addTransicion("  S" + estadoActual + "  ->");
                //System.out.println("  S" + estadoActual + "  ->");
                estadoActual = MatrizLexico.nuevoEstado(chr, estadoActual);
                this.addTransicion("  " + chr + "  ->  S" + estadoActual + "\n");
                //System.out.println("  " + chr + "  ->  S" + estadoActual + "\n");
                cadena += chr;
                
                if (estadoActual < 0) {
                    this.agregarError(cadena, estadoActual, fila, columna);                    
                    estadoActual = 0;
                    cadena = "";
                }
                
            }
            
            if (chr == '\n') {
                fila++;
                columna = 0;
            }
            columna++;
        }

    }
    
    private void agregarError(String cadena, int estadoActual, int fila, int columna) {
        ErrorLexico erl = new ErrorLexico(cadena, fila, columna);
        if (estadoActual==-1) {
            erl.setDescripcion("Error léxico");
        } else if (estadoActual==-5) {
            erl.setDescripcion("Símbolo no admitido");
        }
        listaErrores.add(erl);
    }
    
    private void agregarToken(String cadena, int estadoActual, int fila, int columna) {

        Enum enumToken = null;
        for (TipoToken tk : TipoToken.values()) {
            if (tk.getAceptacion() == estadoActual) {
                enumToken = tk;    
            }
        }

        if (estadoActual==4) {
            for (PalabraReservada tk : PalabraReservada.values()) {
                if (tk.toString().equals(cadena)) {
                    enumToken = tk;
                }
            }
        }

        int columnaToken = columna - cadena.length();
        Token nuevoToken = new Token(cadena, enumToken, fila, columnaToken);
        listaTokens.add(nuevoToken);
        this.addTransicion("  Token: " + nuevoToken.getTipoToken().name() + ",   Lexema: " + nuevoToken.getLexema() + "\n\n");

    }
       
    public void addTransicion(String transiciones) {       
        this.transiciones = this.transiciones + transiciones;
    }
    
    public String getTransiciones() {
        return transiciones;
    }
    
    public ArrayList<Token> getListaTokens() {
        return listaTokens;
    }

    public void setListaTokens(ArrayList<Token> listaTokens) {
        this.listaTokens = listaTokens;
    }

    public ArrayList<ErrorLexico> getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(ArrayList<ErrorLexico> listaErrores) {
        this.listaErrores = listaErrores;
    }


}
