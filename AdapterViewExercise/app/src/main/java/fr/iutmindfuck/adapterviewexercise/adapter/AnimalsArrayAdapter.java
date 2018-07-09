package fr.iutmindfuck.adapterviewexercise.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.data.Animals;
import fr.iutmindfuck.adapterviewexercise.data.BrotherName;

public class AnimalsArrayAdapter extends ArrayAdapter<Animals> {


    public AnimalsArrayAdapter(Context context, ArrayList<Animals> animals) {
        super(context, 0, animals);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;

        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.animal_list_item,parent,false);
        }

        Animals animals = getItem(position);

        TextView animalName = listViewItem.findViewById(R.id.animal_name);
        TextView animalGender = listViewItem.findViewById(R.id.animal_gender);
        TextView animalSize = listViewItem.findViewById(R.id.animal_size);

        animalName.setText(animals.getAnimalName());
        animalGender.setText(animals.getAnimalGender());
        animalSize.setText(String.valueOf(animals.getAnimalSize()));

        return listViewItem;
    }
}
