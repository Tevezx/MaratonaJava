package academy.devdojo.exercicios.domain;

import academy.devdojo.exercicios.enums.Tipo;

import java.util.StringJoiner;

public class Transacao {
    private Long id;
    private Double valor;
    private Tipo tipo;

    public Transacao(Long id, Double valor, Tipo tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transacao.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("valor=" + valor)
                .add("tipo=" + tipo)
                .toString();
    }

    public Long getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
