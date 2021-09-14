package com.ripalay.hw_lesson_81.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.ripalay.hw_lesson_81.R;
import com.ripalay.hw_lesson_81.databinding.FragmentHeroesBinding;
import com.ripalay.hw_lesson_81.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment {
    private FragmentResultBinding binding;
    private  Bundle bundle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding = FragmentResultBinding.inflate(inflater);
    return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bundle = getArguments();
        assert bundle != null;
        binding.nameTv.setText(bundle.getString("getName"));
        binding.lifeTv.setText(bundle.getString("getLife"));
        Glide.with(requireContext()).load(bundle.getString("image")).into(binding.avaIv);
    }
}