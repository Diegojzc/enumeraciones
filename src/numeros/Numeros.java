package numeros;

import java.util.Locale;

public enum Numeros {
    ENERO("E1"), FEBRERO("F2"), MARZO("M3"), ABRIL("A4"), MAYO("M5"), JUNIO("J6"), JULIO("J7"), AGOSTO("A8"),
    SEPTIEMBRE("S9"), OCTUBRE("O10"), NOVIEMBRE("N11"), DICIEMBRE("12");

    private String iniciales;

    private Numeros(String iniciales){
        this.iniciales = iniciales;
    }
    public String getIniciales() {
        return iniciales;
    }

    @Override
    public String toString() {
        switch (this){
            case ENERO:
            case FEBRERO:
            case MARZO:
            case ABRIL:
            case MAYO:
            case JUNIO:
            case JULIO:
            case AGOSTO:
            case SEPTIEMBRE:
            case OCTUBRE:
            case NOVIEMBRE:
            case DICIEMBRE:

        }
        return "Las iniciales de son: " + this.getIniciales().toUpperCase() ;
    }
}
