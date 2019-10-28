package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button NewWorld;
    private Button wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewWorld = findViewById(R.id.newworld);
        NewWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewWorldActivity.class);
                startActivity(intent);

            }
        });
        wel = findViewById(R.id.welcome);
        wel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"欢迎使用萌新的第一个APP（太菜...）",Toast.LENGTH_LONG).show();
            }
        });
    }
}
