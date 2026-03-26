package academy.devdojo.maratonajava.Enumeracoes.dominio;

public enum TipoCliente {
    // Nao precisam de tipo no atributo
    // Sao static e final
    // Posso acrescentar atributos ou nao
    PESSOA_FISICA(1, "Pessoa Fisíca"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final Integer VALOR;
    private final String nomeRelatorio;

    TipoCliente(Integer valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClienteNomeRelatorio(String nomeRelatorio){
        // values() retorna um array com os atributos
        for (TipoCliente tipo : values()) {
            if(tipo.getNomeRelatorio().equals(nomeRelatorio)){
                return tipo;
            }
        }
        return null;
    }

    public Integer getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
