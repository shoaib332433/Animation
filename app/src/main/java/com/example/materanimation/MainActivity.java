package com.example.materanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText enterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt=findViewById(R.id.txt);
        enterno=findViewById(R.id.enterno);



        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                float num=Float.parseFloat(enterno.getText().toString());
                txt.animate().alpha(num).setDuration(500);

            }
        });

    }
}
