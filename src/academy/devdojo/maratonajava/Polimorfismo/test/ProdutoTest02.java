package academy.devdojo.maratonajava.Polimorfismo.test;

import academy.devdojo.maratonajava.Polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3.000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-".repeat(15));

        Produto produto02 = new Tomate("Tomate Americano", 20.0, "22/10/2022");
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());
    }
}
