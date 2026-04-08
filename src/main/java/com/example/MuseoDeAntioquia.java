package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    private String nombre;
    private int anioFundacion;

    public MuseoDeAntioquia(String nombre, int anioFundacion) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Museo: " + nombre);
        System.out.println("Año de fundación: " + anioFundacion);
    }
}