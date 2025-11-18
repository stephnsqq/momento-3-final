public class ElevadorPasajeros extends Elevador {

    private int capacidad;
    private int pasajerosActuales;

    public ElevadorPasajeros(int pisoMaximo, int capacidad) {
        super(pisoMaximo);
        this.capacidad = capacidad;
        this.pasajerosActuales = 0;
    }

    public void entrarPasajero() {
        if (pasajerosActuales < capacidad) {
            pasajerosActuales++;
            System.out.println("Entró un pasajero. Total: " + pasajerosActuales);
        } else {
            System.out.println("El elevador está lleno.");
        }
    }

    public void salirPasajero() {
        if (pasajerosActuales > 0) {
            pasajerosActuales--;
            System.out.println("Salió un pasajero. Total: " + pasajerosActuales);
        } else {
            System.out.println("No hay pasajeros para salir.");
        }
    }
}
