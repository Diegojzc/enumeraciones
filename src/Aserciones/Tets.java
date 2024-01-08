package Aserciones;
import static org.junit.jupiter.api.Assertions.*;
public class Tets {

    @org.junit.jupiter.api.Test
    void Prueba(){
        Ejemplo ej = new Ejemplo();
      assertEquals(11,ej.suma(1,10));
    }
}
