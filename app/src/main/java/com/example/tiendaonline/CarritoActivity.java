package com.example.tiendaonline;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarritoActivity extends AppCompatActivity {

    private RecyclerView recyclerCarrito;
    private CarritoAdapter adapter;
    private TextView txtTotal;

    private List<ProductoCarrito> listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        recyclerCarrito = findViewById(R.id.recyclerCarrito);
        txtTotal = findViewById(R.id.txtTotal);

        listaProductos = new ArrayList<>();
        // Datos de prueba
        listaProductos.add(new ProductoCarrito(R.drawable.camiseta_blanca, "Camiseta Blanca", 2, 30000));
        listaProductos.add(new ProductoCarrito(R.drawable.camiseta_negra, "Camiseta Negra", 1, 45000));
        listaProductos.add(new ProductoCarrito(R.drawable.camiseta_rosada, "Camiseta Rosada", 3, 25000));

        adapter = new CarritoAdapter(listaProductos);
        recyclerCarrito.setLayoutManager(new LinearLayoutManager(this));
        recyclerCarrito.setAdapter(adapter);

        calcularTotal();
    }

    private void calcularTotal() {
        double total = 0;
        for (ProductoCarrito p : listaProductos) {
            total += p.precio * p.cantidad;
        }
        txtTotal.setText("$" + String.format("%.0f", total));
    }
}
