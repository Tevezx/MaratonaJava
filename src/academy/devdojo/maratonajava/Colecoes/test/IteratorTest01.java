package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Filme;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        // LinkedList -> serve para saber a proxima e anterior posicao do array
        // É muito boa se for trabalhar com bastante remoções
        // Ela é usada em programacao orientada a interfaces (pois list é uma interface <>)
        List<Filme> filmes = new LinkedList<>();
        filmes.add(new Filme(2L, "Interestelar", 200.000, 0));
        filmes.add(new Filme(1L, "Carros", 100.000, 5));
        filmes.add(new Filme(4L, "Como eu era antes de voce", 60.000, 0));
        filmes.add(new Filme(3L, "Esposa de Mentirinha", 50.000, 2));

//        // Classe que checa antes de fazer alguma acao
//        Iterator<Filme> filmeIterator = filmes.iterator();
//
//        // enquanto o filmeIterator existir
//        while(filmeIterator.hasNext()){
//            // Verifico se o proximo é igual a zero
//            if(filmeIterator.next().getQuantidade() == 0){
//                // removo se for
//                filmeIterator.remove();
//            }
//        }

        // Programação funcional, vamos aprender apos generics
        // Faz a mesma coisa do primeiro exemplo, por baixo dos panos
        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println(filmes);
    }
}
