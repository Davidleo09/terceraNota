import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Main35 {
    private static final String RUTA_ARCHIVO = "productos.json";

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto1", 10.5));
        productos.add(new Producto("Producto2", 20.75));

        // Guardar productos en un archivo JSON
        guardarProductos(productos);

        // Leer productos del archivo JSON y mostrarlos
        List<Producto> productosLeidos = leerProductos();
        for (Producto p : productosLeidos) {
            System.out.println("Nombre: " + p.nombre + ", Precio: " + p.precio);
        }
    }

    public static void guardarProductos(List<Producto> productos) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(RUTA_ARCHIVO)) {
            gson.toJson(productos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Producto> leerProductos() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(RUTA_ARCHIVO)) {
            return gson.fromJson(reader, new TypeToken<List<Producto>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
