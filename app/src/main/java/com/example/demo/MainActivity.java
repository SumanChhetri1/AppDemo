package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        Intent intent_Login=new Intent(MainActivity.this,Login.class);
        startActivity(intent_Login);
        Toast.makeText(MainActivity.this,"Login comp",Toast.LENGTH_SHORT).show();
    }
}