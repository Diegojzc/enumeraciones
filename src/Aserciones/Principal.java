package Aserciones;

public class Principal {
    public static void main (String []args){

        int x = 100;
        while (x > 0){
            x=x/2-1;
            System.out.println(x);
            assert x>0:"x debe ser mayor a 0";

            Ejemplo ej = new Ejemplo();
            System.out.println(ej.metodoPrueba(10));

            System.out.println(ej.suma(6,5));
        }

    }
    
}
