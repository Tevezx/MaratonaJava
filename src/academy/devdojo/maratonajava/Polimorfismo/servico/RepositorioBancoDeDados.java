package academy.devdojo.maratonajava.Polimorfismo.servico;

import academy.devdojo.maratonajava.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um Banco de dados");
    }
}
