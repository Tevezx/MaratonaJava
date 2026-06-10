package academy.devdojo.maratonajava.DesignPatterns.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> assentos;

    AircraftSingletonEnum() {
        this.assentos = new HashSet<>();
        this.assentos.add("1A");
        this.assentos.add("1B");
    }

    public Boolean bookSeat(String seat) {
        return assentos.remove(seat);
    }
}
