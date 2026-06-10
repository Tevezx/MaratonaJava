package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.Aircraft;
import academy.devdojo.maratonajava.DesignPatterns.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        // Nao posso mais dar new NomeDaClasse, agora eu chamo o getInstance que ja cria uma classe co um determinado nome
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
