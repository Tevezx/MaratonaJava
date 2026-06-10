package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}
