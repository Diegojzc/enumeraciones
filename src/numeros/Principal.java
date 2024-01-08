package numeros;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);
        String respuesta= "";
        System.out.print("Introduzca mes para saber iniciales: ");
       do {
           try {
               String mes = teclado.next();
               Numeros num = Numeros.valueOf(mes.toUpperCase());
               System.out.println(num);
               System.out.println("quieres volver a preguntar");
               respuesta = teclado.next();
           }catch (Exception ex){
               System.out.println("error el mes ingresado");
               System.out.println("quieres volver a preguntar");
              respuesta = teclado.next();
               System.out.println("introduce mes para saber iniciales");
           }
       }while (respuesta.equals("si"));

    }
}
