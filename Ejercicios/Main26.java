import java.io.*;
import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rutaArchivo = "notas.txt";
        
        System.out.println("Introduce una nota (escribe 'fin' para terminar):");
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            String nota;
            while (!(nota = input.nextLine()).equalsIgnoreCase("fin")) {
                escritor.write(nota);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Notas guardadas:");
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
