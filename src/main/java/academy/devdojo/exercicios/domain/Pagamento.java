package academy.devdojo.exercicios.domain;

import java.util.StringJoiner;

public class Pagamento {
    private String banco;
    private Double valor;

    public Pagamento(String banco, Double valor) {
        this.banco = banco;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pagamento.class.getSimpleName() + "[", "]")
                .add("banco='" + banco + "'")
                .add("valor=" + valor)
                .toString();
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getValor() {
        return valor;
    }
}
