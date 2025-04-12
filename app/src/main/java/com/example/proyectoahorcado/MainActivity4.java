package com.example.proyectoahorcado;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private TextView timePlayed;
    private Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4); // Asegúrate de que sea el layout correcto

        timePlayed = findViewById(R.id.timePlayed);
        restartButton = findViewById(R.id.restartButton);

        long elapsedTime = getIntent().getLongExtra("elapsedTime", 0);
        long seconds = (elapsedTime / 1000) % 60;
        long minutes = (elapsedTime / 1000) / 60;

        String timeText = String.format("Tiempo jugado: %02d:%02d", minutes, seconds);
        timePlayed.setText(timeText);


        restartButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }
}
