package academy.devdojo.maratonajava.Polimorfismo.test;

import academy.devdojo.maratonajava.Polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11.000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10.0);
        Televisao televisao = new Televisao("Samsung 50", 5000.0);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-".repeat(15));
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-".repeat(15));
        CalculadoraImposto.calcularImposto(televisao);
    }
}
