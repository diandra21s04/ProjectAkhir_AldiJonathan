package com.example.listview_aldijonathansiagian;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView ;

public class MainActivity extends AppCompatActivity {
    ListView;
    String tutorials[]
            = { "Algoritma dan Pemrograman", "Struktur Data", "Basis Data",
            "Pemrograman Berbasis Mobile 2", "Web 2", "Metodologi Penelitian",
            "Pemrograman Berbasis Mobile 1", "Web 1", "Data Science" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>
        this,
        android.R.layout.simple_expandable_list_item_1, tutorials;
        l .setAdapter(arr);
    }
}