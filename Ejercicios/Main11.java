import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        // Constante para el límite de aprobación
        final double LIMITE_APROBACION = 3.0;

        // Declarar arrays para almacenar nombres, identificaciones y notas
        String[] nombres = new String[5];
        String[] identificaciones = new String[5];
        double[][] notas = new double[5][3];

        // Crear un objeto Scanner para la entrada de datos
        Scanner input = new Scanner(System.in);

        // Solicitar los datos de los estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = input.nextLine();

            System.out.print("Ingrese la identificación del estudiante " + (i + 1) + ": ");
            identificaciones[i] = input.nextLine();

            System.out.println("Ingrese las 3 notas del estudiante " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = input.nextDouble();
            }
            input.nextLine(); // Limpiar el buffer
        }

        // Llamar a los métodos de los otros miembros del equipo para continuar el flujo
        calcularPromedios(nombres, identificaciones, notas, LIMITE_APROBACION);
    }

    // Método para el segundo miembro del equipo
    public static void calcularPromedios(String[] nombres, String[] identificaciones, double[][] notas, double LIMITE_APROBACION) {
        double[] promedios = new double[5];
        String[] estados = new String[5];

        // Calcular el promedio y el estado de cada estudiante
        for (int i = 0; i < 5; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / 3;

            if (promedios[i] >= LIMITE_APROBACION) {
                estados[i] = "Aprobado";
            } else {
                estados[i] = "Reprobado";
            }
        }

        // Llamar al método del tercer miembro del equipo para generar el reporte
        generarReporte(nombres, identificaciones, promedios, estados);
    }

    // Método para el tercer miembro del equipo
    public static void generarReporte(String[] nombres, String[] identificaciones, double[] promedios, String[] estados) {
        System.out.println("\nReporte Final:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedios[i] + " - " + estados[i]);
        }
    }
}
