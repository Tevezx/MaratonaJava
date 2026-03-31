package academy.devdojo.maratonajava.Polimorfismo.test;

import academy.devdojo.maratonajava.Polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3.000);
        Tomate tomate = new Tomate("Tomate Americano", 20.0, "22/10/2022");
        tomate.setDataValidade("23/11/12");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-".repeat(10));
        CalculadoraImposto.calcularImposto(produto);
    }
}
