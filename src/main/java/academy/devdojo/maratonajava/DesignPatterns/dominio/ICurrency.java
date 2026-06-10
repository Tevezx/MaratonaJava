package academy.devdojo.maratonajava.DesignPatterns.dominio;

public interface ICurrency {
    String getSymbol();
}

class Real implements ICurrency{
    @Override
    public String getSymbol() {
        return "R$:";
    }
}

class UsDoll implements ICurrency{
    @Override
    public String getSymbol() {
        return "$:";
    }
}

// Quero criar uma moeda baseado no parametro
