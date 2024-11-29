import java.util.Scanner;
public class numerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a imprimir");
        int cantidad = scanner.nextInt();
        for(int numero = 2; numero <= cantidad; numero++) {
            boolean isPrime = true; // Suponemos que x es primo

            for(int divisor = 2; divisor < numero; divisor++) {
                if(numero % divisor == 0) {
                    isPrime = false; // x no es primo
                    break; // Salimos del bucle
                }
            }

            if(isPrime) {
                System.out.println(numero + " es un número primo");
            }
        }
        scanner.close();
    }
}
