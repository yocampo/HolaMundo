package com.example.usuario.holamundo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;


public class HolaMundo extends ActionBarActivity {

    private EditText nombre;
    private Button aceptar;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        nombre= (EditText)findViewById(R.id.txtNombre);
        aceptar= (Button)findViewById(R.id.btnAceptar);
        respuesta= (TextView)findViewById(R.id.txtRespuesta);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view)  {
                respuesta.setText(getString(R.string.Hola) + " " + String.valueOf(nombre.getText()));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hola_mundo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
