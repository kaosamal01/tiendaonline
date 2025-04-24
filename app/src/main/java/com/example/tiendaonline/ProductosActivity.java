package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductosActivity extends AppCompatActivity {

    RecyclerView recyclerProductos;
    ArrayList<Producto> productos;
    ProductoAdapter adapter;
    Button btnCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        recyclerProductos = findViewById(R.id.recyclerProductos);
        recyclerProductos.setLayoutManager(new LinearLayoutManager(this));

        productos = new ArrayList<>();
        productos.add(new Producto(R.drawable.camiseta_blanca, "Unisex T-Shirt White", "12", "T-shirts", "3 tiendas", "Activo"));
        productos.add(new Producto(R.drawable.camiseta_negra, "Unisex T-Shirt Black", "10", "T-shirts", "4 tiendas", "Activo"));
        productos.add(new Producto(R.drawable.camiseta_rosada, "Kids T-Shirt Pink", "1", "T-shirts", "1 tienda", "Bajo stock"));

        adapter = new ProductoAdapter(productos);
        recyclerProductos.setAdapter(adapter);

        // Botón carrito 🛒
        btnCarrito = findViewById(R.id.btnCarrito);
        btnCarrito.setOnClickListener(v -> {
            Intent intent = new Intent(ProductosActivity.this, CarritoActivity.class);
            startActivity(intent);
        });
    }
}
