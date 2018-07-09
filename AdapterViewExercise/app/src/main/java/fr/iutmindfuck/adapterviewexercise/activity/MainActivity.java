package fr.iutmindfuck.adapterviewexercise.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.adapter.BrotherNameAdapter;
import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.data.BrotherName;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<BrotherName> pokemonsName = new ArrayList<>();
        pokemonsName.add(new BrotherName("Arturito"));
        pokemonsName.add(new BrotherName("Sacréfion"));
        pokemonsName.add(new BrotherName("Thibfion"));
        pokemonsName.add(new BrotherName("Loulou"));
        pokemonsName.add(new BrotherName("Balthimort"));
        pokemonsName.add(new BrotherName("Paulito"));
        pokemonsName.add(new BrotherName("Vignafion"));

        BrotherNameAdapter adapter = new BrotherNameAdapter(this,pokemonsName);
        GridView gridView = findViewById(R.id.list_item_view);
        gridView.setAdapter(adapter);
    }
}
