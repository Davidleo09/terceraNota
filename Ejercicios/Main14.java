public class Main19 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Antes de intercambiar: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después de intercambiar: a = " + a + ", b = " + b);
    }

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método intercambiar: a = " + a + ", b = " + b);
    }
}
