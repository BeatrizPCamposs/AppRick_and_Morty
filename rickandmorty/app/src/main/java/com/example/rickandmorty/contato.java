package com.example.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rickandmorty.databinding.ActivityContatoBinding;

public class contato extends AppCompatActivity {
    ActivityContatoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.emailAddress.getText().toString();
                String subject = binding.subject.getText().toString();
                String message = binding.message.getText().toString();

                String[] enderecoemail = email.split(",");

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,enderecoemail);
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);

                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(contato.this, "App não instalado no dispositivo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void btnhomemenu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}