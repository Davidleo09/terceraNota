import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = input.nextDouble();

        // Calcular la media de los tres números
        double media = (num1 + num2 + num3) / 3;

        // Mostrar el resultado
        System.out.println("La media de los tres números es: " + media);

        // Cerrar el objeto Scanner
        input.close();
    }
}
