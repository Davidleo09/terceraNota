import java.util.Arrays;

public class Main25 {
    public static void main(String[] args) {
        String palabra1 = "amor";
        String palabra2 = "roma";
        
        boolean resultado = esAnagrama(palabra1, palabra2);
        System.out.println("¿Son anagramas? " + resultado);
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        }
        
        char[] arr1 = palabra1.toLowerCase().toCharArray();
        char[] arr2 = palabra2.toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}
