/**
 * Clase Jugador que representa a un jugador de un juego de cartas de coches.
 * Tiene un nombre y tantas cartas como se le repartan.
 * El jugador puede sacar y meter cartas.
 * La lógica de sacar y meter cartas es de tipo LIFO (Last In First Out) o pila
 * la última carta que se recibe será la primera que se saca
 * @author TODO 20: escribe tu nombre
 */
public class Jugador {

    // region Atributos
    private String nombre;
    private Carta[] cartas;
    private int numeroCartas;
    // endregion

    /**
     * Constructor de la clase Jugador
     * Un jugador podría tener tantas cartas como tiene la baraja al inicio
     * pero al principio no tiene ninguna
     * @param nombre del jugador
     */
    public Jugador(String nombre) {
        // TODO 21: constructor Jugador
    }

    /**
     * Devuelve el nombre del jugador
     * @return nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de cartas por jugar del jugador
     * @return
     */
    public int getNumeroCartas() {
        return numeroCartas;
    }

    /**
     * Al meter una carta se incorpora después de la última que se tuviese
     * Se actualiza el contador de cartas que se dispone
     * @param carta Carta que se introduce
     */
    public void meterCarta(Carta carta) {
        // TODO 22: meterCarta
    }

    /**
     * Devuelve la carta que saca el jugador de su pila de cartas
     * Decrementa el número de cartas y limpia el array
     * @return carta sacada según LIFO (Last In First Out)
     */
    public Carta sacarCarta() {
        // TODO 23: sacarCarta
        return null;
    }

}
