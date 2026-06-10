package academy.devdojo.maratonajava.Comportamento.test;

import academy.devdojo.maratonajava.Comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    public static List<Carro> carroList = List.of(
            new Carro("Green", 2011),
            new Carro("Black", 1998),
            new Carro("Red", 2019)
    );

    public static void main(String[] args) {
        System.out.println(filterCarByColor(carroList, "Green"));
        System.out.println("-".repeat(10));
        System.out.println(filterCarByAge(carroList, 2019));
    }

    private static List<Carro> filterCarByColor(List<Carro> carroList, String color) {
        List<Carro> filterColor = new ArrayList<>();

        for (Carro carro : carroList) {
            if (carro.getColor().equals(color)) {
                filterColor.add(carro);
            }
        }

        return filterColor;
    }

    // Unica coisa que esta mudando é a condição
    private static List<Carro> filterCarByAge(List<Carro> carroList, Integer data) {
        List<Carro> filterAge = new ArrayList<>();

        for (Carro carro : carroList) {
            if(carro.getYear() < data){
                filterAge.add(carro);
            }
        }

        return filterAge;
    }
}
