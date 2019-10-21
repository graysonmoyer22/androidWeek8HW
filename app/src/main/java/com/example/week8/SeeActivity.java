package com.example.week8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SeeActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();
    ArrayAdapter<String> itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items.add("cats");
        items.add("dogs");
        items.add("Julia?");
        setContentView(R.layout.activity_adapter);
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SeeActivity.this,
                        "wow i am at position : " + id, Toast.LENGTH_LONG).show();
            }
        });

    }
}
