package tokens;

public enum PalabraReservada {

    ESCRIBIR,
    REPETIR,
    INICIAR,
    SI,
    VERDADERO,
    FALSO,
    ENTONCES,
    FIN;


    @Override
    public String toString() {
        return name();
    }
    
}
