package com.example.tugas1akb_10118358;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    //07 April 2021 - 10118358 - Alfredo Soritua - IF9
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registration(View view) {
        Intent intent= new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}