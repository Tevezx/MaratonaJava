package academy.devdojo.maratonajava.Junit.service;

import academy.devdojo.maratonajava.Junit.dominio.Person;

import java.util.List;
import java.util.Objects;

// Essa classe precisa ser testada, pois possui regras de negocios
// alt + insert, vai ate test e cria o test
// Ele sera criado na pasta de test gracas ao maven
public class PersonService {
    public Boolean isAdult(Person person) {
        // Se caso o objeto que passo como parametro for nulo, eu retorno essa mensagem
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList){
        return personList.stream().filter(this::isAdult).toList();
    }
}
