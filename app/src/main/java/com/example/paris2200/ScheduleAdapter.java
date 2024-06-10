package com.example.paris2200;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private List<ScheduleItem> scheduleList;

    public ScheduleAdapter(List<ScheduleItem> scheduleList) {
        this.scheduleList = scheduleList;
    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_schedule, parent, false);
        return new ScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        ScheduleItem scheduleItem = scheduleList.get(position);
        holder.eventName.setText(scheduleItem.getEventName());
        holder.eventDate.setText(scheduleItem.getEventDate());
        holder.eventTime.setText(scheduleItem.getEventTime());
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView eventName, eventDate, eventTime;

        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.textViewEvent);
            eventDate = itemView.findViewById(R.id.textViewDate);
            eventTime = itemView.findViewById(R.id.textViewTime);
        }
    }
}
