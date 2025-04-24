package com.example.tiendaonline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder> {

    private List<Producto> lista;

    public ProductoAdapter(List<Producto> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ProductoViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto p = lista.get(position);
        holder.imagen.setImageResource(p.imagen);
        holder.titulo.setText(p.titulo);
        holder.stock.setText("Stock: " + p.stock);
        holder.categoria.setText("Categoría: " + p.categoria);
        holder.ubicacion.setText("Ubicación: " + p.ubicacion);
        holder.estado.setText(p.estado);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ProductoViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView titulo, stock, categoria, ubicacion, estado;

        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imgProducto);
            titulo = itemView.findViewById(R.id.txtTitulo);
            stock = itemView.findViewById(R.id.txtStock);
            categoria = itemView.findViewById(R.id.txtCategoria);
            ubicacion = itemView.findViewById(R.id.txtUbicacion);
            estado = itemView.findViewById(R.id.txtEstado);
        }
    }
}
