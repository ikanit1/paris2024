package com.example.paris2200;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import java.util.List;

public class QualifiersActivity extends AppCompatActivity {

    private AppDatabase db;
    private FootballPlayerDao footballPlayerDao;
    private RecyclerView recyclerView;
    private FootballPlayerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualifiers);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name").allowMainThreadQueries().build();
        footballPlayerDao = db.footballPlayerDao();

        if (footballPlayerDao.getAll().isEmpty()) {
            footballPlayerDao.insertAll(
                    new FootballPlayer("Лионель Месси", "Аргентина", "Нападающий", 36, "https://cdn-media.tass.ru/width/1020_b9261fa1/tass/m2/uploads/i/20190927/5182903.jpg"),
                    new FootballPlayer("Криштиану Роналду", "Португалия", "Нападающий", 39, "https://s-cdn.sportbox.ru/images/styles/upload/fp_fotos/5a/75/19d1fd371479921c32749b2e985b09f86614fdbab309a508433382.jpg"),
                    new FootballPlayer("Килиан Мбаппе", "Франция", "Нападающий", 25, "https://sport.tatar-inform.ru/resize/shd/images/uploads/news/2023/9/29/54e8233d5a078b4b593bbad7a0f40ecf.jpg"),
                    new FootballPlayer("Неймар", "Бразилия", "Нападающий", 32, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg/640px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg"),
                    new FootballPlayer("Кевин Де Брёйне", "Бельгия", "Полузащитник", 32, "https://www.zakon.kz/pbi/WEBP/2024-01-08/file-3f17b756-c99e-440d-9698-dee2980cf841/800x450.webp"),
                    new FootballPlayer("Гарри Кейн", "Англия", "Нападающий", 30, "https://upload.wikimedia.org/wikipedia/commons/9/91/Harry_Kane_on_October_10%2C_2023.jpg"),
                    new FootballPlayer("Вирджил ван Дейк", "Нидерланды", "Защитник", 32, "https://img.championat.com/news/big/f/h/virdzhil-van-dejk_15829141211871360214.jpg"),
                    new FootballPlayer("Лука Модрич", "Хорватия", "Полузащитник", 38, "https://upload.wikimedia.org/wikipedia/commons/c/c8/ISL-HRV_%287%29_%28cropped%29_%28cropped%29.jpg"),
                    new FootballPlayer("Роберт Левандовски", "Польша", "Нападающий", 35, "https://img.championat.com/s/732x488/news/big/n/c/robert-levandovski_1444546625228304959.jpg"),
                    new FootballPlayer("Джанлуиджи Доннарумма", "Италия", "Вратарь", 25, "https://s-cdn.sportbox.ru/images/styles/upload/fp_fotos/7d/e0/3224021afe767a5ece44b20e2a2f4d915e944d3cdd338462423921.jpg")
            );
        }

        List<FootballPlayer> players = footballPlayerDao.getAll();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FootballPlayerAdapter(players);
        recyclerView.setAdapter(adapter);
    }
}
