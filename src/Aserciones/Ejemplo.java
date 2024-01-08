package Aserciones;

import java.util.Random;

public class Ejemplo {

    public int metodoPrueba(int x){
        int cont=0;
        int numero;
       do{
            numero = new Random().nextInt(x*2);
                cont++;
            }while (numero != x);
            return cont;
        }
        public int suma(int x1,int x2 ){
        return x1+x2;
        }

    }

