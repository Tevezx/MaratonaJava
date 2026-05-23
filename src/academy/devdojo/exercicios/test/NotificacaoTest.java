package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.domain.Notificacao;
import academy.devdojo.exercicios.interfaces.ISeletor;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoTest{
    public static void main(String[] args) {
        Notificacao notificacao1 = new Notificacao("Ana e Carlos", true);
        Notificacao notificacao2 = new Notificacao("Carlos e Andrea", false);
        Notificacao notificacao3 = new Notificacao("Rodolpho e Ariane", true);
        Notificacao notificacao4 = new Notificacao("Michele e Fernando", false);

        List<Notificacao> notificacaoList = new ArrayList<>();
        notificacaoList.add(notificacao1);
        notificacaoList.add(notificacao2);
        notificacaoList.add(notificacao3);
        notificacaoList.add(notificacao4);

        List<Notificacao> filtrar = filtrar(notificacaoList, Notificacao -> Notificacao.getLida().equals(false));
        System.out.println(filtrar );
    }

    public static <T> List<T> filtrar(List<T> list, ISeletor<T> seletor){
        List<T> filtred = new ArrayList<>();

        for (T t : list) {
            if(seletor.testar(t)){
                filtred.add(t);
            }
        }

        return filtred;
    }
}
