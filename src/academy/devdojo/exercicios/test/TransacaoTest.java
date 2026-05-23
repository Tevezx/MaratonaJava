package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.domain.Transacao;
import academy.devdojo.exercicios.enums.Tipo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TransacaoTest {
    public static void main(String[] args) {
        List<Transacao> transacaoList = new ArrayList<>();

        Transacao transacao1 = new Transacao(123L, 200.0, Tipo.ENTRADA);
        Transacao transacao2 = new Transacao(123L, 100.0, Tipo.SAIDA);
        Transacao transacao3 = new Transacao(234L, 1000.0, Tipo.ENTRADA);

        transacaoList.add(transacao1);
        transacaoList.add(transacao2);
        transacaoList.add(transacao3);

        List<Transacao> filtered = filter(transacaoList, transacao -> transacao.getValor() > 200);
        System.out.println(filtered);

        List<Transacao> filterEntrada = filter(transacaoList, transacao -> transacao.getTipo().equals(Tipo.ENTRADA));
        System.out.println(filterEntrada);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filter = new ArrayList<>();

        for (T t : list) {
            if(predicate.test(t)){
                filter.add(t);
            }
        }

        return filter;
    }
}
