package academy.devdojo.exercicios.domain;

import java.util.StringJoiner;

public class Credito extends Pagamento{
    public Credito(String banco, Double valor) {
        super(banco, valor);
    }
}
