package com.example;

public class ParqueExplora implements EspacioCultural {

    private String nombre;
    private int salas;

    public ParqueExplora(String nombre, int salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    @Override
    public void mostrarHorario() {
        System.out.println(nombre + " abre de 10am a 6pm");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada con costo";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Explorar ciencia interactiva");
    }
}