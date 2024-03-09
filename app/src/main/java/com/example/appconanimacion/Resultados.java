package com.example.appconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    Button btnVolver;
    TextView txtTexto, txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Intent intent = getIntent();
        String valorRecibido = intent.getStringExtra("valor");
        String textoRecibido = intent.getStringExtra("texto");

        // Utiliza el valor recibido como desees, por ejemplo, mostrarlo en un TextView
        txtTexto = findViewById(R.id.txtTexto);
        txtValor = findViewById(R.id.txtValor);
        btnVolver = findViewById(R.id.btnVolver);

        txtTexto.setText(textoRecibido);
        txtValor.setText(valorRecibido);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resultados.this, actividadPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}