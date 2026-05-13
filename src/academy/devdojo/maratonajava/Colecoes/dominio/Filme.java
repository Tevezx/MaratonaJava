package academy.devdojo.maratonajava.Colecoes.dominio;

import java.util.Objects;
import java.util.StringJoiner;

// comparable disponibiliza o metodo compareTo
// com compareTo eu consigo selecionar qual atributo sera comparado para ordenar a minha lista
// no caso, selecionei o id para ser como sort da lista
public class Filme implements Comparable<Filme> {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Filme(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo"); // nao podem ser nulos
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Filme(Long id, String nome, Double preco, Integer quantdade) {
        this(id, nome, preco);
        this.quantidade = quantdade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Filme.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("nome='" + nome + "'")
                .add("preco=" + preco)
                .toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Filme o) {
        // this objeto que esta excutando
        // o objeto que esta passando como parametro
//        // retorna um valor inteiro (negativo se o this < o) (this == o return 0) (positivo this > o)
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        // Faz a mesma coisa, porem so em tipos wrapper
        // return this.nome.compareTo(o.getNome());
        // return this.preco.compareTo(o.getPreco());
        return this.nome.compareTo(o.getNome());
    }
}
