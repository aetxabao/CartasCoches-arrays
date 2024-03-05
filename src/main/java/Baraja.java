import java.util.Random;

/**
 * Clase que representa un mazo de cartas de coches.
 * Se pueden revolver las cartas y sacar una carta hasta haber sacado todas.
 * @author TODO 10: escribe tu nombre
 */
public class Baraja {

    /** Cartas de la baraja */
    private final static Carta[] cartas = new Carta[]{
new Carta("Jaguar XJ 6 3.6", "jaguarxj", "GB", 3590, 221, 219, 13.5),
new Carta("Mercury Sable", "mercurys", "EEUU", 2513, 102, 185, 13.5),
new Carta("Seat Ibiza 1.5GLX", "ibizaglx", "ES", 1461, 85, 168, 9.5),
new Carta("Audi 80 Quattro", "audi80Q", "DE", 1847, 113, 193, 11.2),
new Carta("Volvo 780", "volvo780", "SWE", 2458, 165, 200, 14.5),
new Carta("Opel Omega 2.0i", "opelo2i", "DE", 1998, 122, 200, 10.4),
new Carta("Peugeot 309 GRD", "peugeot309", "FR", 1905, 64, 160, 5.8),
new Carta("Rover Sterling", "stearling", "GB", 2494, 167, 211, 9.5),
new Carta("VW Golf GTI 16V", "golfgti16", "GE", 1781, 139, 208, 8.2),
new Carta("Ford RS 200", "rs200", "GE", 1804, 230, 240, 18),
new Carta("Renault 25 gtx", "renault25", "FR", 2165, 121, 196, 9.6),
new Carta("Emelba Siete", "emelba", "ES", 1461, 86, 160, 13),
new Carta("Renault 21", "renault21", "FR", 1721, 88, 185, 6.9),
new Carta("Fiat Croma 2000ie", "croma2ki", "IT", 1995, 120, 195, 11),
new Carta("Opel Kadett GSI", "opelkadett", "DE", 1796, 115, 203, 8),
new Carta("Mazda RX 7", "mazdarx7", "JP", 1308, 150, 218, 14.1),
new Carta("Nissan Sunny", "sunny", "JP", 1585, 73, 160, 8.7),
new Carta("BMW 735i", "bmw735i", "DE", 3403, 211, 230, 11.7),
new Carta("Citroen AX 10E", "ax10", "FR", 954, 45, 145, 5),
new Carta("Mercedes 380SEC", "mercedes380", "DE", 3839, 204, 210, 11.1),
new Carta("Alfa Romeo 75", "alfarome75", "IT", 2492, 156, 210, 9.6),
new Carta("Subaru XT Allrad", "subaruxt", "JP", 1781, 136, 200, 8.5),
new Carta("Mercedes Benz 200", "mercedes200", "DE", 1997, 109, 187, 8.8),
new Carta("BMW M3", "bmwm3", "DE", 2302, 200, 238, 10.5),
new Carta("Ferrari 328 GTS", "ferrari328", "IT", 3185, 270, 263, 12.4),
new Carta("Aston M. Zagato", "astonmartin", "GB", 5314, 432, 299, 24),
new Carta("Porsche 928 S4", "porsche928", "DE", 4957, 320, 275, 16.1),
new Carta("Toyota Supra 3.0i", "toyotasupra", "JP", 2954, 204, 224, 13.1),
new Carta("Ford Scort 1.3", "scort", "GE", 1297, 60, 157, 6.7),
new Carta("Honda Accord Deck", "hondaaccord", "JP", 1932, 122, 193, 8.1),
new Carta("Volvo 480", "volvo480", "SWE", 1721, 109, 190, 7.9),
new Carta("Porsche 959", "porsche959", "DE", 2850, 450, 320, 20),
//new Carta("Citroen ZX 1.9i", "zxi", "FR", 1905, 130, 200, 9.8),
//new Carta("Ford Sierra 2.0i", "sierra2i", "ES", 1993, 120, 200, 10.5),
//new Carta("Fiat Tipo 1.6ie", "tipo16i", "IT", 1581, 110, 200, 9.8),
//new Carta("Peugeot 405 1.9i", "peugeot405i", "FR", 1905, 130, 200, 9.8),
//new Carta("Renault 19 1.8i", "renault19i", "FR", 1764, 95, 200, 9.8),
//new Carta("BMW 318i", "bmw318i", "DE", 1796, 113, 200, 9.8),
    };

    /** Posición de la carta que se va a sacar. */
    private int pos;

    public Baraja() {
        this.pos = 0;
    }

    /**
     * Revuelve las cartas intercambiando dos posiciones aleatorias de cartas tantas veces como cartas hay.
     */
    public void revolver() {
        // TODO 11: revolver
        Random rnd = new Random();
        int numCartas = cartas.length;
        for (int i = 0; i < numCartas; i++) {
            int a = rnd.nextInt(numCartas);
            int b = rnd.nextInt(numCartas);
            Carta c = cartas[a];
            cartas[a] = cartas[b];
            cartas[b] = c;
        }
        pos = 0;
    }

    /**
     * Método que saca una carta de la baraja.
     * Devuelve la carta correspondiente e incrementa la posición de la carta que se sacará la siguiente vez.
     * No pone al null la posición de la carta sacada, simplemente devulve la carta y corre la posición
     * @return Carta sacada de la baraja según la posición
     */
    public Carta sacarCarta() {
        // TODO 12: sacarCarta
        Carta carta = cartas[pos];
        pos++;
        return carta;
    }

    /**
     * Método que devuelve el número de cartas que quedan por sacar de la baraja
     * @return cartas pendientes por sacar
     */
    public int getNumeroCartasPendientes() {
        // TODO 13: getNumeroCartasPendientes
        return cartas.length - pos;
    }

    /**
     * Método que devuelve el número de cartas que se han sacado de la baraja
     * @return cartas sacadas
     */
    public int getNumeroCartasSacadas() {
        // TODO 14: getNumeroCartasSacadas
        return pos;
    }

    /**
     * Método que devuelve el número total de cartas de la baraja
     * @return cartas totales
     */
    public static int getNumeroCartasTotales() {
        // TODO 15: getNumeroCartasTotales
        return cartas.length;
    }

}
