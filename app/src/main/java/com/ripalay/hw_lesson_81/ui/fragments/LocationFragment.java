package com.ripalay.hw_lesson_81.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.hw_lesson_81.R;
import com.ripalay.hw_lesson_81.databinding.FragmentLocationBinding;
import com.ripalay.hw_lesson_81.ui.adapters.LocationAdapter;
import com.ripalay.hw_lesson_81.ui.models.LocationModel;

import java.util.ArrayList;


public class LocationFragment extends Fragment {
    private ArrayList<LocationModel> list = new ArrayList<>();
    private FragmentLocationBinding binding;
    private LocationAdapter adapter = new LocationAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocationBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }

    private void initRecycler(View view) {
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        list.add(new LocationModel("Planet", "Earth (C-137)"));
        adapter.setList(list);
        binding.locRv.setAdapter(adapter);
    }
}