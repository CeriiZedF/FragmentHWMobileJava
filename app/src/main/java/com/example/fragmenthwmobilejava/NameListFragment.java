package com.example.fragmenthwmobilejava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmenthwmobilejava.model.NameModel;

import java.util.ArrayList;
import java.util.List;

public class NameListFragment extends Fragment {

    private GridView gridView;
    private List<NameModel> nameModels;
    private NameAdapter nameAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_name_list, container, false);

        gridView = rootView.findViewById(R.id.gridView);
        nameModels = new ArrayList<>();
        nameModels.add(new NameModel("Марія"));
        nameModels.add(new NameModel("Олександр"));
        nameModels.add(new NameModel("Ірина"));
        nameModels.add(new NameModel("Дмитро"));
        nameModels.add(new NameModel("Катерина"));
        nameModels.add(new NameModel("Артур"));
        nameModels.add(new NameModel("Анастасія"));
        nameModels.add(new NameModel("Володимир"));
        nameModels.add(new NameModel("Тетяна"));
        nameModels.add(new NameModel("Максим"));


        nameAdapter = new NameAdapter(getActivity(), nameModels);
        gridView.setAdapter(nameAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            NameModel selectedName = nameModels.get(position);
            NameDetailFragment detailFragment = new NameDetailFragment();

            Bundle bundle = new Bundle();
            bundle.putString("name", selectedName.getName());
            detailFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, detailFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        return rootView;
    }
}
