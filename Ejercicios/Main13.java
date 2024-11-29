class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class Main18 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        reasignarReferencia(persona);
        System.out.println("Nombre de 'persona' después de llamar a reasignarReferencia: " + persona.nombre);
    }

    public static void reasignarReferencia(Persona p) {
        p = new Persona("Pedro");
        System.out.println("Nombre de 'p' dentro del método reasignarReferencia: " + p.nombre);
    }
}
