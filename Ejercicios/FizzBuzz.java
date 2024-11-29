public class FizzBuzz {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 5 == 0 & numero % 3 == 0) {
                System.out.println( numero + ": fizzbuzz");
                }
            else if (numero % 3 == 0) {
                System.out.println( numero + ": fizz");
            }
            else if (numero % 5 == 0) {
            System.out.println( numero + ": buzz");}
            else
            System.out.println(numero);
            }
        }
    }

