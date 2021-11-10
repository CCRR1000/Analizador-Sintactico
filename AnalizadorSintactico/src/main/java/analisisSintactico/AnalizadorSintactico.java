
package analisisSintactico;

import analisisLexico.AnalizadorLexico;
import java.util.ArrayList;
import tokens.PalabraReservada;
import tokens.TipoToken;
import tokens.Token;

public class AnalizadorSintactico {
    
    TablaSimbolos tabla = new TablaSimbolos();
    Pila pila = new Pila("G");
    ArrayList<Token> listaTokens;
    AnalizadorLexico lexico = new AnalizadorLexico();
    //String[] tokens;
    final String epsilon = "#";

    public AnalizadorSintactico(ArrayList<Token> listaTokens) {
        this.listaTokens = listaTokens;
    }
    public AnalizadorSintactico(){}

    //public void analizar (String texto) {
    public void analizar (String texto) {
        
        //tokens = texto.split(" ");
        //this.listaTokens = lexico.getListaTokens();
        Token finPila = new Token("$", TipoToken.FIN_PILA);
        this.listaTokens.add(finPila);
        
        Token token = getToken();
        //String nuevoToken = getToken(), reduccion="";
        System.out.println("EL ARRAYLIST TIENE " + listaTokens.size() + " ELEMENTOS.");
        String nuevoToken = token.getTipoToken().toString();
        System.out.println(nuevoToken);
        String reduccion = "";
        do {
            // REPETIR 5 INICIAR ESCRIBIR "hola mundo" FIN 
            pila.printPila();
            
            if (nuevoToken.equals(pila.getUltimoNodo())) {
                reduccion = pila.pop();
                System.out.println("Reduce => " + reduccion);

                token = getToken();
                nuevoToken = token.getTipoToken().toString();
                System.out.println("\nNUEVO TOKEN: " + nuevoToken);
                
                
            } else if (epsilon.equals(pila.getUltimoNodo())) {
                reduccion = pila.pop();
                System.out.println("Reduce => " + reduccion);                
                
            } else {
                String notermin = pila.pop();
                pushProduccion(notermin, nuevoToken);
                
            }

        } while (!pila.getUltimoNodo().equals("$"));

        pila.printPila();
        System.out.println("\n - - - ANALISIS FINALIZADO - - -\n");
    }

    public void pushProduccion (String noTerminal, String terminal) {
        String produccion = " " + noTerminal + " -> ";
        String[] nuevosNodos = tabla.getProduccion(noTerminal, terminal);

        for (int i = 1; i <= nuevosNodos.length; i++) {
            pila.push(nuevosNodos[nuevosNodos.length-i]);
            produccion += nuevosNodos[i - 1] + " ";
        }
        System.out.println(produccion);
    }

    static int numToken=0;

    public Token getToken () {

        if (numToken < listaTokens.size()) {
            //String tkn = tokens[numToken];
            Token tkn = listaTokens.get(numToken);
            numToken++;
            return tkn;
        } else {
            return new Token("token falso", PalabraReservada.FIN);
        }

    }
    
}
