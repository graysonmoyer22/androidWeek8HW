package com.example.week8;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hover_button = (Button) findViewById(R.id.hover);
        Button transition_button = (Button) findViewById(R.id.transition);
        final Button snackbar_button = (Button) findViewById(R.id.snackbar);
        hover_button.setOnHoverListener(new View.OnHoverListener() {
            //note won't be able to hover with emulator
            @Override
            public boolean onHover(View v, MotionEvent event) {
                Toast.makeText(MainActivity.this,
                        "short toast y'all!", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        transition_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "onward!", Toast.LENGTH_LONG).show();
                startTheNewActivity();
            }
        });

        snackbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.content), "this is a snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
    }
    void startTheNewActivity(){
        Intent intent = new Intent(this, com.example.week8.SeeActivity.class);
        startActivity(intent);
    }
}
