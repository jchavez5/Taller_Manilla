package com.jose.app_taller_manilla;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cantidad;
    private TextView resultado;
    private Resources recursos;

    private Spinner materiales_spinner,dijes_spinner,tipos_spinner,tipospago_spinner;
    private String materiales[],dijes[],tipos[],tipospago[];
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad=findViewById(R.id.id_cantidad);
        resultado=findViewById(R.id.id_total);
        recursos=this.getResources();

        materiales_spinner=findViewById(R.id.id_material);
        dijes_spinner=findViewById(R.id.id_dije);
        tipos_spinner=findViewById(R.id.id_tipo);
        tipospago_spinner=findViewById(R.id.id_tipopago);

        materiales=recursos.getStringArray(R.array.Lista_materiales);
        ArrayAdapter<String> adapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,materiales);
        materiales_spinner.setAdapter(adapter);

        dijes=recursos.getStringArray(R.array.Lista_dije);
        ArrayAdapter<String> adapter1 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,dijes);
        dijes_spinner.setAdapter(adapter1);

        tipos=recursos.getStringArray(R.array.Lista_tipo);
        ArrayAdapter<String> adapter2 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,tipos);
        tipos_spinner.setAdapter(adapter2);

        tipospago=recursos.getStringArray(R.array.Lista_moneda);
        ArrayAdapter<String> adapter3 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,tipospago);
        tipospago_spinner.setAdapter(adapter3);

        boton=findViewById(R.id.id_boton);

    }
    public void calculo(View v){
        double  cant ,precio=0;
        int opciones_material,opciones_dije,opciones_tipo,opciones_moneda;
        resultado.setText("");

        cant=Double.parseDouble(cantidad.getText().toString());

        opciones_material  = materiales_spinner.getSelectedItemPosition();/*el spinner material*/
        opciones_dije=dijes_spinner.getSelectedItemPosition();/*el spinner dije*/
        opciones_tipo=tipos_spinner.getSelectedItemPosition();/*el spinner tipo*/
        opciones_moneda=tipospago_spinner.getSelectedItemPosition();/*el spinner moneda*/


        switch (opciones_material){
            case 0:/*cuero*/
                switch (opciones_dije){
                    case 0:/*martillo*/
                        switch (opciones_tipo){
                            case 0:/*oro*/
                                precio=Metodos.total_colombia(cant ,100,opciones_moneda);
                                break;
                        }
                        break;
                }

                break;
        }
        resultado.setText(""+String.format("%.2f",precio));


    }



}
