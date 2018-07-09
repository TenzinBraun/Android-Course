package fr.iutmindfuck.adapterviewexercise.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.data.BrotherName;


public class BrotherNameAdapter extends ArrayAdapter<BrotherName> {

    public BrotherNameAdapter(@NonNull Context context, ArrayList<BrotherName> items) {
        super(context,0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;

        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item,parent,false);
        }

        //TextView nameText = listViewItem.findViewById(R.id.brother_name);

        BrotherName brotherName = getItem(position);

        //nameText.setText(brotherName.getBrotherName());

        return listViewItem;
    }
}
