package academy.devdojo.maratonajava.Junit.service;

import academy.devdojo.maratonajava.Junit.dominio.Person;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
class PersonServiceTest {

    private Person adult;
    private Person adultDois;
    private Person notAdult;
    private PersonService personService;

    // Esse metodo vai ser executado antes de todos eles
    @BeforeEach
    public void setUp() {
        adult = Person.builder().age(18).build();
        adultDois = Person.builder().age(21).build();
        notAdult = Person.builder().age(15).build();
        personService = new PersonService();
    }

    @Test
    // Normalmente se deixa bem explicito o nome do metodo
    // podemos utilizar o displayName para aparecer como nome do metodo
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
//        Person person = Person
//                .builder()
//                .age(15)
//                .build();
//
//        PersonService personService = new PersonService();

        // Tem que ser assim (isso se chama assertiva)
        // Quero que retorne false para esse meu personService criado anteriormente
        Assertions.assertEquals(false, personService.isAdult(notAdult));
        log.error("Age is lower 18 years");
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsUpperThan18() {
//        Person person = Person.
//                builder()
//                .age(18)
//                .build();

        PersonService personService = new PersonService();
        Assertions.assertEquals(true, personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        // Tem que lancar a exception do null pointer quando o isadult for null
        // Eu defino que deve lancar a excecao e a mensagem dela no meu service
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed(){
        List<Person> personList = List.of(adult, notAdult, adultDois);
        // Eu espero dois como true dentro da lista
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }

}