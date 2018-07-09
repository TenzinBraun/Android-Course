package fr.iutmindfuck.adapterviewexercise.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.adapter.CelebritiesArrayAdapter;
import fr.iutmindfuck.adapterviewexercise.data.Celebrity;

public class CelebritiesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celibrity);

        final ArrayList<Celebrity> celebrities = new ArrayList<>();

        celebrities.add(new Celebrity("Man", "Léonardo di Caprio","My mother is a walking miracle."));
        celebrities.add(new Celebrity("Man", "Johnny Depp","Music touches us emotionally, where words alone can't."));
        celebrities.add(new Celebrity("Woman", "Emma Watson","The less you reveal, the more people can wonder."));
        celebrities.add(new Celebrity("Woman", "Cameron Diaz","I'm living my life as a journey. My quest is to make it better every year."));

        CelebritiesArrayAdapter celebritiesArrayAdapter = new CelebritiesArrayAdapter(this,celebrities);
        ListView listView = findViewById(R.id.list_celebrity);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String celebrityQuote = celebrities.get(position).getQuote();
                Toast.makeText(CelebritiesActivity.this, celebrityQuote, Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(celebritiesArrayAdapter);

    }
}
