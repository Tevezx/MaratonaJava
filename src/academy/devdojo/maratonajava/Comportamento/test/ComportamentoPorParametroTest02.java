package academy.devdojo.maratonajava.Comportamento.test;

import academy.devdojo.maratonajava.Comportamento.dominio.Carro;
import academy.devdojo.maratonajava.Comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    public static List<Carro> carroList = List.of(
            new Carro("Green", 2011),
            new Carro("Black", 1998),
            new Carro("Red", 2019)
    );

    public static void main(String[] args) {
//        List<Carro> green = filter(carroList, new CarPredicate() {
//            @Override
//            public Boolean test(Carro carro) {
//                return carro.getColor().equals("Green");
//            }
//        });
//
//        System.out.println(green);

        // Esse é o conceito de lambda
        List<Carro> green = filter(carroList, carro -> carro.getColor().equals("Green"));
        List<Carro> year = filter(carroList, carro -> carro.getYear() < 2012);
        System.out.println(green);
        System.out.println(year);
    }

    // Existe a interface do java "Predicate" que faz exatamente isso só que com generics
    private static List<Carro> filter(List<Carro> carroList, Predicate<Carro> carPredicate) {
        List<Carro> filter = new ArrayList<>();

        for (Carro carro : carroList) {
            if(carPredicate.test(carro)){
                filter.add(carro);
            }
        }

        return filter;
    }


}
