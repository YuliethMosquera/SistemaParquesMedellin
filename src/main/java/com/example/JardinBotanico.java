package src.main.java.com.example;
public class JardinBotanico implements EspacioCultural {

    private String nombre;
    private String ubicacion;

    public JardinBotanico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Jardín Botánico: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
    }
}