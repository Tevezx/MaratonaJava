package academy.devdojo.maratonajava.Generics.test;

import academy.devdojo.maratonajava.Generics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcos = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcos);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}


