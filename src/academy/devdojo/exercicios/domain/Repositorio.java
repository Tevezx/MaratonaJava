package academy.devdojo.exercicios.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;

// Meu repositorio pode armazenar qualquer tipo de objeto
// Repositorio<Usuario>
public class Repositorio<T> {
    private List<T> dados = new ArrayList<>();

    @Override
    public String toString() {
        return new StringJoiner(", ", Repositorio.class.getSimpleName() + "[", "]")
                .add("dados=" + dados)
                .toString();
    }

    public void add(T obj){
        dados.add(obj);
    }

    public List<T> listar(){
        return dados;
    }

    public List<T> filter(Predicate<T> predicate){
        List<T> filtred = new ArrayList<>();

        for (T t : dados) {
            if(predicate.test(t)){
                filtred.add(t);
            }
        }

        return filtred;
    }

    public List<T> getDados() {
        return dados;
    }

    public void setDados(List<T> dados) {
        this.dados = dados;
    }
}
