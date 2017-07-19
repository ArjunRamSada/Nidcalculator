package com.nidbid.nidcalculator;

import android.content.Intent;
import android.icu.util.Output;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OutputScreen extends AppCompatActivity {

    private TextView OUTTEXT;
    private Button BTMAIN, BTBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);

        OUTTEXT = (TextView) findViewById(R.id.OUTTEXT);

        BTMAIN = (Button) findViewById(R.id.BTMAIN);
        BTBACK = (Button) findViewById(R.id.BTBACK);

        Bundle bndl = getIntent().getExtras();
        OUTTEXT.setText(bndl.getString("output"));

        BTMAIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainIntent = new Intent(OutputScreen.this, TitleScreen.class);
                OutputScreen.this.startActivity(MainIntent);
            }
        });

        BTBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
