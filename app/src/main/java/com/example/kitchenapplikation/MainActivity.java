package com.example.kitchenapplikation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText mondayLunch;
private EditText tuesdayLunch;
private EditText wednesdayLunch;
private EditText thursdayLunch;
private EditText fridayLunch;
private Button updateLunchButton;
private TextView previewMenu;
private LunchMenu lunchMenu = new LunchMenu();

private Button stockMenuButton;
private Button scheduleMenuButton;
private Button editMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mondayLunch = (EditText) findViewById(R.id.mondayLunch);
        tuesdayLunch = (EditText) findViewById(R.id.tuesdayLunch);
        wednesdayLunch = (EditText) findViewById(R.id.wednesdayLunch);
        thursdayLunch = (EditText) findViewById(R.id.thursdayLunch);
        fridayLunch = (EditText) findViewById(R.id.fridayLunch);
        previewMenu = (TextView) findViewById(R.id.previewMenu);
        updateLunchButton = (Button) findViewById(R.id.updateMenuButton);
        updateLunchButton.setOnClickListener(this);

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

    @Override
    public void onClick(View view){
        lunchMenu.setMonday(mondayLunch.getText().toString());
        lunchMenu.setTuesday(tuesdayLunch.getText().toString());
        lunchMenu.setWednesday(wednesdayLunch.getText().toString());
        lunchMenu.setThursday(thursdayLunch.getText().toString());
        lunchMenu.setFriday(fridayLunch.getText().toString());

        previewMenu.setText(lunchMenu.toString());

    }


}
