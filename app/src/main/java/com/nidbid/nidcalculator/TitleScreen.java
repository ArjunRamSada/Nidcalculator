package com.nidbid.nidcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class TitleScreen extends AppCompatActivity {

    RelativeLayout RL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        RL = (RelativeLayout) findViewById(R.id.RL);
        RL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event ) {
                Intent InputIntent = new Intent(TitleScreen.this, InputScreen.class);
                startActivity(InputIntent);
                return true;
            }
        });
    }
}
