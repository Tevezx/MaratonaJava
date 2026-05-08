package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Carlos";
        String nome2 = new String("Carlos");

        // Equals trabalha baseado no valor daquele objeto
        // Se os valores forem iguais, return true
        System.out.println(nome.equals(nome2));

        Smartphone smartphone1 = new Smartphone("1ABC1", "Iphone");
        // Dessa forma sao iguais
        // Smartphone smartphone2 = smartphone1;

        // Criando um novo objeto
        Smartphone smartphone2 = new Smartphone("1ABC1", "Iphone");

        // Não sao iguais, sao objetos diferentes, daria erro se eu nao tivesse feito a sobreescrita do metodo equals
        System.out.println(smartphone1.equals(smartphone2));
    }
}
