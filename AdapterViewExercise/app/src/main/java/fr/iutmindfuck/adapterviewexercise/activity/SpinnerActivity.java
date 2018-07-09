package fr.iutmindfuck.adapterviewexercise.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.adapter.SpinnerDayAdapter;
import fr.iutmindfuck.adapterviewexercise.data.Data;

public class SpinnerActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_name_list);


        ArrayList<Data> datas = new ArrayList<>();

        datas.add(new Data("Lundi"));
        datas.add(new Data("Mardi"));
        datas.add(new Data("Mercredi"));
        datas.add(new Data("Jeudi"));
        datas.add(new Data("Vendredi"));
        datas.add(new Data("Samedi"));
        datas.add(new Data("Dimanche"));


        /*ArrayList<String> weekDay = new ArrayList<>();
        datas.add(new Data("Lundi"));
        datas.add(new Data("Mardi"));
        datas.add(new Data("Mercredi"));
        datas.add(new Data("Jeudi"));
        datas.add(new Data("Vendredi"));
        datas.add(new Data("Samedi"));
        datas.add(new Data("Dimanche"));*/

        SpinnerDayAdapter spinnerDayAdapter = new SpinnerDayAdapter(this, datas);
        Spinner spinner = findViewById(R.id.spinner_list);
        spinner.setAdapter(spinnerDayAdapter);

    }
}
