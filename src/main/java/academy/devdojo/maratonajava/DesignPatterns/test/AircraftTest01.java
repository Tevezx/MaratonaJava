package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A"); // teria que retornar falso, pois comprei o assento na linha de cima
    }

    private static void bookSeat(String seat){
        // Quando estamos criando o objeto, estamos duplicando os dados (criando dois objetos)
        Aircraft aircraft = new Aircraft("Avião-123");
        System.out.println(aircraft.bookSeat(seat));
    }
}
