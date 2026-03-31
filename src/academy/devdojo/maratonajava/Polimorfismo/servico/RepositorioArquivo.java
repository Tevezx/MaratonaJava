package academy.devdojo.maratonajava.Polimorfismo.servico;

import academy.devdojo.maratonajava.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
