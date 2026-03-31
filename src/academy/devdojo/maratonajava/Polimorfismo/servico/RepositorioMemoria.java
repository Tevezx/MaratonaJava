package academy.devdojo.maratonajava.Polimorfismo.servico;

import academy.devdojo.maratonajava.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando uma Memoria");
    }
}
