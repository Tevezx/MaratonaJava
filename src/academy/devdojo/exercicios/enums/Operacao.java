package academy.devdojo.exercicios.enums;

import academy.devdojo.exercicios.interfaces.ICalculadora;

public enum Operacao {
    SOMA(Double::sum),
    SUB((a, b) -> a - b),
    MULT((a, b) -> a * b),
    DIV((a, b) -> a / b);

    private final ICalculadora icalculadora;

    Operacao(ICalculadora icalculadora) {
        this.icalculadora = icalculadora;
    }

    public Double executar(Double a, Double b){
        return icalculadora.calcular(a, b);
    }
}
