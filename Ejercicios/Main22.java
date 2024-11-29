import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt();
        
        try {
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
