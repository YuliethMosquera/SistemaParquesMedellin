package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    private String nombre;
    private int anio;

    public MuseoDeAntioquia(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    @Override
    public void mostrarHorario() {
        System.out.println(nombre + " abre de 9am a 6pm");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada paga";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Observar exposiciones de arte");
    }
}