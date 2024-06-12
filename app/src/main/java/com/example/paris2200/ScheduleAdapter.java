package com.example.paris2200;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private List<ScheduleItem> scheduleList;
    private Context context;

    public ScheduleAdapter(List<ScheduleItem> scheduleList, Context context) {
        this.scheduleList = scheduleList;
        this.context = context;
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

        holder.itemView.setOnClickListener(view -> {
            // Создание интента для добавления события в Google Календарь
            Intent intent = new Intent(Intent.ACTION_INSERT)
                    .setData(CalendarContract.Events.CONTENT_URI)
                    .putExtra(CalendarContract.Events.TITLE, scheduleItem.getEventName())
                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, getBeginTimeMillis(scheduleItem))
                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, getEndTimeMillis(scheduleItem));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }

    private long getBeginTimeMillis(ScheduleItem scheduleItem) {
        String dateTime = scheduleItem.getEventDate() + " " + scheduleItem.getEventTime().split(" - ")[0];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        try {
            Date date = sdf.parse(dateTime);
            return date != null ? date.getTime() : System.currentTimeMillis();
        } catch (ParseException e) {
            e.printStackTrace();
            return System.currentTimeMillis();
        }
    }

    private long getEndTimeMillis(ScheduleItem scheduleItem) {
        String dateTime = scheduleItem.getEventDate() + " " + scheduleItem.getEventTime().split(" - ")[1];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        try {
            Date date = sdf.parse(dateTime);
            return date != null ? date.getTime() : System.currentTimeMillis() + 3600000;
        } catch (ParseException e) {
            e.printStackTrace();
            return System.currentTimeMillis() + 3600000;
        }
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
