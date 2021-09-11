package com.example.digitclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.input_Et);
        Button button = (Button) findViewById(R.id.input_Btn);
        TextView textView = (TextView) findViewById(R.id.output_Tv);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText(text);
            }
        });

        Button actBtn = findViewById(R.id.activity_launcg_Btn);
        actBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MyActivity.class);
                startActivity(i);
            }
        });

//        Button finishBtn = findViewById(R.id.finish_Btn);
//        finishBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                finish();
//            }
//        });

        Button drawSampleBtn = findViewById(R.id.draw_sample_Btn);
        drawSampleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, DrawingActivity.class);
                startActivity(i);
            }
        });
    }
}