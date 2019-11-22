package com.example.kitchenapplikation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class schedule extends AppCompatActivity {
    private Button stockMenuButton;
    private Button scheduleMenuButton;
    private Button editMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        scheduleMenuButton = (Button) findViewById(R.id.scheduleMenuButton);
        scheduleMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSchedule();
            }
        });
        editMenuButton = (Button) findViewById(R.id.editMenuButton);
        editMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditMenu();
            }
        });
        stockMenuButton = (Button) findViewById(R.id.stockMenuButton);
        stockMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStock();
            }
        });

    }
    public void openStock(){
        Intent intent = new Intent(this, stock.class);
        startActivity(intent);
    }
    public void openEditMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openSchedule(){
        Intent intent = new Intent(this, schedule.class);
        startActivity(intent);
    }
}
