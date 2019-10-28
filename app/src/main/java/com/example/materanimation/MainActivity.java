package com.example.materanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img1,img2;
//    private EditText enterno;
    private Boolean animation=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.txt);
        img2=findViewById(R.id.txt2);



        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (animation.equals(true)){
                    img1.animate().alpha(0).setDuration(1000);
                    img2.animate().alpha(1).setDuration(1000);
                    animation = false;
                }else if (!animation.equals(true)){
                    img2.animate().alpha(0).setDuration(1000);
                    img1.animate().alpha(1).setDuration(1000);
                    animation = true;
                }
            }
        });

    }
}
