import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario que introduzca los tres números
        System.out.print("Introduce el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = input.nextDouble();

        // Determinar si el primer número es mayor que el segundo y menor que el tercero
        if (num1 > num2 && num1 < num3) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo (" + num2 + ") y menor que el tercero (" + num3 + ").");
        } else {
            System.out.println("El primer número (" + num1 + ") NO es mayor que el segundo (" + num2 + ") y menor que el tercero (" + num3 + ").");
        }

        // Cerrar el objeto Scanner
        input.close();
    }
}
