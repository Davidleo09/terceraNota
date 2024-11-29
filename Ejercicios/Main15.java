class Rectangulo {
    double ancho;
    double alto;

    Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class Main20 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 10.0);
        
        System.out.println("Antes de modificar: ancho = " + rectangulo.ancho + ", alto = " + rectangulo.alto);
        modificarRectangulo(rectangulo);
        System.out.println("Después de modificar: ancho = " + rectangulo.ancho + ", alto = " + rectangulo.alto);
    }

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 8.0;
        r.alto = 12.0;
        System.out.println("Dentro del método modificarRectangulo: ancho = " + r.ancho + ", alto = " + r.alto);
    }
}
