package com.arkamovil.android.Informacion;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.arkamovil.android.R;


public class PiePaginaRedes extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fm_piepaginaredes, container, false);

        //Se crea el evento para ir a la pagina web de google+
        ImageView img_twitter = (ImageView) rootView.findViewById(R.id.twitter);
        img_twitter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.twitter.com"));
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////

        //Se crea el evento para ir a la pagina web de google+
        ImageView img_google = (ImageView) rootView.findViewById(R.id.google);
        img_google.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////

        //Se crea el evento para ir a la pagina web de google+
        ImageView img_facebook = (ImageView) rootView.findViewById(R.id.facebook);
        img_facebook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.facebook.com"));
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////
        return rootView;
    }

}