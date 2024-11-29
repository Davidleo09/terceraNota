import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la cantidad de numeros que quieres que sean imprimidos en la susecion");
        int limite = scanner.nextInt();

        long num1 = 0;
        long num2 = 1;

        System.out.print(num1 + ", " + num2);
        for (int i = 0 ; i < limite ; i++ ){
        long numSiguiente = num1 + num2;
        System.out.print(", "+ numSiguiente);
        num1=num2;
        num2=numSiguiente;
        }
        scanner.close();
    }
}
