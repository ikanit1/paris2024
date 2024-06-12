package com.example.paris2200;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ScheduleActivity extends AppCompatActivity {
    private RecyclerView recyclerViewSchedule;
    private ScheduleAdapter scheduleAdapter;
    private List<ScheduleItem> scheduleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        recyclerViewSchedule = findViewById(R.id.recyclerViewSchedule);
        recyclerViewSchedule.setLayoutManager(new LinearLayoutManager(this));

        scheduleList = new ArrayList<>();
        scheduleList.add(new ScheduleItem("Регби", "2024-07-24", "09:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Футбол", "2024-07-24", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Футбол", "2024-08-09", "18:00 - 20:00"));
        scheduleList.add(new ScheduleItem("Гандбол", "2024-07-25", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Гандбол", "2024-08-11", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Стрельба из лука", "2024-07-25", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Стрельба из лука", "2024-08-04", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Церемония открытия", "2024-07-26", "20:00 - 22:00"));
        scheduleList.add(new ScheduleItem("Стрельба", "2024-07-27", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Стрельба", "2024-08-05", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Теннис", "2024-07-27", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Теннис", "2024-08-04", "16:00 - 18:00"));
        scheduleList.add(new ScheduleItem("Настольный теннис", "2024-07-27", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Настольный теннис", "2024-08-10", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Скейтбординг", "2024-07-27", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Скейтбординг", "2024-08-07", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Бадминтон", "2024-07-27", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Бадминтон", "2024-08-05", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Хоккей", "2024-07-27", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Хоккей", "2024-08-09", "19:00 - 21:00"));
        scheduleList.add(new ScheduleItem("Пляжный волейбол", "2024-07-27", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Пляжный волейбол", "2024-08-10", "18:00 - 20:00"));
        scheduleList.add(new ScheduleItem("Гребля", "2024-07-27", "08:00 - 10:00"));
        scheduleList.add(new ScheduleItem("Гребля", "2024-08-10", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Баскетбол", "2024-07-27", "17:00 - 19:00"));
        scheduleList.add(new ScheduleItem("Баскетбол", "2024-08-11", "20:00 - 22:00"));
        scheduleList.add(new ScheduleItem("Велосипедный спорт", "2024-07-27", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Велосипедный спорт", "2024-08-04", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Дайвинг", "2024-07-27", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Дайвинг", "2024-08-10", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Бокс", "2024-07-27", "18:00 - 20:00"));
        scheduleList.add(new ScheduleItem("Бокс", "2024-08-10", "19:00 - 21:00"));
        scheduleList.add(new ScheduleItem("Дзюдо", "2024-07-27", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Дзюдо", "2024-08-03", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Фехтование", "2024-07-27", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Фехтование", "2024-08-04", "16:00 - 18:00"));
        scheduleList.add(new ScheduleItem("Спортивная гимнастика", "2024-07-27", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Спортивная гимнастика", "2024-08-10", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Волейбол", "2024-07-27", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Волейбол", "2024-08-11", "16:00 - 18:00"));
        scheduleList.add(new ScheduleItem("Водное поло", "2024-07-27", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Водное поло", "2024-08-11", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Парусный спорт", "2024-07-28", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Парусный спорт", "2024-08-08", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Конный спорт", "2024-07-30", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Конный спорт", "2024-08-04", "14:00 - 16:00"));
        scheduleList.add(new ScheduleItem("Триатлон", "2024-07-30", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Триатлон", "2024-08-05", "10:00 - 12:00"));
        scheduleList.add(new ScheduleItem("Гольф", "2024-08-01", "08:00 - 10:00"));
        scheduleList.add(new ScheduleItem("Гольф", "2024-08-10", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Лёгкая атлетика", "2024-08-02", "18:00 - 20:00"));
        scheduleList.add(new ScheduleItem("Лёгкая атлетика", "2024-08-11", "17:00 - 19:00"));
        scheduleList.add(new ScheduleItem("Борьба", "2024-08-05", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Борьба", "2024-08-11", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Спортивное скалолазание", "2024-08-05", "09:00 - 11:00"));
        scheduleList.add(new ScheduleItem("Спортивное скалолазание", "2024-08-10", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Тхэквондо", "2024-08-07", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Тхэквондо", "2024-08-10", "11:00 - 13:00"));
        scheduleList.add(new ScheduleItem("Тяжёлая атлетика", "2024-08-07", "15:00 - 17:00"));
        scheduleList.add(new ScheduleItem("Тяжёлая атлетика", "2024-08-10", "18:00 - 20:00"));
        scheduleList.add(new ScheduleItem("Современное пятиборье", "2024-08-08", "13:00 - 15:00"));
        scheduleList.add(new ScheduleItem("Современное пятиборье", "2024-08-11", "12:00 - 14:00"));
        scheduleList.add(new ScheduleItem("Брейк-данс", "2024-08-09", "17:00 - 19:00"));
        scheduleList.add(new ScheduleItem("Брейк-данс", "2024-08-10", "16:00 - 18:00"));
        scheduleList.add(new ScheduleItem("Церемония закрытия", "2024-08-11", "20:00 - 22:00"));

        scheduleAdapter = new ScheduleAdapter(scheduleList, this); // Передаем контекст здесь
        recyclerViewSchedule.setAdapter(scheduleAdapter);
    }
}
