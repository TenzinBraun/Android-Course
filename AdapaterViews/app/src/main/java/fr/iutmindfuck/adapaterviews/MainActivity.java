package fr.iutmindfuck.adapaterviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items = new ArrayList<>();
        items.add("Bulbasaur");
        items.add("Crackasaur");
        items.add("Ganjasaur");
        items.add("Charmander");
        items.add("Charmeleon");
        items.add("Charizard");
        items.add("Squirtle");
        items.add("Warturtle");
        items.add("Blastoise");
        items.add("Pikachu");
        items.add("Pichu");
        items.add("Dragonair");
        items.add("Psyduck");

        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Bulbausor","Grass",1));
        pokemons.add(new Pokemon("Crackasaur","Grass",2));
        pokemons.add(new Pokemon("Ganjasaur","Grass",3));
        pokemons.add(new Pokemon("Charmander","Fire",4));
        pokemons.add(new Pokemon("Charmeleon","Fire",5));
        pokemons.add(new Pokemon("Charizard","Fire",6));
        pokemons.add(new Pokemon("Squirtle","Water",7));
        pokemons.add(new Pokemon("Warturtle","Water",8));
        pokemons.add(new Pokemon("Blastoise","Water",9));

        PokemonArrayAdapter adapter = new PokemonArrayAdapter(this, pokemons);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
