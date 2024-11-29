import java.util.Scanner;

public class Main42 {
    private static final int MAX_PRODUCTOS = 5;
    private static String[] nombres = new String[MAX_PRODUCTOS];
    private static int[] cantidades = new int[MAX_PRODUCTOS];
    private static double[] precios = new double[MAX_PRODUCTOS];
    private static int contadorProductos = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de datos para los productos
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = input.nextLine();

            System.out.print("Ingrese la cantidad en inventario: ");
            cantidades[i] = input.nextInt();

            System.out.print("Ingrese el precio por unidad: ");
            precios[i] = input.nextDouble();
            input.nextLine(); // Limpiar el buffer

            contadorProductos++;
        }

        // Calcular el valor total del inventario
        calcularValorTotalInventario();

        // Generar el reporte final
        generarReporte();

        // Ejemplo de actualización de cantidad
        System.out.print("\nIngrese el nombre del producto a actualizar: ");
        String nombreProducto = input.nextLine();
        System.out.print("Ingrese la nueva cantidad: ");
        int nuevaCantidad = input.nextInt();
        actualizarCantidadProducto(nombreProducto, nuevaCantidad);

        // Generar el reporte final después de la actualización
        generarReporte();
    }

    public static void calcularValorTotalInventario() {
        double valorTotalInventario = 0;
        for (int i = 0; i < contadorProductos; i++) {
            double valorTotalProducto = cantidades[i] * precios[i];
            valorTotalInventario += valorTotalProducto;
        }
        System.out.println("Valor total del inventario: " + valorTotalInventario);
    }

    public static void generarReporte() {
        System.out.println("\nReporte Final:");
        for (int i = 0; i < contadorProductos; i++) {
            double valorTotalProducto = cantidades[i] * precios[i];
            System.out.println("Producto: " + nombres[i] + " - Cantidad: " + cantidades[i] + " - Precio por unidad: "
                    + precios[i] + " - Valor total: " + valorTotalProducto);
        }
    }

    public static void actualizarCantidadProducto(String nombreProducto, int nuevaCantidad) {
        for (int i = 0; i < contadorProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreProducto)) {
                cantidades[i] = nuevaCantidad;
                System.out.println("Cantidad actualizada para el producto " + nombreProducto + ": " + nuevaCantidad);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}
