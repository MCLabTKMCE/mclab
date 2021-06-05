package com.example.sharedpreference;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView text_name,text_email;
    Button button_logout;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="name";
    private static final String KEY_EMAIL="email";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text_name=findViewById(R.id.text_name);
        text_email=findViewById(R.id.text_email);
        button_logout=findViewById(R.id.button_logout);
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String n= sharedPreferences.getString(KEY_NAME,null);
        String e= sharedPreferences.getString(KEY_EMAIL,null);
        if(n != null || e!=null) {
            text_name.setText("Name : "+n);
            text_email.setText("Email Id : "+e);
        }
        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(MainActivity2.this,"Logout Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}