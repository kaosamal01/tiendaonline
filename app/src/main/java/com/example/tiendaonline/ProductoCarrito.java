package com.example.tiendaonline;

public class ProductoCarrito {
    public int imagen;
    public String nombre;
    public int cantidad;
    public double precio;

    public ProductoCarrito(int imagen, String nombre, int cantidad, double precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
