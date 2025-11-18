import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ElevadorPasajeros elevador = new ElevadorPasajeros(5, 4);

        int opcion = 0;

        System.out.println("=== ELEVADOR CON HERENCIA ===");

        while (opcion != 7) {
            System.out.println("\nPiso actual: " + elevador.getPisoActual());
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Abrir puertas");
            System.out.println("4. Entrar pasajero");
            System.out.println("5. Salir pasajero");
            System.out.println("6. Mostrar piso");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: elevador.subir(); break;
                case 2: elevador.bajar(); break;
                case 3: elevador.abrirPuertas(); break;
                case 4: elevador.entrarPasajero(); break;
                case 5: elevador.salirPasajero(); break;
                case 6: System.out.println("Estás en el piso " + elevador.getPisoActual()); break;
                case 7: System.out.println("Adiós!"); break;
                default: System.out.println("Opción no válida.");
            }
        }

        leer.close();
    }
}
