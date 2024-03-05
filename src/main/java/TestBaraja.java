public class TestBaraja {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
//        baraja.revolver();
        System.out.println("Número de cartas totales: " + baraja.getNumeroCartasTotales());
        System.out.println("Número de cartas sacadas: " + baraja.getNumeroCartasSacadas());
        System.out.println("Número de cartas pendientes: " + baraja.getNumeroCartasPendientes());
        baraja.sacarCarta();
        baraja.sacarCarta();
        baraja.sacarCarta();
        baraja.sacarCarta();
        System.out.println("Número de cartas totales: " + baraja.getNumeroCartasTotales());
        System.out.println("Número de cartas sacadas: " + baraja.getNumeroCartasSacadas());
        System.out.println("Número de cartas pendientes: " + baraja.getNumeroCartasPendientes());
    }

}
