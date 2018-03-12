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
    public void cuero_martillo_oro_dolares(){
        double  cant = 5;
        int opcion_material=0,opcion_dije=0,opcion_tipo=0,opcion_tipomoneda=0;
        double resultado = Metodos.calculo_Spinner(cant,opcion_material,opcion_dije,opcion_tipo,opcion_tipomoneda);
        assertEquals(500,resultado,0 );
    }
    @Test
    public void cuero_martillo_oro_pesos(){
        double  cant = 5;
        int opcion_material=0,opcion_dije=0,opcion_tipo=0,opcion_tipomoneda=1;
        double resultado = Metodos.calculo_Spinner(cant,opcion_material,opcion_dije,opcion_tipo,opcion_tipomoneda);
        assertEquals(1600000,resultado,0 );
    }
    @Test
    public void cuerda_ancla_niquel_dolares(){
        double  cant = 1;
        int opcion_material=1,opcion_dije=1,opcion_tipo=2,opcion_tipomoneda=0;
        double resultado = Metodos.calculo_Spinner(cant,opcion_material,opcion_dije,opcion_tipo,opcion_tipomoneda);
        assertEquals(80,resultado,0 );
    }
    @Test
    public void cuerda_ancla_plata_pesos(){
        double  cant = 6;
        int opcion_material=1,opcion_dije=1,opcion_tipo=1,opcion_tipomoneda=1;
        double resultado = Metodos.calculo_Spinner(cant,opcion_material,opcion_dije,opcion_tipo,opcion_tipomoneda);
        assertEquals(1728000,resultado,0 );
    }

}