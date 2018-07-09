package fr.iutmindfuck.adapterviewexercise.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import fr.iutmindfuck.adapterviewexercise.R;
import fr.iutmindfuck.adapterviewexercise.data.Celebrity;

public class CelebritiesArrayAdapter extends ArrayAdapter<Celebrity> {
    public CelebritiesArrayAdapter(Context context, ArrayList<Celebrity> celebrities) {
        super(context, 0, celebrities);
    }


    static class ViewHolder{
        TextView textView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        ViewHolder viewHolder;

        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.celebrity_list_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textView = listViewItem.findViewById(R.id.celebrity_name);
        }
        else{
            viewHolder = (ViewHolder) listViewItem.getTag();
        }

        Celebrity celebrity = getItem(position);

        if(celebrity != null){
            viewHolder.textView.setText(celebrity.getCelebrityName());
        }

        ImageView imageView = listViewItem.findViewById(R.id.celebrity_picture);

        assert celebrity != null;
        switch (celebrity.getCelebrityGender()) {
            case "Man":
                imageView.setBackgroundColor(Color.rgb(0, 0, 255));
                break;
            case "Woman":
                imageView.setBackgroundColor(Color.rgb(255, 0, 255));
                break;
            default:
                imageView.setBackgroundColor(Color.rgb(0, 0, 0));
                break;
        }

        return listViewItem;
    }
}
