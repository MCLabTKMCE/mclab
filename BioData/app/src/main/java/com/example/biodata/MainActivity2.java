package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button back;
    private TextView result,result2,result3,result4,result5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result=findViewById(R.id.name);
        result2=findViewById(R.id.ages);
        result3=findViewById(R.id.email);
        result4=findViewById(R.id.address);
        result5=findViewById(R.id.qualification);
        Intent value=getIntent();
        String names=value.getStringExtra("name");
        result.setText(names);

        String ages=value.getStringExtra("age");
        result2.setText(ages);
        String mails=value.getStringExtra("email");
        result3.setText(mails);
        String addresses=value.getStringExtra("address");
        result4.setText(addresses);
        String qual=value.getStringExtra("qual");
        result5.setText(qual);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent page1=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(page1);
            }
        });

    }
}