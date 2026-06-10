package academy.devdojo.maratonajava.Polimorfismo.test;

import academy.devdojo.maratonajava.Polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.Polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
