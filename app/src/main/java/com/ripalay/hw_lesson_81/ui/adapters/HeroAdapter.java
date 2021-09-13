package com.ripalay.hw_lesson_81.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ripalay.hw_lesson_81.R;
import com.ripalay.hw_lesson_81.databinding.ItemHeroesBinding;
import com.ripalay.hw_lesson_81.ui.models.HeroModel;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
    private ArrayList<HeroModel> list = new ArrayList<>();

    public void setList(ArrayList<HeroModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemHeroesBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemHeroesBinding binding;
        public ViewHolder(@NonNull ItemHeroesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        public void onBind(HeroModel heroModel) {
            Glide.with(binding.heroIv.getContext())
                    .load(heroModel.getImage())
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(binding.heroIv);
            binding.lifeTv.setText(heroModel.getLife());
            binding.nameTv.setText(heroModel.getName());
        }
    }
}
