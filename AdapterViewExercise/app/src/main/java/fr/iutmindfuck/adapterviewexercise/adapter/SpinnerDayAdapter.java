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
import fr.iutmindfuck.adapterviewexercise.data.Data;

public class SpinnerDayAdapter extends ArrayAdapter<Data> {


    public SpinnerDayAdapter(Context context, ArrayList<Data> datas) {
        super(context, android.R.layout.simple_list_item_1,datas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createView(position,convertView,parent);
    }

    private View createView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listViewItem = convertView;

        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item,parent,false);
        }

        TextView nameText = listViewItem.findViewById(R.id.week_day);

        Data data = getItem(position);

        nameText.setText(data.getWeekDay());

        return listViewItem;



    }
}
