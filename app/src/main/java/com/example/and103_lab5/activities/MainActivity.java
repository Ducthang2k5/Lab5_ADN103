package com.example.and103_lab5.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.and103_lab5.R;

public class MainActivity extends AppCompatActivity {
    Button btnDistributor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnDistributor = (Button) findViewById(R.id.btnDistributor);

        btnDistributor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DistributorActivity.class);
                startActivity(intent);
            }
        });

    }
}