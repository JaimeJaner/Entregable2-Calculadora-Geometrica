package com.example.appconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;


public class actividadPrincipal extends AppCompatActivity {

    Button btnCalcularArea, btnCalcularPerimetro, btnCalcularSen, btnCalcularCos;
    EditText edtLadoUno, edtLadoDos, edtAngulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        btnCalcularArea = findViewById(R.id.btnCalcularArea);
        btnCalcularPerimetro = findViewById(R.id.btnCalcularPerimetro);
        btnCalcularSen = findViewById(R.id.btnCalcularSen);
        btnCalcularCos = findViewById(R.id.btnCalcularCos);
        edtLadoUno = findViewById(R.id.edtLadoUno);
        edtLadoDos = findViewById(R.id.edtLadoDos);
        edtAngulo = findViewById(R.id.edtAngulo);

        btnCalcularArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtLadoUno.getText().toString().isEmpty() || edtLadoDos.getText().toString().isEmpty()) {
                    Toast.makeText(actividadPrincipal.this, "Por favor, Ingrese ambos valores.", Toast.LENGTH_SHORT).show();

                } else {

                    int Area = Integer.parseInt(edtLadoUno.getText().toString())
                            * Integer.parseInt(edtLadoDos.getText().toString());

                    Intent intent = new Intent(actividadPrincipal.this, Resultados.class);
                    // Coloca los datos que deseas enviar a la Actividad 2
                    intent.putExtra("valor", (String.valueOf(Area)) + "Unidades");
                    intent.putExtra("texto", "Área del rectángulo: ");// Puedes enviar cualquier tipo de datos, no solo String
                    startActivity(intent);
                    finish();
                }

            }
        });

        btnCalcularPerimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtLadoUno.getText().toString().isEmpty() || edtLadoDos.getText().toString().isEmpty()) {

                    Toast.makeText(actividadPrincipal.this, "Por favor, Ingrese ambos valores.", Toast.LENGTH_SHORT).show();
                } else {
                    int Perimetro = (Integer.parseInt(edtLadoUno.getText().toString())
                            * 2) + (Integer.parseInt(edtLadoDos.getText().toString())*2);

                    Intent intent = new Intent(actividadPrincipal.this, Resultados.class);
                    // Coloca los datos que deseas enviar a la Actividad 2
                    intent.putExtra("valor", (String.valueOf(Perimetro)) + "Unidades");
                    intent.putExtra("texto", "Perímetro del rectángulo: ");// Puedes enviar cualquier tipo de datos, no solo String
                    startActivity(intent);
                    finish();
                }

            }
        });

        btnCalcularSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtAngulo.getText().toString().isEmpty()) {

                    Toast.makeText(actividadPrincipal.this, "Por favor, ingrese un ángulo.", Toast.LENGTH_SHORT).show();
                } else {

                    double seno = Math.sin(Math.toRadians(Double.parseDouble(edtAngulo.getText().toString())));
                    if (Math.abs(seno) < 0.000001) {
                        seno = 0.0;
                    }

                    Intent intent = new Intent(actividadPrincipal.this, Resultados.class);
                    // Coloca los datos que deseas enviar a la Actividad 2
                    intent.putExtra("valor", (String.valueOf(seno)));
                    intent.putExtra("texto", "Seno del ángulo: ");// Puedes enviar cualquier tipo de datos, no solo String
                    startActivity(intent);
                    finish();
                }
            }
        });

        btnCalcularCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtAngulo.getText().toString().isEmpty()) {
                    Toast.makeText(actividadPrincipal.this, "Por favor, ingrese un ángulo.", Toast.LENGTH_SHORT).show();
                } else {

                    double coseno = Math.cos(Math.toRadians(Double.parseDouble(edtAngulo.getText().toString())));

                    if (Math.abs(coseno) < 0.000001) {
                        coseno = 0.0;
                    }

                    Intent intent = new Intent(actividadPrincipal.this, Resultados.class);
                    // Coloca los datos que deseas enviar a la Actividad 2
                    intent.putExtra("valor", (String.valueOf(coseno)));
                    intent.putExtra("texto", "Coseno del ángulo: ");// Puedes enviar cualquier tipo de datos, no solo String
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}