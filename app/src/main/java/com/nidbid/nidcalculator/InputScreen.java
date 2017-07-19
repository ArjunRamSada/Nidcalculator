package com.nidbid.nidcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class InputScreen extends AppCompatActivity {
    private EditText INUM1, INUM2;
    private CheckBox CBADD, CBSUB, CBMUL, CBDIV, CBMOD;
    private Button BTDON;
    private String OutString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);

        INUM1 = (EditText) findViewById(R.id.INUM1);
        INUM2 = (EditText) findViewById(R.id.INUM2);

        CBADD = (CheckBox) findViewById(R.id.CBADD);
        CBSUB = (CheckBox) findViewById(R.id.CBSUB);
        CBMUL = (CheckBox) findViewById(R.id.CBMUL);
        CBDIV = (CheckBox) findViewById(R.id.CBDIV);
        CBMOD = (CheckBox) findViewById(R.id.CBMOD);

        BTDON = (Button) findViewById(R.id.BTDON);

        BTDON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SubmitIntent = new Intent(InputScreen.this, OutputScreen.class);
                MakeOutString();
                SubmitIntent.putExtra("output", OutString);
                InputScreen.this.startActivity(SubmitIntent);
            }
        });
    }

    protected void MakeOutString() {
        OutString = "";
        int i1, i2;
        i1 = Integer.parseInt(INUM1.getText().toString());
        i2 = Integer.parseInt(INUM2.getText().toString());
        if (CBADD.isChecked()) {
            OutString += String.format("%d + %d = %d\n", i1, i2, (int)(i1+i2));
        }
        if (CBSUB.isChecked()) {
            OutString += String.format("%d - %d = %d\n", i1, i2, (int)(i1-i2));
        }
        if (CBMUL.isChecked()) {
            OutString += String.format("%d * %d = %d\n", i1, i2, (int)(i1*i2));
        }
        if (CBDIV.isChecked()) {
            OutString += String.format("%d / %d = %d\n", i1, i2, (int)(i1/i2));
        }
        if (CBMOD.isChecked()) {
            OutString += String.format("%d % %d = %d\n", i1, i2, (int)(i1%i2));
        }
    }
}
