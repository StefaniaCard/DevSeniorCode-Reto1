import java.util.Random;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in); // Leer entradas del usuario

    // Arrays que contienen información de los planetas, sus distancias, naves
    // espaciales, y sus características
    static String[] planetas = { "Marte", "Júpiter", "Saturno" };
    static double[] distancias = { 54.6, 587, 1.426 }; // Distancias en millones de kilómetros

    static String[] naves = { "Orion", "Voyager", "Pioneer" };
    static double[] velocidades = { 40.000, 61.492, 51.682 }; // Velocidades en km/h
    static double[] consumoCombustible = { 100, 150, 160 }; // Consumo de combustible por millón de kilómetros

    // Variables para almacenar las selecciones del usuario
    static int naveSeleccionada;
    static int planetaSeleccionado;

    public static void main(String[] args) throws Exception {
        int opcion;
        // Bucle principal para mantener el programa ejecutándose hasta que el usuario
        // decida salir
        do {
            mostrarMenu(); // Muestra las opciones disponibles
            opcion = scanner.nextInt(); // Captura la opción ingresada por el usuario
            switch (opcion) {
                case 1:
                    seleccionarPlaneta(); // Permite seleccionar un planeta destino
                    break;
                case 2:
                    seleccionarNave(); // Permite seleccionar una nave espacial
                    break;
                case 3:
                    simularViaje(); // Inicia la simulación del viaje
                    break;
                default:
                    break; // Opción de salida
            }
        } while (opcion != 4); // El programa termina si el usuario elige la opción 4
    }

    // Muestra el menú principal
    public static void mostrarMenu() {
        System.out.println("\n--- Viaje Interplanetario ---");
        System.out.println("1. Ver planetas destino");
        System.out.println("2. Ver naves para tu viaje");
        System.out.println("3. Iniciar simulación del viaje");
        System.out.println("4. Salir del programa");
        System.out.print("Selecciona una opción: ");
    }

    // Permite al usuario seleccionar un planeta de la lista
    public static void seleccionarPlaneta() {
        System.out.println("Selecciona un planeta destino:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + ". " + planetas[i] + " - Distancia: " + distancias[i] + " millones de km");
        }

        System.out.print("Ingresa el número correspondiente al planeta: ");
        int seleccion = scanner.nextInt();
        if (seleccion > 0 && seleccion <= planetas.length) {
            System.out.println("Has seleccionado: " + planetas[seleccion - 1]);
            planetaSeleccionado = seleccion - 1; // Guarda el índice del planeta seleccionado
        } else {
            System.out.println("Selección no válida. Intenta de nuevo.");
        }
    }

    // Permite al usuario seleccionar una nave espacial de la lista
    public static void seleccionarNave() {
        System.out.println("Selecciona una nave espacial:");
        for (int i = 0; i < naves.length; i++) {
            System.out.println((i + 1) + ". " + naves[i] + " - Velocidad: " + velocidades[i] + " km/h");
        }

        System.out.println("Ingrese el número correspondiente a la nave: ");
        int seleccion = scanner.nextInt();
        if (seleccion > 0 && seleccion <= naves.length) {
            System.out.println("Has seleccionado la nave: " + naves[seleccion - 1]);
            naveSeleccionada = seleccion - 1; // Guarda el índice de la nave seleccionada
        } else {
            System.out.println("Selección no válida. Intenta de nuevo.");
        }
    }

    public static void simularViaje() {
        if (planetaSeleccionado == -1 || naveSeleccionada == -1) {
            System.out.println("Primero debes seleccionar un planeta y una nave.");
            return;
        }

        // Calcular la duración del viaje en horas y días
        double distanciaKm = distancias[planetaSeleccionado] * 1_000_000; // Convertir millones de km a km
        double velocidad = velocidades[naveSeleccionada]; // Velocidad de la nave seleccionada
        double duracionHoras = distanciaKm / velocidad; // Calcular duración en horas
        double duracionDias = duracionHoras / 24; // Convertir a días

        // Iniciar la simulación del viaje
        System.out.println("Iniciando viaje");
        Random random = new Random();
        for (int progreso = 0; progreso <= 100; progreso += 10) {
            System.out.println("% de progreso: " + progreso);

            if (progreso == 50) {
                System.out.println("Mitad del camino alcanzado");
            }
            if (random.nextInt(10) < 3) { // Eventos aleatorios
                System.out.println("Evento inesperado! Realizando ajustes...");
            }
            try {
                Thread.sleep(500); // Pausa de medio segundo
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación");
            }
        }

        // Mostrar duración del viaje al finalizar la simulación
        System.out.printf("Llegaste a tu destino! La duración del viaje fue de %.2f horas (%.2f días).\n",
                duracionHoras, duracionDias);
    }
}