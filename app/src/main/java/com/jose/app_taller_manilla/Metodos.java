package com.jose.app_taller_manilla;

/**
 * Created by Josechavez on 12/03/2018.
 */

public class Metodos {
    public static double totalXprecio(double cantidad, double valor_Moneda,double tipo_moneda){
        if (tipo_moneda==1){
            return cantidad*(valor_Moneda*3200);
        }
        return cantidad*(valor_Moneda);
    }
    public static double calculo_Spinner(double cant , int opciones_material, int opciones_dije, int opciones_tipo,int opciones_moneda) {
        double precio =0;
            switch (opciones_material) {
                case 0:/*cuero*/
                    switch (opciones_dije) {
                        case 0:/*martillo*/
                            switch (opciones_tipo) {
                                case 0:/*oro*/
                                    precio = Metodos.totalXprecio(cant, 100, opciones_moneda);
                                    break;
                                case 1:/*plata*/
                                    precio = Metodos.totalXprecio(cant, 80, opciones_moneda);
                                    break;
                                case 2:/*niquel*/
                                    precio = Metodos.totalXprecio(cant, 70, opciones_moneda);
                                    break;
                                case 3:/*oro rosado*/
                                    precio = Metodos.totalXprecio(cant, 100, opciones_moneda);

                            }
                            break;
                        case 1:/*ancla  */
                            switch (opciones_tipo) {
                                case 0:/*oro*/
                                    precio = Metodos.totalXprecio(cant, 120, opciones_moneda);
                                    break;
                                case 1:/*plata*/
                                    precio = Metodos.totalXprecio(cant, 100, opciones_moneda);
                                    break;
                                case 2:/*niquel*/
                                    precio = Metodos.totalXprecio(cant, 90, opciones_moneda);
                                    break;
                                case 3:/*oro rosado*/
                                    precio = Metodos.totalXprecio(cant, 120, opciones_moneda);
                                    break;
                            }
                            break;
                    }

                    break;
                case 1:/*cuerda*/
                    switch (opciones_dije) {
                        case 0:/*martillo*/
                            switch (opciones_tipo) {
                                case 0:/*oro*/
                                    precio = Metodos.totalXprecio(cant, 90, opciones_moneda);
                                    break;
                                case 1:/*plata*/
                                    precio = Metodos.totalXprecio(cant, 70, opciones_moneda);
                                    break;
                                case 2:/*niquel*/
                                    precio = Metodos.totalXprecio(cant, 50, opciones_moneda);
                                    break;
                                case 3:/*oro rosado*/
                                    precio = Metodos.totalXprecio(cant, 90, opciones_moneda);
                                    break;
                            }
                            break;
                        case 1:/*ancla  */
                            switch (opciones_tipo) {
                                case 0:/*oro*/
                                    precio = Metodos.totalXprecio(cant, 110, opciones_moneda);
                                    break;
                                case 1:/*plata*/
                                    precio = Metodos.totalXprecio(cant, 90, opciones_moneda);
                                    break;
                                case 2:/*niquel*/
                                    precio = Metodos.totalXprecio(cant, 80, opciones_moneda);
                                    break;
                                case 3:/*oro rosado*/
                                    precio = Metodos.totalXprecio(cant, 110, opciones_moneda);
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return precio;

    }

}
