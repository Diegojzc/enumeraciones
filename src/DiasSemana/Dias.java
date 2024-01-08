package DiasSemana;

import java.util.Locale;

public enum Dias {
    LUNES( true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);


    private boolean laborable;

    Dias( boolean laborable) {
        this.laborable = laborable;
    }

    public boolean isLaborable() {
        return laborable;
    }

    @Override
    public String toString() {
        String respuesta = null;
        if (laborable){
           return respuesta = ("El dia "+ this.name().toLowerCase()+" es laborable" );
        }else{
          return  respuesta="El dia " + this.name().toLowerCase() +" no es laborable";
        }

        }

    }

