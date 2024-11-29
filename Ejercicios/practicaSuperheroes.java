// Definición de una clase llamada 'Superhero'
class Superhero {
    // Atributos (propiedades)
    String name;
    String power;
    int strengthLevel;

    // Constructor para inicializar los atributos
    public Superhero(String name, String power, int strengthLevel) {
        this.name = name;
        this.power = power;
        this.strengthLevel = strengthLevel;
    }

    // Método que muestra la información del superhéroe
    public void displayInfo() {
        System.out.println("Superhero: " + name);
        System.out.println("Power: " + power);
        System.out.println("Strength Level: " + strengthLevel);
    }

    // Método que incrementa el nivel de fuerza
    public void increaseStrength(int increment) {
        this.strengthLevel += increment;
        System.out.println(name + " has increased strength by " + increment);
    }
}

// Clase Principal para ejecutar el código
public class hos {
    public static void main(String[] args) {
        // Crear objetos de la clase Superhero
        Superhero hero1 = new Superhero("IronMan", "Technology Suit", 90);
        Superhero hero2 = new Superhero("Hulk", "Super Strength", 100);

        // Llamar a métodos
        hero1.displayInfo();
        hero2.displayInfo();

        hero1.increaseStrength(10);
        hero2.increaseStrength(20);

        hero1.displayInfo();
        hero2.displayInfo();

    }
}
