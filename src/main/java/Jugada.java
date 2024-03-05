import java.util.Arrays;

/**
 * Clase que representa una jugada del juego de cartas de coches.
 * @author TODO 30: escribe tu nombre
 */
public class Jugada {

    /** Constantes para la característica del motor */
    public final int MOTOR = 1;
    /** Constantes para la característica de la potencia */
    public final int POTENCIA = 2;
    /** Constantes para la característica de la velocidad */
    public final int VELOCIDAD = 3;
    /** Constantes para la característica del consumo */
    public final int CONSUMO = 4;

    // region Atributos
    private Carta[] cartas;
    // endregion

    /**
     * Constructor de la clase Jugada
     * @param cartas Array de cartas con una carta de cada jugador en esa jugada
     */
    public Jugada(Carta[] cartas) {
        // TODO 31: constructor Jugada
        this.cartas = cartas;
    }

    /**
     * Devuelve un array que representa los jugadores que ganan.
     * Puede haber varios jugadores ganadores si en esa característica son los mejores y tienen el mismo valor.
     * Hay que comprobar si cada carta gana al resto de cartas.
     * Cada posición se corresponde a la carta de cada jugador.
     * Si gana o empata en esa posición aparecerá un 1, si no un 0.
     * @return array numérico que representa a los ganadores
     */
    public int[] ganadores(int caracteristica) {
        // TODO 32: ganadores
        int numCartas = cartas.length;
        int[] ganadores = new int[numCartas];
        for (int i = 0; i < numCartas; i++) {
            boolean gana = true;
            Carta carta1 = cartas[i];
            for (int j = 0; j < numCartas; j++) {
                if (i==j) { continue; }
                Carta carta2 = cartas[j];
                if (!carta1.gana(carta2, caracteristica)) {
                    gana = false;
                    break;
                }
            }
            ganadores[i] = gana?1:0;
        }
        return ganadores;
    }

    /**
     * Pinta las cartas de la jugada en sentido horizontal
     * poniendo en la misma fila los nombres de las cartas y
     * en las sucesivas filas los valores de las mismas características.
     */
    public void pintaCartas(Jugador[] jugadores) {
        pintarJugadores(jugadores);
        int numCartas = cartas.length;
        String s = "";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + "-".repeat(22);
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + String.format("%-22s",cartas[i].getNombre());
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + "-".repeat(22);
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + String.format("%-22s","Motor: " + cartas[i].getMotor() + " cc");
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + String.format("%-22s","Potencia: " + cartas[i].getPotencia() + " CV");
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + String.format("%-22s","Velocidad: " + cartas[i].getVelocidad() + " km/h");
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + String.format("%-22s","Consumo 100km: " + cartas[i].getConsumo() + " l");
        }
        s += "|\n";
        for (int i = 0; i < numCartas; i++) {
            s += "|" + "-".repeat(22);
        }
        s += "|";
        System.out.println(s);
    }

    /**
     * Escribe una línea con los nombres de los jugadores CENTRADOS separados por una barra vertical
     * para que queden estos nombres encima de las cartas con las que participan en la jugada.
     * Ver ejemplo de la ejecución del juego:
     * |        Aitor         |         Alba         |         Edu          |
     * @param jugadores Array con los jugadores que juegan
     */
    private void pintarJugadores(Jugador[] jugadores) {
        // TODO 33: pintarJugadores
        int n, m;
        String nombre;
        String s = "|";
        for (Jugador jugador : jugadores) {
            nombre = jugador.getNombre();
            n = (22 - nombre.length()) / 2;
            m = 22 - nombre.length() - n;
            s += String.format("%-22s|"," ".repeat(n) + nombre + " ".repeat(m));
        }
        System.out.println(s);
    }


    /**
     * Pinta la carta que se le pasa como parámetro.
     * Utiliza el método pintar() de la clase Carta.
     * @param numero de la carta siendo 1 la primera carta
     */
    public void pintarCarta(int numero) {
        // TODO 34: pintarCarta
        cartas[numero-1].pintar();
    }

    /**
     * Pinta los ganadores de cada característica en la jugada.
     * Se puede ver según la característica que se elija quién ganaría.
     * El valor mostrado es el devuelto por el método gana.
     */
    public void pintaGanadoresCaracteristicas() {
        System.out.println("=".repeat(22));
        System.out.println("Ganador a MOTOR: " + ganadores(MOTOR));
        System.out.println("Ganador a POTENCIA: " + ganadores(POTENCIA));
        System.out.println("Ganador a VELOCIDAD: " + ganadores(VELOCIDAD));
        System.out.println("Ganador a CONSUMO: " + ganadores(CONSUMO));
        System.out.println("=".repeat(22));
    }

    /**
     * Pinta los ganadores de la jugada en una línea separados los ganadores por comas.
     * Los valores son los devueltos por el método gana.
     */
    public void pintaGanadores() {
        System.out.println(Arrays.toString(ganadores(MOTOR)) + ", " +
                            Arrays.toString(ganadores(POTENCIA)) + ", " +
                            Arrays.toString(ganadores(VELOCIDAD)) + ", " +
                            Arrays.toString(ganadores(CONSUMO)));
    }

}
