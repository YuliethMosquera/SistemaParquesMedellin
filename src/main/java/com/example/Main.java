
package src.main.java.com.example;

public class Main {
    public static void main(String[] args) {

        EspacioCultural jardin = new JardinBotanico("Jardín Botánico de Medellín", "Medellín");
        EspacioCultural museo = new MuseoDeAntioquia("Museo de Antioquia", 1881);
        EspacioCultural parque = new ParqueExplora("Parque Explora", 10);

        jardin.mostrarInformacion();
        System.out.println("-------------------");
        museo.mostrarInformacion();
        System.out.println("-------------------");
        parque.mostrarInformacion();
    }
}