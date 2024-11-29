import java.util.Random;
import java.util.Scanner;

class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    public Personaje(String nombre, int fuerza, int velocidad, int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }

    public void atacar(Personaje oponente) {
        System.out.println(this.nombre + " ataca a " + oponente.nombre + " con " + this.fuerza + " de daño.");
        oponente.recibirDano(this.fuerza);
    }

    public void recibirDano(int dano) {
        this.vida_hp -= dano;
        if (this.vida_hp < 0) this.vida_hp = 0;
        System.out.println(this.nombre + " ha recibido " + dano + " de daño. Vida restante: " + this.vida_hp);
    }

    public void defender(int dano) {
        int danoReducido = (dano / 2) + (dano % 2); // Redondea hacia arriba si el daño es impar
        System.out.println(this.nombre + " se defiende, reduciendo el daño a " + danoReducido + ".");
        this.recibirDano(danoReducido);
    }

    public void aumentarPoderes() {
        Random random = new Random();
        int aumento = random.nextInt(6) + 5;  // Aumenta la fuerza entre 5 y 10
        this.fuerza += aumento;
        System.out.println(this.nombre + " ha aumentado su fuerza en " + aumento + ". Nueva fuerza: " + this.fuerza);
    }

    public void recuperarse() {
        Random random = new Random();
        int recuperacion = random.nextInt(21) + 10;  // Recupera entre 10 y 30 puntos de vida
        this.vida_hp += recuperacion;
        System.out.println(this.nombre + " se ha recuperado en " + recuperacion + " puntos. Vida actual: " + this.vida_hp);
    }

    public void mostrarEstadisticas() {
        System.out.println("//" + this.nombre + " - Fuerza: " + this.fuerza + ", Velocidad: " + this.velocidad + ", Vida: " + this.vida_hp + "//");
    }

    public void accionAleatoria(Personaje oponente) {
        Random random = new Random();
        int accion = random.nextInt(5); // 5 posibles acciones: atacar, defender, aumentar poderes, recuperarse, habilidad especial
        switch (accion) {
            case 0 -> atacar(oponente);
            case 1 -> defender(oponente.fuerza);
            case 2 -> aumentarPoderes();
            case 3 -> recuperarse();
            case 4 -> {
                if (this instanceof SuperHero) {
                    ((SuperHero) this).ataqueEspecial(oponente);
                } else if (this instanceof Villano) {
                    ((Villano) this).hacerTrampa(oponente);
                }
            }
        }
    }
}

class SuperHero extends Personaje {
    public SuperHero(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    public void ataqueEspecial(Personaje oponente) {
        Random random = new Random();
        int probabilidad = random.nextInt(100); // Genera un número aleatorio entre 0 y 99

        if (probabilidad < 90) { // 90% de probabilidad de éxito
            int danoEspecial = (int)(this.fuerza * 1.5);
            System.out.println(this.nombre + " utiliza su ataque especial contra " + oponente.nombre + ", causando " + danoEspecial + " de daño.");
            oponente.recibirDano(danoEspecial);
        } else { // 10% de probabilidad de fallo
            System.out.println(this.nombre + " intentó utilizar su ataque especial, pero falló.");
        }
    }
}

class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    public void hacerTrampa(Personaje oponente) {
        Random random = new Random();
        int probabilidad = random.nextInt(100); // Genera un número aleatorio entre 0 y 99

        if (probabilidad < 70) { // 70% de probabilidad de éxito
            int danoTrampa = this.fuerza * 2;
            System.out.println(this.nombre + " hace trampa y ataca a " + oponente.nombre + " con " + danoTrampa + " de daño.");
            oponente.recibirDano(danoTrampa);
        } else { // 30% de probabilidad de fallo
            System.out.println(this.nombre + " intentó hacer trampa, pero fue descubierto y falló.");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear superhéroes y villanos
        SuperHero superheroe = new SuperHero("Superman", 50, 80, 200);
        Villano villano = new Villano("Lex Luthor", 45, 70, 180);

        // Mostrar estadísticas iniciales
        superheroe.mostrarEstadisticas();
        villano.mostrarEstadisticas();

        // Selección de personaje
        System.out.println("Selecciona tu personaje: 1 para Superman, 2 para Lex Luthor");
        int eleccion = scanner.nextInt();

        Personaje jugador, cpu;

        if (eleccion == 1) {
            jugador = superheroe;
            cpu = villano;
        } else {
            jugador = villano;
            cpu = superheroe;
        }

        // Simular algunas acciones
        while (jugador.vida_hp > 0 && cpu.vida_hp > 0) {
            System.out.println("Turno del jugador:");
            System.out.println("1: Atacar, 2: Defender, 3: Aumentar poderes, 4: Recuperarse, 5: Habilidad Especial");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1 -> jugador.atacar(cpu);
                case 2 -> jugador.defender(cpu.fuerza);
                case 3 -> jugador.aumentarPoderes();
                case 4 -> jugador.recuperarse();
                case 5 -> {
                    if (jugador instanceof SuperHero) {
                        ((SuperHero) jugador).ataqueEspecial(cpu);
                    } else if (jugador instanceof Villano) {
                        ((Villano) jugador).hacerTrampa(cpu);
                    }
                }
                default -> System.out.println("Acción no válida.");
            }

            if (cpu.vida_hp <= 0) {
                break;
            }

            System.out.println("Turno de la CPU:");
            cpu.accionAleatoria(jugador);

            // Mostrar estadísticas después de cada turno
            jugador.mostrarEstadisticas();
            cpu.mostrarEstadisticas();
        }

        // Anunciar el ganador
        if (jugador.vida_hp > 0) {
            System.out.println("GAME OVER!!");
            System.out.println(jugador.nombre + " ha ganado el juego!");
        } else {
            System.out.println("GAME OVER!!");
            
            System.out.println(cpu.nombre + " ha ganado el juego!");
        }

        scanner.close();
    }
}
