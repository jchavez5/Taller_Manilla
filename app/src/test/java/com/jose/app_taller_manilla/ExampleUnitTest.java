package com.jose.app_taller_manilla;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
  public void total_cuero_martillo_oro_dolares(){
        double  cantidad=2,precio=100,tipomoneda=1;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(640000,resultado,0 );
    }
}