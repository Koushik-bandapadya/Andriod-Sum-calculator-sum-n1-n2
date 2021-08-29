package com.example.andriod_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    Button button;
    EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast. makeText(getApplicationContext(),"Hello, This is toast",Toast. LENGTH_SHORT).show();
        text1=findViewById(R.id.text1);
        button=findViewById(R.id.button);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                text1.setText("Sum= " + sum);
            }
        });







//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int sum= Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
//                text1.setText("This is sum:"+sum);
//            }
//        });




    }
}