import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        double primerNumero = scaner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double SegundoNumero = scaner.nextDouble();


        double suma = primerNumero + SegundoNumero;
        double resta = primerNumero - SegundoNumero;
        double multiplicacion = primerNumero * SegundoNumero;
        double division = primerNumero / SegundoNumero;
        double modulo = primerNumero % SegundoNumero;


        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El módulo es: " + modulo);


        scaner.close();
    }
}


