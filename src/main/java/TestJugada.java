public class TestJugada {

    public static void main(String[] args) {
        int n = 93;
        System.out.println("*".repeat(n));
        demo1();
        System.out.println("*".repeat(n));
        demo2();
        System.out.println("*".repeat(n));
        demo3();
        System.out.println("*".repeat(n));
        demo4();
        System.out.println("*".repeat(n));
        demo5();
        System.out.println("*".repeat(n));
    }

    private static void demo1(){
        Carta carta1 = new Carta("Jaguar XJ 6 3.6", "jaguarxj", "GB", 3590, 102, 219, 13.5);
        Carta carta2 = new Carta("Mercury Sable", "mercurys", "EEUU", 2513, 221, 185, 13.5);
        Carta carta3 = new Carta("Seat Ibiza 1.5 GLX", "ibizaglx", "ES", 1461, 85, 220, 11.5);
        Carta carta4 = new Carta("Audi 80 Quattro", "audi80Q", "DE", 1847, 113, 193, 9.2);
        Carta[] cartas = new Carta[]{carta1, carta2, carta3, carta4};
        Jugada jugada = new Jugada(cartas);
        //jugada.pintaCartas();
        jugada.pintaGanadores();
    }

    private static void demo2(){
        Carta carta1 = new Carta("Volvo 780", "volvo780", "SWE", 2458, 165, 200, 14.5);
        Carta carta2 = new Carta("Mercury Sable", "mercurys", "EEUU", 2513, 102, 185, 13.5);
        Carta carta3 = new Carta("Seat Ibiza 1.5 GLX", "ibizaglx", "ES", 1461, 85, 168, 9.5);
        Carta carta4 = new Carta("Audi 80 Quattro", "audi80Q", "DE", 1847, 113, 213, 11.2);
        Carta[] cartas = new Carta[]{carta1, carta2, carta3, carta4};
        Jugada jugada = new Jugada(cartas);
        //jugada.pintaCartas();
        jugada.pintaGanadores();
    }

    private static void demo3(){
        Carta carta1 = new Carta("Coche 1", "c1", "P1", 2458, 120, 200, 8.5);
        Carta carta2 = new Carta("Coche 2", "c2", "P2", 2458, 120, 200, 14.5);
        Carta carta3 = new Carta("Coche 3", "c3", "P3", 2458, 120, 180, 14.5);
        Carta carta4 = new Carta("Coche 4", "c4", "P4", 2458, 80, 180, 8.5);
        Carta[] cartas = new Carta[]{carta1, carta2, carta3, carta4};
        Jugada jugada = new Jugada(cartas);
        //jugada.pintaCartas();
        jugada.pintaGanadores();
    }

    private static void demo4(){
        Carta carta1 = new Carta("Coche 1", "c1", "P1", 2358, 120, 200, 18.5);
        Carta carta2 = new Carta("Coche 2", "c2", "P2", 2458, 100, 200, 18.5);
        Carta carta3 = new Carta("Coche 3", "c3", "P3", 2458, 120, 180, 14.5);
        Carta carta4 = new Carta("Coche 4", "c4", "P4", 2458, 120, 200, 14.5);
        Carta[] cartas = new Carta[]{carta1, carta2, carta3, carta4};
        Jugada jugada = new Jugada(cartas);
        //jugada.pintaCartas();
        jugada.pintaGanadores();
    }

    private static void demo5(){
        Carta carta1 = new Carta("Coche 1", "c1", "P1", 2358, 100, 200, 14.5);
        Carta carta2 = new Carta("Coche 2", "c2", "P2", 2458, 120, 180, 14.5);
        Carta carta3 = new Carta("Coche 3", "c3", "P3", 2458, 100, 200, 14.5);
        Carta carta4 = new Carta("Coche 4", "c4", "P4", 2358, 120, 170, 14.5);
        Carta[] cartas = new Carta[]{carta1, carta2, carta3, carta4};
        Jugada jugada = new Jugada(cartas);
        //jugada.pintaCartas();
        jugada.pintaGanadores();
    }

}
