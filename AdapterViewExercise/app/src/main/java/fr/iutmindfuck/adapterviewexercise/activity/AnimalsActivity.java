package fr.iutmindfuck.adapterviewexercise.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.adapter.AnimalsArrayAdapter;
import fr.iutmindfuck.adapterviewexercise.data.Animals;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        ArrayList<Animals> datas = new ArrayList<>();

        datas.add(new Animals("Lion",195,"Felin"));
        datas.add(new Animals("Chat",45,"Felin"));
        datas.add(new Animals("Autruche",210,"Oiseau"));
        datas.add(new Animals("Rouge-Gorge",25,"Oiseau"));
        datas.add(new Animals("Labrador",125,"Canidé"));
        datas.add(new Animals("Golden",120,"Canidé"));

        AnimalsArrayAdapter animalsArrayAdapter = new AnimalsArrayAdapter(this,datas);
        ListView listView = findViewById(R.id.list_animal);
        listView.setAdapter(animalsArrayAdapter);


    }
}
