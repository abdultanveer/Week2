package com.spot.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      String name =  getIntent().getExtras().getString("newparticipant");
        TextView resTextView = findViewById(R.id.textViewres);
        resTextView.setText(name);
    }
}
