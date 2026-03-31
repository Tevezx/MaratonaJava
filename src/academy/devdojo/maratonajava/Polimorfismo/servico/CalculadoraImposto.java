package academy.devdojo.maratonajava.Polimorfismo.servico;

import academy.devdojo.maratonajava.Polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    // Parâmetros polimorficos
    // Passo um objeto para um objeto generico/amplo
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        Double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        // APenas o objeto tomate aparece a data de validade
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
