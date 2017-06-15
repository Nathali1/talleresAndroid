package com.example.dptoredes.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {

    TextView tfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        tfinal = (TextView)findViewById(R.id.textfinal);

        Intent i = getIntent();
        String msg1 = i.getStringExtra("usuarionuevo");
        String msg2 = i.getStringExtra("clavenueva");
        tfinal.setText("Hola "+msg1+" con clave: "+msg2);

    }


}
