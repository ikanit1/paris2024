package com.example.paris2200;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class FootballPlayerAdapter extends RecyclerView.Adapter<FootballPlayerAdapter.ViewHolder> {

    private List<FootballPlayer> players;

    public FootballPlayerAdapter(List<FootballPlayer> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_football_player, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FootballPlayer player = players.get(position);
        holder.nameTextView.setText(player.getName());
        holder.countryTextView.setText(player.getCountry());
        holder.positionTextView.setText(player.getPosition());
        holder.ageTextView.setText(String.valueOf(player.getAge()));

        // Загрузка изображения с помощью Glide
        Glide.with(holder.itemView.getContext())
                .load(player.getImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView countryTextView;
        TextView positionTextView;
        TextView ageTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            countryTextView = itemView.findViewById(R.id.countryTextView);
            positionTextView = itemView.findViewById(R.id.positionTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
        }
    }
}
