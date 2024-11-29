class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class Main17 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        cambiarNombre(persona);
        System.out.println("Nombre de 'persona' después de llamar a cambiarNombre: " + persona.nombre);
    }

    public static void cambiarNombre(Persona p) {
        p.nombre = "Pedro";
        System.out.println("Nombre de 'p' dentro del método cambiarNombre: " + p.nombre);
    }
}
