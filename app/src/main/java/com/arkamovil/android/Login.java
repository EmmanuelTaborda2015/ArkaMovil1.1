package com.arkamovil.android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.arkamovil.android.menu_desplegable.CasosUso;

public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view){
        Intent i = new Intent(this, CasosUso.class );  /*metodo que abrira la segunda ventana al presionar el boton Opcion 'X' */
        startActivity(i);
    }


}