import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Crear un array de tamaño 5 para almacenar los números
        double[] numeros = new double[5];

        // Solicitar al usuario que ingrese los 5 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }

        // Calcular el promedio
        double promedio = suma / numeros.length;

        // Mostrar el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Cerrar el objeto Scanner
        input.close();
    }
}
