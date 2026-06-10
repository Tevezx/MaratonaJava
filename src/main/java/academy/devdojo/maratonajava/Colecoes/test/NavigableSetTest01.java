package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;
import academy.devdojo.maratonajava.Colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class FilmePrecoComparator implements Comparator<Filme>{
    @Override
    public int compare(Filme o1, Filme o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        // TreeSet = precis
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        // Organiza os dados conforme o meu compareTo
        // Utiliza o treeset quando a classe que eu criei implementa comparator (compareTo)
        // Toda vez que inserir um elemento ele vai ordenar conforme o compareTo
        // Nao permite duplicações de elementos
        NavigableSet<Filme> filmes = new TreeSet<>(new FilmePrecoComparator());
        filmes.add(new Filme(2L, "Interestelar", 200.000, 0));
        filmes.add(new Filme(1L, "Carros", 100.000, 5));
        filmes.add(new Filme(4L, "Como eu era antes de voce", 60.000, 0));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000, 2));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000, 2));

        // exibindo debaixo pra cima do meu compareTo (preços decresentes)
        for (Filme filme : filmes.descendingSet()) {
            System.out.println(filme);
        }

        System.out.println("-".repeat(10));

        Filme madagascar = new Filme(6L, "Madagascar", 1_000.000, 5);

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        // o menor preco antes de 1_000.000 é:
        System.out.println("-".repeat(10));
        System.out.println(filmes.lower(madagascar));

        // retorna o primeiro menor igual:
        System.out.println("-".repeat(10));
        System.out.println(filmes.floor(madagascar));

        // retorna o primeiro maior:
        System.out.println("-".repeat(10));
        System.out.println(filmes.higher(madagascar));

        // retorna o primeiro maior igual:
        System.out.println("-".repeat(10));
        System.out.println(filmes.ceiling(madagascar));

        System.out.println("-".repeat(10));
        System.out.println(filmes.size());

        // Retirando o primeiro objeto da lista:
        System.out.println(filmes.pollFirst());

        // Retirando o ultimo objeto da lista:
        System.out.println("-".repeat(10));
        System.out.println(filmes.pollLast());

        System.out.println(filmes.size());
    }
}
