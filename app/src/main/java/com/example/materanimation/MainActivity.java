package com.example.materanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt,txt2;
    private EditText enterno;
    private Boolean animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.txt);
        txt2=findViewById(R.id.txt2);
        enterno=findViewById(R.id.enterno);


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (animation.equals(true)){
                    txt.animate().alpha(0).setDuration(3000);
                    txt2.animate().alpha(1).setDuration(3000);
                    animation = false;
                }else if (!animation.equals(true)){
                    txt2.animate().alpha(0).setDuration(3000);
                    txt.animate().alpha(1).setDuration(3000);
                    animation = true;
                }
            }
        });

    }
}
