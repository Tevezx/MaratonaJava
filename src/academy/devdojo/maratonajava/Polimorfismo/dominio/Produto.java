package academy.devdojo.maratonajava.Polimorfismo.dominio;

// Produto em sí não existe, o que existe sao os derivados dele, por isso ele é abstract
// Ele implementa a taxavel para que seus filhos possam utilizar os metodos da interface
public abstract class Produto implements Taxavel {
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
