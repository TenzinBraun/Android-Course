package fr.iutmindfuck.adapaterviews;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class PokemonArrayAdapter extends ArrayAdapter<Pokemon> {


    public PokemonArrayAdapter(Activity context, ArrayList<Pokemon> items){
        super(context,0,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;

        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.pokemon_list_item, parent, false);
        }

        TextView nameText = listViewItem.findViewById(R.id.pokemon_list_name);
        TextView typeText = listViewItem.findViewById(R.id.pokemon_list_type);
        TextView idText = listViewItem.findViewById(R.id.pokemon_list_id);

        Pokemon pokemon = getItem(position);

        nameText.setText(pokemon.getName());
        typeText.setText(pokemon.getType());
        idText.setText(String.valueOf(pokemon.getPokemonID()));

        return listViewItem;
    }

}
