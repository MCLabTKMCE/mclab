package com.example.factorial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private TextView mTextViewResult;
    private Button mButtonFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText= findViewById(R.id.edittext_number);
        mTextViewResult = findViewById(R.id.textview_result);
        mButtonFact = findViewById(R.id.button_fact);
        mButtonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText.getText().toString().length() == 0) {
                    mEditText.setText("0");
                }
                int num = Integer.parseInt(mEditText.getText().toString());
                int f=1;
                for (int i=1;i<=num;i++)
                {
                    f=f*i;
                }
                mTextViewResult.setText(String.valueOf(f));
            }
        });
    }
}