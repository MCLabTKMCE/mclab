package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button submit;
private EditText names,ages,mail,addresses,qual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names=findViewById(R.id.name);
        ages=findViewById(R.id.ages);
        mail=findViewById(R.id.email);
        addresses=findViewById(R.id.address);
        qual=findViewById(R.id.qualification);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent page = new Intent(MainActivity.this,MainActivity2.class);
                page.putExtra( "name",names.getText().toString());
                page.putExtra("age",ages.getText().toString());
                page.putExtra("email",mail.getText().toString());
                page.putExtra("address",addresses.getText().toString());
                page.putExtra("qual",qual.getText().toString());
                startActivity(page);
            }
        });
    }
}