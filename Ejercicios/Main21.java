public class Main28 {
    public static void main(String[] args) {
        System.out.println("Área del Triángulo: " + calcularArea("triangulo", 5, 10));
        System.out.println("Área del Cuadrado: " + calcularArea("cuadrado", 4, 0));
        System.out.println("Área del Rectángulo: " + calcularArea("rectangulo", 4, 8));
    }

    public static double calcularArea(String poligono, double dimension1, double dimension2) {
        switch (poligono.toLowerCase()) {
            case "triangulo":
                return (dimension1 * dimension2) / 2;
            case "cuadrado":
                return dimension1 * dimension1;
            case "rectangulo":
                return dimension1 * dimension2;
            default:
                throw new IllegalArgumentException("Polígono no soportado.");
        }
    }
}
