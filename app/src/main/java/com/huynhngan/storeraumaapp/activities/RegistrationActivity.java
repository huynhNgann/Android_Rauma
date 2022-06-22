package com.huynhngan.storeraumaapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.huynhngan.storeraumaapp.MainActivity;
import com.huynhngan.storeraumaapp.R;

public class RegistrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void DangKi(View view) {
    }

    public void DangNhap(View view)
    {
    startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));

    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));

    }
}