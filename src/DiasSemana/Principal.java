package DiasSemana;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String []args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca dia para saber si es laborable o no: ");
        String dia = teclado.next();
        Dias dias = Dias.valueOf(dia.toUpperCase());
        System.out.println(dias);



    }
}
