package com.example;

public class JardinBotanico implements EspacioCultural {

    private String nombre;
    private String ubicacion;

    public JardinBotanico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarHorario() {
        System.out.println(nombre + " abre de 8am a 5pm");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada gratuita";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Recorrer jardines y disfrutar la naturaleza");
    }
}