package academy.devdojo.maratonajava.Junit.test;

import academy.devdojo.maratonajava.Junit.dominio.Person;
import academy.devdojo.maratonajava.Junit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = Person.
                builder()
                .age(18)
                .build();
        PersonService personService = new PersonService();

        personService.isAdult(person);
    }
}
