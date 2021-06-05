package com.example.sharedpreference;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email;
    Button login;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="name";
    private static final String KEY_EMAIL="email";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextName);
        email=findViewById(R.id.editTextEmail);
        login=findViewById(R.id.button);
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String n= sharedPreferences.getString(KEY_NAME,null);
        if(n != null){
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.putString(KEY_NAME,name.getText().toString());
                editor.putString(KEY_EMAIL,email.getText().toString());
                editor.apply();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}