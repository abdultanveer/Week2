package com.spot.week2;

import androidx.annotation.Nullable;
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
       //homeIntent.putExtra("newparticipant","anil");
       startActivityForResult(homeIntent,9);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent mIntent) {
        super.onActivityResult(requestCode, resultCode, mIntent);
        String name = mIntent.getExtras().getString("name");
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
    }
}
