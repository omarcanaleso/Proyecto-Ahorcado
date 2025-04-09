package com.example.proyectoahorcado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private TextView timePlayed;
    private Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        timePlayed = findViewById(R.id.timePlayed);
        restartButton = findViewById(R.id.restartButton);

        // Obtener el tiempo jugado desde el intent
        long elapsedTime = getIntent().getLongExtra("elapsedTime", 0);
        double seconds = elapsedTime / 1000.0;

        // Mostrar el mensaje de victoria y el tiempo jugado
        timePlayed.setText("Tiempo total jugado: " + seconds + " segundos");

        // Reiniciar el juego
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
