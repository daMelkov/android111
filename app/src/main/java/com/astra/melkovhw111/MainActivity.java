package com.astra.melkovhw111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task (
                "MelkovHw51",
                "Записная книжка в SharedPreferences",
                "Одно из самых популярных приложений на телефон - это заметки. Давайте создадим свои собственные. Элементы приложения:\n" +
                        "\n" +
                        "- EditText с заметкой.\n" +
                        "- Кнопка “Сохранить” (при клике на нее, заметка сохраняется в SharedPreferences). При перезапуске приложения, если заметка ранее была сохранена, она отображается в EditText компоненте.",
                R.drawable.hw51)
        );

        BaseAdapter adapter = new TaskAdapter(MainActivity.this, tasks);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}