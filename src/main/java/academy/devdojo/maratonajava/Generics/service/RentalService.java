package academy.devdojo.maratonajava.Generics.service;

import academy.devdojo.maratonajava.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

// <T> significa que eu so irei saber o tipo quando criar o objeto
// So vai ser definido na execucao do codigo
public class RentalService<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto : " + t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
    }
}
