// ScheduleAdapter.java
package com.example.paris2200;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder> {

    private List<ScheduleItem> scheduleItems;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ScheduleItem item);
    }

    public ScheduleAdapter(List<ScheduleItem> scheduleItems, OnItemClickListener listener) {
        this.scheduleItems = scheduleItems;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewEvent;
        public TextView textViewDate;
        public TextView textViewTime;

        public ViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            textViewEvent = itemView.findViewById(R.id.textViewEvent);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick((ScheduleItem) v.getTag());
                    }
                }
            });
        }
    }

    @Override
    public ScheduleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_schedule, parent, false);
        return new ViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ScheduleItem item = scheduleItems.get(position);
        holder.textViewEvent.setText(item.getEventName());
        holder.textViewDate.setText(item.getDate());
        holder.textViewTime.setText(item.getTime());
        holder.itemView.setTag(item);
    }

    @Override
    public int getItemCount() {
        return scheduleItems.size();
    }
}
// изменение кода
