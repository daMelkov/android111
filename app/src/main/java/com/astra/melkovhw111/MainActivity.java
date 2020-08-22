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
        tasks.add(new Task("MelkovHw51", "AppBar приложения", 0));

        BaseAdapter adapter = new TaskAdapter(MainActivity.this, tasks);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}