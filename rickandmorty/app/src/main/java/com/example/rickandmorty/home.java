package com.example.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnhome(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }

    public void btnpers1(View view) {
        Intent intent = new Intent(this,personagem1.class);
        startActivity(intent);
    }
}