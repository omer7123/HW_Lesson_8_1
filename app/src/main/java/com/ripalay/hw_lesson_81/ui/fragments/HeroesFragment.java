package com.ripalay.hw_lesson_81.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.hw_lesson_81.R;
import com.ripalay.hw_lesson_81.databinding.FragmentHeroesBinding;
import com.ripalay.hw_lesson_81.ui.adapters.HeroAdapter;
import com.ripalay.hw_lesson_81.ui.models.HeroModel;

import java.util.ArrayList;

public class HeroesFragment extends Fragment {
    private FragmentHeroesBinding binding;
    private ArrayList<HeroModel> list = new ArrayList<>();
    private HeroAdapter adapter = new HeroAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHeroesBinding.inflate(inflater);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler();
    }

    private ArrayList<HeroModel> createList() {
        list.add(new HeroModel("https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest/top-crop/width/360/height/360?cb=20160923150728",
                "Alive", "Rick Sanchez"));
        list.add(new HeroModel("https://pbs.twimg.com/profile_images/1171855444303908864/vIVH3XF7.jpg",
                "Alive", "Morty Smith"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/lMz-DjO1Z3ebPbgOI8zzofM56MDqahaA4jhn9jgGw3Sk9z9KRbQUJCZFEwMgCu19rTnxeb4=s91",
                "Dead", "Albert Einstein"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/X3lOhqPlxq5yWuZ_MFhagroVyITQacCSrxEiUOi8SF3PYbM2zZIalXeCZblP5gZ0ggnJJA=s91",
                "Dead intellect", "Jerry Smith"));
        list.add(new HeroModel("https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest/top-crop/width/360/height/360?cb=20160923150728",
                "Alive", "Rick Sanchez"));
        list.add(new HeroModel("https://pbs.twimg.com/profile_images/1171855444303908864/vIVH3XF7.jpg",
                "Alive", "Morty Smith"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/lMz-DjO1Z3ebPbgOI8zzofM56MDqahaA4jhn9jgGw3Sk9z9KRbQUJCZFEwMgCu19rTnxeb4=s91",
                "Dead", "Albert Einstein"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/X3lOhqPlxq5yWuZ_MFhagroVyITQacCSrxEiUOi8SF3PYbM2zZIalXeCZblP5gZ0ggnJJA=s91",
                "Dead intellect", "Jerry Smith"));
        list.add(new HeroModel("https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest/top-crop/width/360/height/360?cb=20160923150728",
                "Alive", "Rick Sanchez"));
        list.add(new HeroModel("https://pbs.twimg.com/profile_images/1171855444303908864/vIVH3XF7.jpg",
                "Alive", "Morty Smith"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/lMz-DjO1Z3ebPbgOI8zzofM56MDqahaA4jhn9jgGw3Sk9z9KRbQUJCZFEwMgCu19rTnxeb4=s91",
                "Dead", "Albert Einstein"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/X3lOhqPlxq5yWuZ_MFhagroVyITQacCSrxEiUOi8SF3PYbM2zZIalXeCZblP5gZ0ggnJJA=s91",
                "Dead intellect", "Jerry Smith"));
        list.add(new HeroModel("https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest/top-crop/width/360/height/360?cb=20160923150728",
                "Alive", "Rick Sanchez"));
        list.add(new HeroModel("https://pbs.twimg.com/profile_images/1171855444303908864/vIVH3XF7.jpg",
                "Alive", "Morty Smith"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/lMz-DjO1Z3ebPbgOI8zzofM56MDqahaA4jhn9jgGw3Sk9z9KRbQUJCZFEwMgCu19rTnxeb4=s91",
                "Dead", "Albert Einstein"));
        list.add(new HeroModel("https://lh3.googleusercontent.com/X3lOhqPlxq5yWuZ_MFhagroVyITQacCSrxEiUOi8SF3PYbM2zZIalXeCZblP5gZ0ggnJJA=s91",
                "Dead intellect", "Jerry Smith"));

        return list;
    }

    private void initRecycler() {
        adapter.setList(createList());
        binding.heroRv.setAdapter(adapter);
    }
}