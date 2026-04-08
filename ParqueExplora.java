public class ParqueExplora implements EspacioCultural {

    private String nombre;
    private int numeroSalas;

    public ParqueExplora(String nombre, int numeroSalas) {
        this.nombre = nombre;
        this.numeroSalas = numeroSalas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Parque: " + nombre);
        System.out.println("Número de salas: " + numeroSalas);
    }
}