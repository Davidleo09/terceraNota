class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Error: Fondos insuficientes.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main31 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);

        try {
            cuenta.retirar(150.0);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo restante: " + cuenta.getSaldo());
    }
}
