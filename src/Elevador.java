public class Elevador {

    protected int pisoActual;
    protected int pisoMaximo;

    public Elevador(int pisoMaximo) {
        this.pisoActual = 0;
        this.pisoMaximo = pisoMaximo;
    }

    public void subir() {
        if (pisoActual < pisoMaximo) {
            pisoActual++;
            System.out.println("Subiendo... ahora estás en el piso " + pisoActual);
        } else {
            System.out.println("No puedes subir más.");
        }
    }

    public void bajar() {
        if (pisoActual > 0) {
            pisoActual--;
            System.out.println("Bajando... ahora estás en el piso " + pisoActual);
        } else {
            System.out.println("No puedes bajar más.");
        }
    }

    public void abrirPuertas() {
        System.out.println("Puertas abiertas.");
    }

    public int getPisoActual() {
        return pisoActual;
    }
}
