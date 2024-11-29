public class Main21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(arr));
        modificarArray(arr);
        System.out.println("Después de modificar: " + java.util.Arrays.toString(arr));
    }

    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro del método modificarArray: " + java.util.Arrays.toString(arr));
    }
}
