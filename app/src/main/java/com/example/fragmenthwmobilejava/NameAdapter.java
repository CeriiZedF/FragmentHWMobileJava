package com.example.fragmenthwmobilejava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fragmenthwmobilejava.model.NameModel;

import java.util.List;

public class NameAdapter extends ArrayAdapter<NameModel> {
    private Context context;
    private List<NameModel> names;

    public NameAdapter(Context context, List<NameModel> names) {
        super(context, 0, names);
        this.context = context;
        this.names = names;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_name, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        nameTextView.setText(names.get(position).getName());

        return convertView;
    }
}
