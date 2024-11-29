import java.util.Scanner;
public class numerosImpares{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se crea un escaner para leer el numero limite
        System.out.println("Ingresa un numero");
        int limite = scanner.nextInt();
        //Se inicializan dos variables para contar la cantidad de numeros pares e impares
        int cantidadImpares = 0;
        int cantidadPares = 0;
        for( int numero=1 ; numero<limite ; numero++ ){
            //si el mod da residuo significa que es impar, entonces se añade uno a la variable cantidadImpares y se muestra el numero
            if (numero % 2 != 0) {
                System.out.println(numero + ": impar");
                cantidadImpares++;
            }
            if (numero % 2 == 0) {
            //si el mod no da residuo significa que es par, entonces se añade uno a la variable cantidadPares y se muestra el numero
               System.out.println(numero + ": par");
               cantidadPares++;
            }
        }
        //Al final nos dice la cantidad de numeros pares e impares
        System.out.println("La cantidad de numeros impares que hay dentro del numero que ingresaste es: "  + cantidadImpares);
        System.out.println("La cantidad de numeros pares que hay dentro del numero que ingresaste es: "+ cantidadPares);
        scanner.close();
    }
}