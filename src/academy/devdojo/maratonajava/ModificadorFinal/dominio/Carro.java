package academy.devdojo.maratonajava.ModificadorFinal.dominio;

public class Carro {
    private String nome;
    // Modificador Final = valor constante
    public static final Double VELOCIDADE_LIMITE = 250.0;
    public final Comprador COMPRADOR = new Comprador();

    // Métodos finais
    // Esse é o comportamento que eu quero para essa classe e filhos
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
