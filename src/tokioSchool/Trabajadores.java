package tokioSchool;

import java.util.Arrays;

public enum Trabajadores {
    PROPIETARIO(new Salarios[]{Salarios.MIL_OCHOCIENTOS}),
    EMPLEADO(new Salarios[]{Salarios.MIL_DOCIENTOS}),
    CONTABLE(new Salarios[]{Salarios.MIL_QUINIENTOS}),
    ADMINISTRATIVO(new Salarios[]{Salarios.MIL_TRECIENTOS});

    private Salarios[] salario;

    private Trabajadores(Salarios[] salario) {
        this.salario = salario;
    }

    public Salarios[] getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String r ="";
        switch (this) {
            case ADMINISTRATIVO:
                r = "tipo: Administrativo , salario de: " + Arrays.toString(salario);
                break;
            case EMPLEADO:
                r="Es Empleado y tiene un salario de: " + Arrays.toString(salario);
                break;
            case PROPIETARIO:
                r="Es Propietario y tiene un salario de: " +  Arrays.toString(salario);
                break;
            case CONTABLE:
                r="Es Contable y tiene un salario de: " +  Arrays.toString(salario);

        }
        return r;
    }
}
