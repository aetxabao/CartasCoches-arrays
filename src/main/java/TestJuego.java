public class TestJuego {

    public static void main(String[] args) {
        int n = 93;
        testPresentacion();
        System.out.println("-".repeat(n ));
        testCrearJugadores();
        System.out.println("-".repeat(n));
        testRepartirCartas();
        System.out.println("-".repeat(n));
        testPedirCaracteristica();
        System.out.println("-".repeat(n));
        testMostrarGanadores();
        System.out.println("-".repeat(n));
        testJugarJugada();
        System.out.println("-".repeat(n));
        testMostrarResultados();
        System.out.println("-".repeat(n));
        testActualizarContadores1();
        System.out.println("-".repeat(n));
        testActualizarContadores2();
        System.out.println("-".repeat(n));
        testActualizarContadores3();
        System.out.println("-".repeat(n));
        testActualizarContadores4();
        System.out.println("-".repeat(n));
        testActualizarContadores5();
        System.out.println("-".repeat(n));
    }

    public static void testPresentacion() {
        Juego juego = new Juego();
        juego.presentacion();
    }

    private static void testCrearJugadores() {
        Juego juego = new Juego();
        juego.crearJugadores();
        System.out.println("Nombres de los jugadores:");
        int n = juego.numeroJugadores();
        for (int i = 1; i <= n; i++) {
            System.out.println("Jugador " + i + ": " + juego.getJugador(i).getNombre());
        }
    }

    private static void testRepartirCartas() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.repartirCartas();
        System.out.println("Cartas de los jugadores:");
        System.out.println("Jugador 1: " + juego.getJugador(1).getNumeroCartas());
        System.out.println("Jugador 2: " + juego.getJugador(2).getNumeroCartas());
        System.out.println("Jugador 3: " + juego.getJugador(3).getNumeroCartas());
        System.out.println("Jugador 4: " + juego.getJugador(4).getNumeroCartas());
        System.out.println("Cartas de los jugadores:");
        System.out.println(".".repeat(22));
        int numJugadores = juego.numeroJugadores();
        int numCartasJugador = juego.getJugador(4).getNumeroCartas();
        for (int i = 1; i <= numJugadores; i++) {
            System.out.println("Cartas del jugador " + i + ":");
            for (int j = 1; j <= numCartasJugador; j++) {
                System.out.println(juego.getJugador(i).sacarCarta().getNombre());
            }
            System.out.println(".".repeat(22));
        }
        System.out.println("Turno: " + juego.getTurno());
    }

    private static void testPedirCaracteristica() {
        Juego juego = new Juego();
        juego.setJugadores(new Jugador[]{new Jugador("Jugador1")});
        juego.setTurno(1);
        int i = juego.pedirCaracteristica();
        System.out.println("Característica: " + i);
    }

    private static void testMostrarGanadores() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.mostrarGanadores(new int[]{1, 0, 0, 0});//1
        juego.mostrarGanadores(new int[]{1, 0, 1, 0});//5
        juego.mostrarGanadores(new int[]{0, 1, 1, 0});//7
        juego.mostrarGanadores(new int[]{1, 0, 0, 1});//9
        juego.mostrarGanadores(new int[]{0, 0, 1, 1});//12
        juego.mostrarGanadores(new int[]{1, 1, 1, 1});//15
    }

    private static void testJugarJugada() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.repartirCartas();
        juego.jugarJugada();
    }

    private static void testMostrarResultados() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.mostrarResultados();
    }

    private static void testActualizarContadores1() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.actualizarContadores(new int[]{1,0,0,0});//1
        juego.actualizarContadores(new int[]{0,1,0,0});//2
        juego.actualizarContadores(new int[]{0,0,1,0});//4
        juego.actualizarContadores(new int[]{0,0,0,1});//8
        juego.mostrarResultados();
    }

    private static void testActualizarContadores2() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.actualizarContadores(new int[]{0,1,0,0});//2
        juego.actualizarContadores(new int[]{1,0,0,0});//1
        juego.actualizarContadores(new int[]{0,0,0,1});//8
        juego.actualizarContadores(new int[]{0,0,1,0});//4
        juego.mostrarResultados();
    }

    private static void testActualizarContadores3() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.actualizarContadores(new int[]{1,1,1,1});//15
        juego.actualizarContadores(new int[]{1,1,1,0});//7
        juego.actualizarContadores(new int[]{1,1,0,0});//3
        juego.actualizarContadores(new int[]{1,0,0,1});//9
        juego.mostrarResultados();
    }

    private static void testActualizarContadores4() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.actualizarContadores(new int[]{0,1,1,1});//14
        juego.actualizarContadores(new int[]{1,0,1,1});//13
        juego.actualizarContadores(new int[]{1,1,0,1});//11
        juego.actualizarContadores(new int[]{0,0,1,1});//12
        juego.mostrarResultados();
    }

    private static void testActualizarContadores5() {
        Juego juego = new Juego();
        Jugador[] jugadores = new Jugador[]{
                new Jugador("Jugador1"),
                new Jugador("Jugador2"),
                new Jugador("Jugador3"),
                new Jugador("Jugador4")
        };
        juego.setJugadores(jugadores);
        juego.actualizarContadores(new int[]{0,1,1,0});//6
        juego.actualizarContadores(new int[]{0,1,0,1});//10
        juego.actualizarContadores(new int[]{1,0,1,0});//5
        juego.actualizarContadores(new int[]{1,1,1,1});//15
        juego.mostrarResultados();
    }

}
