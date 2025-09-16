package com.example.array06;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the list view in the layout file by its Id.

        ListView listView = findViewById(R.id.listView);

        String[] fruits = {"apple", "banana", "cherry", "date", "grape", "kiwe", "lemon", "mango", "orange", "peach"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);
        listView.setAdapter(adapter);
    }
}
