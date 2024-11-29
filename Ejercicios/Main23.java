class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class Main30 {
    public static void main(String[] args) {
        try {
            double resultado = calcularRaizCuadrada(-4);
            System.out.println("La raíz cuadrada es: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calcularRaizCuadrada(double numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
