package com.example.tiendaonline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarritoAdapter extends RecyclerView.Adapter<CarritoAdapter.ViewHolder> {

    private List<ProductoCarrito> lista;

    public CarritoAdapter(List<ProductoCarrito> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carrito, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductoCarrito p = lista.get(position);
        holder.imgProducto.setImageResource(p.imagen);
        holder.txtNombre.setText(p.nombre);
        holder.txtCantidad.setText("Cantidad: " + p.cantidad);
        holder.txtPrecio.setText("$" + String.format("%.0f", p.precio));

        holder.btnEliminar.setOnClickListener(v -> {
            lista.remove(position);
            notifyItemRemoved(position);
            notifyItemRangeChanged(position, lista.size());
            // Aquí podrías también actualizar el total
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProducto;
        TextView txtNombre, txtCantidad, txtPrecio;
        ImageButton btnEliminar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProducto = itemView.findViewById(R.id.imgProducto);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtCantidad = itemView.findViewById(R.id.txtCantidad);
            txtPrecio = itemView.findViewById(R.id.txtPrecio);
            btnEliminar = itemView.findViewById(R.id.btnEliminar);
        }
    }
}
