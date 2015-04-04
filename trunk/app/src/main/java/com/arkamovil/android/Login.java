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
        //Se crea el evento para ir a la pagina web de google+
        ImageView img = (ImageView)findViewById(R.id.google);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////
    }

    public void login(View view){
        Intent i = new Intent(this, CasosUso.class );  /*metodo que abrira la segunda ventana al presionar el boton Opcion 'X' */
        startActivity(i);
    }


}
