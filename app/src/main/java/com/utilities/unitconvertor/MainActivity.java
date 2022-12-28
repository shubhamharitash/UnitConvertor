package com.utilities.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView out;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        out=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                double gaz=Double.parseDouble(s);
                double sqft=gaz*8.91359;
                out.setText("Area in Square Feet ="+sqft);



            }
        });
    }
}