package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EspacioCultural> lista = new ArrayList<>();

        lista.add(new JardinBotanico("Jardín Botánico", "Medellín"));
        lista.add(new MuseoDeAntioquia("Museo de Antioquia", 1881));
        lista.add(new ParqueExplora("Parque Explora", 10));

        for (EspacioCultural lugar : lista) {
            lugar.mostrarHorario();
            System.out.println("Requisito: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
            System.out.println("----------------------");
        }
    }
}