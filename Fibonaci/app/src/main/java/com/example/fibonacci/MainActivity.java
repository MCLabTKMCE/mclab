package com.example.fibonacci;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
 private EditText limit;
 private TextView result;
 private Button fib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        limit=findViewById(R.id.limit);
        result=(TextView) findViewById (R.id.result);
        fib=findViewById(R.id.button);
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(limit.getText().toString().length() == 0)
                {
                    limit.setText("0");
                }
                int l=Integer.parseInt(limit.getText().toString());
                int a=0,b=1,c=0;
                for(int i=2;i<=l;i++) {
                    a=b;
                    b=c;
                    c=a+b;
                    result.append(","+String.valueOf(c));
                }
            }
        });
    }
}