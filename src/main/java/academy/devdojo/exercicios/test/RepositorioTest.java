package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.domain.Debito;
import academy.devdojo.exercicios.domain.Pagamento;
import academy.devdojo.exercicios.domain.Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Pagamento debito1 = new Debito("Itaú", 200.0);
        Pagamento debito2 = new Debito("Itaú", 100.0);

        Repositorio<Pagamento> repositorio = new Repositorio();
        repositorio.add(debito1);
        repositorio.add(debito2);
        System.out.println(repositorio.listar());

        List<Pagamento> filter = repositorio.filter(pagamento -> pagamento.getValor() > 100);
        System.out.println(filter);
    }
}
