
package analisisSintactico;

import java.util.ArrayList;

public class Pila {
    
    private ArrayList<String> pila = new ArrayList<>();
    private String ultimoNodo;

    public Pila(String nodoInicial) {
        this.pila.add("$");
        this.pila.add(nodoInicial);
    }

    public void push (String nodo) {
        this.pila.add(nodo);
    }

    public String pop () {        
        String nodo = this.pila.remove(pila.size()-1);
        return nodo;
    }

    public void printPila () {
        System.out.println();
        for (String nd : this.pila) {
            System.out.print(nd + " ");
        }
        System.out.println("");
    }

    public ArrayList<String> getPila() {
        return pila;
    }

    public String getUltimoNodo() {
        ultimoNodo = pila.get(pila.size()-1);
        return ultimoNodo;
    }

    
}
