package com.example.paris2200;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class VenueAdapter extends RecyclerView.Adapter<VenueAdapter.VenueViewHolder> {
    private List<VenueItem> venueList;

    public VenueAdapter(List<VenueItem> venueList) {
        this.venueList = venueList;
    }

    @Override
    public VenueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_venue, parent, false);
        return new VenueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VenueViewHolder holder, int position) {
        VenueItem currentItem = venueList.get(position);
        holder.imageViewEvent.setImageResource(currentItem.getImageResource());
        holder.textViewEventName.setText(currentItem.getEventName());
        holder.textViewVenue.setText(currentItem.getVenue());
        holder.textViewDate.setText(currentItem.getDate());
        holder.textViewTime.setText(currentItem.getTime());
    }

    @Override
    public int getItemCount() {
        return venueList.size();
    }

    public static class VenueViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewEvent;
        public TextView textViewEventName;
        public TextView textViewVenue;
        public TextView textViewDate;
        public TextView textViewTime;

        public VenueViewHolder(View itemView) {
            super(itemView);
            imageViewEvent = itemView.findViewById(R.id.imageViewEvent);
            textViewEventName = itemView.findViewById(R.id.textViewEventName);
            textViewVenue = itemView.findViewById(R.id.textViewVenue);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);
        }
    }
}
