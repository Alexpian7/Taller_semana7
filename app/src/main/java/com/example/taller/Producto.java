package com.example.taller;

public class Producto {
    private String nombre;
    private double precio;
    private int imagenResId;

    // Constructor
    public Producto(String nombre, double precio, int imagenResId) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenResId = imagenResId;
    }

    // Métodos de acceso (Getters)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getImagenResId() {
        return imagenResId;
    }
}
