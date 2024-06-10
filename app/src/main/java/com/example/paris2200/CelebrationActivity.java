package com.example.paris2200;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CelebrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebration);

        // Информация о праздновании Олимпийских игр в Париже 2024
        String celebrationInfo = "Париж 2024 - это грандиозное событие, которое превратит город в центр спорта и культуры. Ожидается, что олимпийские и паралимпийские игры привлекут миллионы зрителей и болельщиков со всего мира.";

        celebrationInfo += "\n\nГлавные мероприятия:\n";
        celebrationInfo += "- Церемония открытия Олимпийских игр: 26 июля 2024 года\n";
        celebrationInfo += "- Церемония закрытия Олимпийских игр: 11 августа 2024 года\n";
        celebrationInfo += "- Церемония открытия Паралимпийских игр: 28 августа 2024 года\n";
        celebrationInfo += "- Церемония закрытия Паралимпийских игр: 8 сентября 2024 года\n";

        celebrationInfo += "\nПрисоединяйтесь к нам и наслаждайтесь незабываемыми моментами спортивного праздника в самом сердце Парижа!";

        // Выделение важных дат в тексте
        Spannable spannable = new SpannableString(celebrationInfo);
        int startIndex = celebrationInfo.indexOf("26 июля 2024 года");
        int endIndex = startIndex + "26 июля 2024 года".length();
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        startIndex = celebrationInfo.indexOf("11 августа 2024 года");
        endIndex = startIndex + "11 августа 2024 года".length();
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        startIndex = celebrationInfo.indexOf("28 августа 2024 года");
        endIndex = startIndex + "28 августа 2024 года".length();
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        startIndex = celebrationInfo.indexOf("8 сентября 2024 года");
        endIndex = startIndex + "8 сентября 2024 года".length();
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Отображение информации о праздновании
        TextView celebrationTextView = findViewById(R.id.celebrationTextView);
        celebrationTextView.setText(spannable);

    }
}
