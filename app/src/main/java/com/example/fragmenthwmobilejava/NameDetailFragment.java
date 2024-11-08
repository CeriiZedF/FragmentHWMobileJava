package com.example.fragmenthwmobilejava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.fragment.app.Fragment;

import com.example.fragmenthwmobilejava.model.NameModel;

public class NameDetailFragment extends Fragment {

    private TextView nameTextView;
    private TextView nameDayTextView;
    private TextView meaningTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_name_detail, container, false);

        nameTextView = rootView.findViewById(R.id.nameTextView);
        nameDayTextView = rootView.findViewById(R.id.nameDayTextView);
        meaningTextView = rootView.findViewById(R.id.meaningTextView);

        if (getArguments() != null) {
            String name = getArguments().getString("name");
            NameModel nameModel = findNameByName(name);

            if (nameModel != null) {
                nameTextView.setText(nameModel.getName());
                nameDayTextView.setText(nameModel.getNameDay());
                meaningTextView.setText(nameModel.getMeaning());
            }
        }

        //getActivity().getSupportFragmentManager().popBackStack();

        return rootView;
    }

    private NameModel findNameByName(String name) {
        for (NameModel nameModel : ((MainActivity) getActivity()).getNameModels()) {
            if (nameModel.getName().equals(name)) {
                return nameModel;
            }
        }
        return null;
    }
}

