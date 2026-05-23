package academy.devdojo.exercicios.domain;

import java.util.StringJoiner;

public class Debito extends Pagamento{
    public Debito(String banco, Double valor) {
        super(banco, valor);
    }
}
