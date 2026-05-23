package academy.devdojo.exercicios.domain;

import java.util.StringJoiner;

public class Notificacao {
    private String mensagem;
    private Boolean lida;

    public Notificacao(String mensagem, Boolean lida) {
        this.mensagem = mensagem;
        this.lida = lida;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Notificacao.class.getSimpleName() + "[", "]")
                .add("mensagem='" + mensagem + "'")
                .add("lida=" + lida)
                .toString();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getLida() {
        return lida;
    }
}
