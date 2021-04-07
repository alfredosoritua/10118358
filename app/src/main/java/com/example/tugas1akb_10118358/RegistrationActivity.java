package com.example.tugas1akb_10118358;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {
    //07 April 2021 - 10118358 - Alfredo Soritua - IF9
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
    }

    public void register(View view) {
        Intent intent = new Intent(RegistrationActivity.this, com.example.tugas1akb_10118358.LoginActivity.class);
        startActivity(intent);
    }
}