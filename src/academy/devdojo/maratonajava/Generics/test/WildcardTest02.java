package academy.devdojo.maratonajava.Generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

//        O java nao sabe qual o tipo da lista = type erasure
//        printConsulta(cachorros);
    }

    // A lista precisaria ser <Cachorro>, porem é pra isso que existe o wildcard
    // wildcard = ?

    // Posso receber animal ou qualquer um que seja filho
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//      Nao posso adicionar elementos a essa lista
//        Sera apenas para a leitura
//        animals.add(new Cachorro());
    }

    // Posso receber animal ou qualquer um que seja pai
    private static void printConsultaAnimal(List<? super Animal> animals){
        // Objetos sempre serao do tipo animal
        // Posso adicionar tanto cachorro quanto gato
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(animal);
        animals.add(animal2);

        for (Object object : animals) {
            if(object instanceof Cachorro cachorro){
                System.out.println(cachorro);
            }
        }
    }
}
