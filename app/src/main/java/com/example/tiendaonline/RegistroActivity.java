package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ProductosActivity
                Intent intent = new Intent(RegistroActivity.this, ProductosActivity.class);
                startActivity(intent);
                finish(); // Opcional: evita que el usuario vuelva al registro con el botón atrás
            }
        });
    }
}
