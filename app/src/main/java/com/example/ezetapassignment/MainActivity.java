package com.example.ezetapassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mathoper.Addition;
import com.example.mathoper.MathOpsInterface;
import com.example.mathoper.Subtracrition;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edt_inputone, edt_inputtwo;
    TextView txt_addition, txt_subtriction, txt_inputone, txt_inputtwo, txt_output,txt_gotoanother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_inputone = findViewById(R.id.edt_inputone);
        edt_inputtwo = findViewById(R.id.edt_inputtwo);
        txt_addition = findViewById(R.id.txt_addition);
        txt_subtriction = findViewById(R.id.txt_subtriction);
        txt_inputone = findViewById(R.id.txt_inputone);
        txt_inputtwo = findViewById(R.id.txt_inputtwo);
        txt_output = findViewById(R.id.txt_output);
        txt_gotoanother = findViewById(R.id.txt_gotoanother);
        txt_addition.setOnClickListener(this);
        txt_subtriction.setOnClickListener(this);
        txt_gotoanother.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        txt_inputone.setText("Input one - " + edt_inputone.getText().toString());
        txt_inputtwo.setText("Input two - " + edt_inputtwo.getText().toString());

        switch (view.getId()) {
            case R.id.txt_addition:
                Addition add = new Addition();
                add.Addition(edt_inputone.getText().toString(), edt_inputtwo.getText().toString());
                txt_output.setText("Output is - "+String.valueOf(add.getResult()));
                break;
            case R.id.txt_subtriction:
                Subtracrition sub = new Subtracrition();
                sub.Subtracrition(edt_inputone.getText().toString(), edt_inputtwo.getText().toString());
                txt_output.setText("Output is - "+ String.valueOf(sub.getResult()));
                break;
            case R.id.txt_gotoanother:
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.ezetapassigment2");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(MainActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}


