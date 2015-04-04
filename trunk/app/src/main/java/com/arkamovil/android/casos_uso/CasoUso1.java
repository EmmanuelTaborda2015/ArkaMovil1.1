package com.arkamovil.android.casos_uso;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.arkamovil.android.R;
import com.arkamovil.android.menu_desplegable.CasosUso;

import java.util.Calendar;


public class CasoUso1 extends Fragment {

    private static int year1;
    private static int month1;
    private static int day1;
    private static int year2;
    private static int month2;
    private static int day2;
    private TextView tvDisplayDate1;
    private TextView tvDisplayDate2;

    private int caso = 0;
    private int contador = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fm_casouso1, container, false);

        Button fecha = (Button) rootView.findViewById(R.id.fecha);
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplayDate1 = (TextView) getView().findViewById(R.id.fecha);
                tvDisplayDate2 = (TextView) getView().findViewById(R.id.proxvis);

                final Calendar c = Calendar.getInstance();
                year1 = c.get(Calendar.YEAR);
                month1 = c.get(Calendar.MONTH);
                day1 = c.get(Calendar.DAY_OF_MONTH);
                caso = 1;

                DatePickerDialog dialog = new DatePickerDialog(getActivity(), datePickerListener,
                        year1, month1, day1);
                dialog.show();
            }
        });

            Button proxvis = (Button) rootView.findViewById(R.id.proxvis);
            proxvis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                        final Calendar c = Calendar.getInstance();
                        year2 = c.get(Calendar.YEAR);
                        month2 = c.get(Calendar.MONTH);
                        day2 = c.get(Calendar.DAY_OF_MONTH);
                        caso = 2;

                    if (contador > 0) {
                        DatePickerDialog dialog = new DatePickerDialog(getActivity(), datePickerListener,
                                year1, month1, day1);
                        dialog.show();
                   }else{
                        Toast.makeText(getActivity(), "Porfavor ingrese los datos en orden", Toast.LENGTH_LONG).show();
                    }
                }
            });

        return rootView;
    }

    private DatePickerDialog.OnDateSetListener datePickerListener
            = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {

            if(caso==1){
                month1 = selectedMonth;
                day1 = selectedDay;
                year1 = selectedYear;
                tvDisplayDate1.setText(new StringBuilder()
                        // Month is 0 based, just add 1
                        .append(month1 + 1).append("-").append(day1).append("-")
                        .append(year1).append(" "));
                contador++;
            }

            if(caso==2){
                month2 = selectedMonth;
                day2 = selectedDay;
                year2 = selectedYear;

                if(verificarFechas()==true){
                    tvDisplayDate2.setText(new StringBuilder()
                            // Month is 0 based, just add 1
                            .append(month2 + 1).append("-").append(day2).append("-")
                            .append(year2).append(" "));
                }else{
                    Toast.makeText(getActivity(), "La fecha de la próxima visita no es valida, por favor verifiquela e ingresela de nuevo", Toast.LENGTH_LONG).show();
                }

            }
        }
    };

    public boolean verificarFechas(){

        boolean verificar = false;

        if(year1 <= year2){
            if(month1 <= month2){
                if(day1<=day2){
                    verificar = true;
                }
            }
        }
        return verificar;
    }

}
