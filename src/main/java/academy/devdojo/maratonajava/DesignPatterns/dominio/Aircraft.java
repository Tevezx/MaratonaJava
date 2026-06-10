package academy.devdojo.maratonajava.DesignPatterns.dominio;

import java.util.HashSet;
import java.util.Set;

// A classe precisa ser final
public final class Aircraft {
    private final Set<String> assentos = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
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

    public Set<String> getAssentos() {
        return assentos;
    }

    public String getName() {
        return name;
    }
}
