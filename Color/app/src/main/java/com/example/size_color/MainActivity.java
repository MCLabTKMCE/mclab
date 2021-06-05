package com.example.size_color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button size, color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textview);
        size=findViewById(R.id.size);
        color=findViewById(R.id.color);
        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextSize(TypedValue.COMPLEX_UNIT_SP,text.getTextSize()+1);
            }

        });
        color.setOnClickListener(new View.OnClickListener() {
            int colorIndex=1;
            public void onClick(View view){

                if(colorIndex==0) {
                    text.setTextColor(Color.GREEN);
                    colorIndex=1;
                }
                else if(colorIndex==1) {
                    text.setTextColor(Color.RED);
                    colorIndex=2;
                }
                else if(colorIndex==2) {
                    text.setTextColor(Color.BLUE);
                    colorIndex=3;
                }
                else if(colorIndex==3) {
                    text.setTextColor(Color.YELLOW);
                    colorIndex=4;
                }
                else {
                    text.setTextColor(Color.BLACK);
                    colorIndex=0;
                }
            }

        });
    }
}