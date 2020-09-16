package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView textView;
    //MediaPlayer mp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView=findViewById(R.id.textView10);
        Intent intent = getIntent();
        String [] stringArray = intent.getStringArrayExtra("string-array");

        textView.setText(stringArray[0]+stringArray[1]);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //mp2=MediaPlayer.create(this,R.raw.onmyowndavidrenda);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mp2.stop();
    }
}
