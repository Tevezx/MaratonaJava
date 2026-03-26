package academy.devdojo.maratonajava.Enumeracoes.dominio;

public enum TipoPagamento {
    DEBITO {
        // Sobreescrita de metodo
        @Override
        public Double calcularDesconto(Double valor) {
            return valor * 0.1;
        }
    },

    CREDITO {
        // CTRL + O = cria automaticamente
        @Override
        public Double calcularDesconto(Double valor) {
            return valor * 0.5;
        }
    };

    // Metodo abstrato nao pode ter corpo,
    // ele é criado apenas para ser sobreescrito
    public abstract Double calcularDesconto(Double valor);
}
