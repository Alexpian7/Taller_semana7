package com.example.taller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder> {
    private List<Producto> productos;

    public ProductoAdapter(List<Producto> productos) {
        this.productos = productos;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ProductoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto producto = productos.get(position);
        holder.nombre.setText(producto.getNombre());
        holder.precio.setText("$" + producto.getPrecio());
        holder.imagen.setImageResource(producto.getImagenResId());
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    static class ProductoViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView precio;
        ImageView imagen;

        public ProductoViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvNombre);
            precio = itemView.findViewById(R.id.tvPrecio);
            imagen = itemView.findViewById(R.id.imgProducto);
        }
    }
}
