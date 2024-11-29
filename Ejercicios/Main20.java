public class Main26 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int contador = 0;

        while (contador < 50) {
            System.out.print(num1 + " ");
            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            contador++;
        }
    }
}
