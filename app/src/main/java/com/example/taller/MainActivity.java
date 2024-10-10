package com.example.taller;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductoAdapter productoAdapter;
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar el RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializar la lista de productos
        productos = new ArrayList<>();
        productos.add(new Producto("Camisa", 29.99, R.drawable.camisa)); // Asegúrate de que los nombres sean correctos
        productos.add(new Producto("Pantalón", 49.99, R.drawable.pantalon));
        productos.add(new Producto("Zapatos", 79.99, R.drawable.zapatos));
        productos.add(new Producto("Chaqueta", 99.99, R.drawable.chaqueta));
        productos.add(new Producto("Sombrero", 19.99, R.drawable.sombrero));

        // Configurar el adaptador del RecyclerView
        productoAdapter = new ProductoAdapter(productos);
        recyclerView.setAdapter(productoAdapter);
    }
}