package com.saurabhawathare.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button button, button01, button02, button03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);


        button.setOnClickListener(v -> {
            Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
            txtAnim.startAnimation(move);
        });

        button01.setOnClickListener(v -> {
            Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
            txtAnim.startAnimation(alpha);
        });

        button02.setOnClickListener(v -> {
            Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
            txtAnim.startAnimation(scale);
        });

        button03.setOnClickListener(v -> {
            Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
            txtAnim.startAnimation(rotate);
        });



    }

}
