package academy.devdojo.exercicios.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class ListSortEquals3 {
    private String nome;
    private Double nota;
    private static List<ListSortEquals3> alunos;

    public ListSortEquals3(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
        alunos = new ArrayList<>();
    }

    public static void main(String[] args) {
        ListSortEquals3 aluno1 = new ListSortEquals3("Carlos", 10.0);
        ListSortEquals3 aluno2 = new ListSortEquals3("Ana", 10.0);
        ListSortEquals3 aluno3 = new ListSortEquals3("Carlos Roberto", 8.0);
        ListSortEquals3 aluno4 = new ListSortEquals3("Andrea Ribeiro", 6.0);
        ListSortEquals3 aluno5 = new ListSortEquals3("Andrea Ribeiro", 6.0);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        // Exibindo em ordem decrescente
        alunos.sort((x1, x2) -> x2.compareTo(x1));
        exibirLista();

        System.out.println("-".repeat(10));

        // Exibindo em ordem alfabetica
        alunos.sort(ListSortEquals3::compareTo2);
        exibirLista();

        System.out.println("-".repeat(10));

        // .equals pelo nome dos alunos
        if(aluno4.equals(aluno5)){
            System.out.println("São as mesmas pessoas!");
        }else{
            System.out.println("São pessoas diferentes");
        }

        // removendo aluno
        alunos.remove(new ListSortEquals3("Carlos", 8.00));

    }

    public static void exibirLista() {
        for (ListSortEquals3 aluno : alunos) {
            System.out.println(aluno);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ListSortEquals3.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("nota=" + nota)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        // Estou decretando que o equals retorna positivo quando o nome é igual ao objeto que estou passando como parametro
        if (o == null || getClass() != o.getClass()) return false;
        ListSortEquals3 that = (ListSortEquals3) o;
        return Objects.equals(nome, that.nome);
    }

    // Comparando pela nota da classe pela nota do objeto que estou passando como parametro
    private int compareTo(ListSortEquals3 x1) {
        return this.nota.compareTo(x1.nota);
    }


    private int compareTo2(ListSortEquals3 nome1) {
        return this.nome.compareTo(nome1.nome);
    }
}
