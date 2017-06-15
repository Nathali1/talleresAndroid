package com.example.dptoredes.myapplication4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tag = "Lifecycle";
    EditText tuser;
    EditText tclave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tuser = (EditText)findViewById(R.id.editUsuario);
        tclave = (EditText)findViewById(R.id.editClave);
        /*final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(tag,"confirma");
                Intent intent= new Intent(MainActivity.this,AcercaDe.class);
                startActivity(intent);
            }
        });*/

    }

    public void abrirAcerca(View v){

        //Intent intent= new Intent(MainActivity.this,AcercaDe.class);

        //Intent intent1= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:962849347"));
        //startActivity(intent1);

        String tuser1 = tuser.getText().toString();
        String tclave1 = tclave.getText().toString();

        Intent intent= new Intent(MainActivity.this,AcercaDe.class);
        intent.putExtra("usuarionuevo",tuser1);
        intent.putExtra("clavenueva",tclave1);
        startActivity(intent);

    }
}
