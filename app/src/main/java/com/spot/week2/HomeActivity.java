package com.spot.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.Inet4Address;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      /*String name =  getIntent().getExtras().getString("newparticipant");
        TextView resTextView = findViewById(R.id.textViewres);
        resTextView.setText(name);*/
    }

    public void handleClicks(View view) {
        EditText nameEditText = findViewById(R.id.editTextname);
        String name = nameEditText.getText().toString();
        Intent mIntent = new Intent();
        mIntent.putExtra("name",name);
        setResult(RESULT_OK,mIntent);
        finish();
    }
}
