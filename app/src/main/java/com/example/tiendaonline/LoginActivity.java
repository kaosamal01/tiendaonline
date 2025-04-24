package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void irARegistro(android.view.View view) {
        startActivity(new Intent(this, RegistroActivity.class));
    }

    public void entrar(android.view.View view) {
        startActivity(new Intent(this, ProductosActivity.class));
    }
}
