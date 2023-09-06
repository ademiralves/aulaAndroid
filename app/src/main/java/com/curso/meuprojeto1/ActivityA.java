package com.curso.meuprojeto1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btnAbreActivity = findViewById(R.id.button);

        btnAbreActivity.setOnClickListener(
                e -> {
                    Intent abrirActivityB = new Intent(
                           this, ActivityB.class
                    );
                    startActivity(abrirActivityB);
                }
        );
    }
}
