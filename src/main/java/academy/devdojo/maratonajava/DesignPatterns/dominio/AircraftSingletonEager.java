package academy.devdojo.maratonajava.DesignPatterns.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    // Eager initialization
    // Siginifica que a unica forma de eu criar um objeto dessa classe é chamando o getInstance que cria um objeto com o nome desse aviao
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("Avião-123");
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    public AircraftSingletonEager(String name) {
        this.name = name;
    }

    // Inicializacao
    {
        assentos.add("1A");
        assentos.add("1B");
    }

    // Comprando assento
    public Boolean bookSeat(String seat){
        return assentos.remove(seat);
    }

    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }
}
