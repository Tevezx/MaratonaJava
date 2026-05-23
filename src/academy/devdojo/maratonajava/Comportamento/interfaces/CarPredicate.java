package academy.devdojo.maratonajava.Comportamento.interfaces;

import academy.devdojo.maratonajava.Comportamento.dominio.Carro;

// Possui apenas um metodo
// Para utilizar Lambdas precisamos de interfaces funcionais
// No caso, isso é uma lambda Predicate
@FunctionalInterface
public interface CarPredicate {
    // Contrato da minha lambda
    Boolean test(Carro carro);
}
