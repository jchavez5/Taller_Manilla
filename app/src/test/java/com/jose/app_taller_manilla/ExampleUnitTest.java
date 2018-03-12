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
    public void total_cuero_martillo_oro_pesos(){
        double  cantidad=2,precio=100,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(200,resultado,0 );
    }
    @Test
  public void total_cuero_martillo_oro_dolares(){
        double  cantidad=2,precio=100,tipomoneda=1;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(640000,resultado,0 );
    }
     @Test
    public void total_cuero_martillo_plata_dolares(){
        double  cantidad=2,precio=80,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(160,resultado,0 );
    }
    @Test
    public void total_cuero_martillo_niquel_dolares(){
        double  cantidad=3,precio=70,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(210,resultado,0 );
    }
    @Test
    public void total_cuero_martillo_oroRosado_dolares(){
        double  cantidad=3,precio=100,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(300,resultado,0 );
    }
    @Test
    public void total_cuero_ancla_oro_dolares(){
        double  cantidad=5  ,precio=120,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(600,resultado,0 );
    }
    @Test
    public void total_cuero_ancla_plata_dolares(){
        double  cantidad=5  ,precio=100,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(600,resultado,0 );
    }
    @Test
    public void total_cuero_ancla_niquel_dolares(){
        double  cantidad=5  ,precio=90,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(600,resultado,0 );
    }
    @Test
    public void total_cuero_ancla_oroRosado_dolares(){
        double  cantidad=5  ,precio=120,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(600,resultado,0 );
    }
    @Test
    public void total_cuerda_martillo_oro_dolares(){
        double  cantidad=1  ,precio=90,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(90,resultado,0 );
    }
    @Test
    public void total_cuerda_martillo_plata_dolares(){
        double  cantidad=2  ,precio=70,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(140,resultado,0 );
    }
    @Test
    public void total_cuerda_martillo_niquel_dolares(){
        double  cantidad=2  ,precio=50,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(100,resultado,0 );
    }
    @Test
    public void total_cuerda_martillo_oroRosado_dolares(){
        double  cantidad=2  ,precio=90,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(180,resultado,0 );
    }
    @Test
    public void total_cuerda_ancla_oro_dolares(){
        double  cantidad=2  ,precio=110,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(220,resultado,0 );
    }
    @Test
    public void total_cuerda_ancla_plata_dolares(){
        double  cantidad=2  ,precio=90,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(180,resultado,0 );
    }
    @Test
    public void total_cuerda_ancla_niquel_dolares(){
        double  cantidad=4  ,precio=80,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(320,resultado,0 );
    }
    @Test
    public void total_cuerda_ancla_oroRosado_dolares(){
        double  cantidad=4  ,precio=110,tipomoneda=0;
        double resultado=Metodos.total_colombia(cantidad,precio,tipomoneda);
        assertEquals(440,resultado,0 );
    }









}