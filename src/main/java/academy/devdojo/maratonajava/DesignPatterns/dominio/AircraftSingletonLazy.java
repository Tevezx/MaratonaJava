package academy.devdojo.maratonajava.DesignPatterns.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    public AircraftSingletonLazy(String name) {
        this.name = name;
    }

    // Inicializacao
    {
        assentos.add("1A");
        assentos.add("1B");
    }

    // Comprando assento
    public Boolean bookSeat(String seat) {
        return assentos.remove(seat);
    }

    public static AircraftSingletonLazy getInstance() {
        // Dessa forma se existir outras threads, as duas verificam em sincronizacao se a instancia é null
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("Avião-123");
                }
            }
        }

        return INSTANCE;
    }
}
