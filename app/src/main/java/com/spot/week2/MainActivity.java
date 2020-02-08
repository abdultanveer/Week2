package com.spot.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
       /* //Toast.makeText(this, "hello and welcome", Toast.LENGTH_SHORT).show();
        Intent dialIntent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:12345678"));
        startActivity(dialIntent);*/
       Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
       homeIntent.putExtra("newparticipant","anil");
       startActivity(homeIntent);
    }


}
