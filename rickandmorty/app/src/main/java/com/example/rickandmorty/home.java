package com.example.rickandmorty;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class home extends AppCompatActivity {
    FusedLocationProviderClient fusedLocationClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        getLocation();
    }

    //Permissão de Localização
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 10){
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLocation();
            }
            else{
                {
                    Toast.makeText(home.this, "Permissão de Localização negada!",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    public void getLocation(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
        }
        else{
            requestPermission();
        }
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 10);
    }


    //Buttons
    public void btnhome(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }

    public void btnpers1(View view) {
        Intent intent = new Intent(this,personagem1.class);
        startActivity(intent);
    }

    public void btnpers2(View view) {
        Intent intent = new Intent(this,personagem2.class);
        startActivity(intent);
    }

    public void btnpers3(View view) {
        Intent intent = new Intent(this,personagem3.class);
        startActivity(intent);
    }

    public void btnpers4(View view) {
        Intent intent = new Intent(this,personagem4.class);
        startActivity(intent);
    }

    public void btnpers5(View view) {
        Intent intent = new Intent(this,personagem5.class);
        startActivity(intent);
    }

    public void btntemp1(View view) {
        Intent intent = new Intent(this,temporada1.class);
        startActivity(intent);
    }

    public void btntemp2(View view) {
        Intent intent = new Intent(this,temporada2.class);
        startActivity(intent);
    }

    public void btntemp3(View view) {
        Intent intent = new Intent(this,temporada3.class);
        startActivity(intent);
    }

    public void btntemp4(View view) {
        Intent intent = new Intent(this,temporada4.class);
        startActivity(intent);
    }

    public void btntemp5(View view) {
        Intent intent = new Intent(this,temporada5.class);
        startActivity(intent);
    }

    public void btntemp6(View view) {
        Intent intent = new Intent(this,temporada6.class);
        startActivity(intent);
    }
}