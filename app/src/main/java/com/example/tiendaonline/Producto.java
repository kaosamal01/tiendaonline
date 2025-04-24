package com.example.tiendaonline;

public class Producto {
    public int imagen;
    public String titulo;
    public String stock;
    public String categoria;
    public String ubicacion;
    public String estado;

    public Producto(int imagen, String titulo, String stock, String categoria, String ubicacion, String estado) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.stock = stock;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }
}
