package com.jose.app_taller_manilla;

/**
 * Created by Josechavez on 12/03/2018.
 */

public class Metodos {
    public static double total_colombia(double cantidad, double valor_Moneda,double tipo_moneda){
        if (tipo_moneda==1){
            return cantidad*(valor_Moneda*3200);
        }
        return cantidad*(valor_Moneda);
    }

}
