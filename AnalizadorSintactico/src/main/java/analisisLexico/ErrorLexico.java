
package analisisLexico;

public class ErrorLexico {
    
    private String cadena, descripcion;
    private int fila, columna;

    public ErrorLexico(String cadena) {
        this.setCadena(cadena);
    }

    public ErrorLexico(String cadena, int fila, int columna) {
        this.setCadena(cadena);
        this.setFila(fila);
        this.setColumna(columna);
    }
    
    public ErrorLexico(String cadena, int fila, int columna, String descripcion) {
        this.setCadena(cadena);
        this.setFila(fila);
        this.setColumna(columna);
        this.setDescripcion(descripcion);
    }

    public Object[] getArray() {
        
        Object[] arrayError = new Object[4];
        arrayError[0] = this.getCadena();
        arrayError[1] = this.getFila();
        arrayError[2] = this.getColumna();
        arrayError[3] = this.getDescripcion();
        
        return arrayError;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion + " ( " + cadena + " ) en fila " + fila + " y columna " + columna;
    }

    
}
