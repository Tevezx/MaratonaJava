package academy.devdojo.maratonajava.Classes.test;

import academy.devdojo.maratonajava.Classes.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        // Referência de objetos - Os objetos precisam ser iguais
        carro02 = carro01;

        carro01.nome = "HB20";
        carro01.modelo = "Hatch";
        carro01.ano = 2025;

        carro02.nome = "Fusca";
        carro02.modelo = "Sedâ";
        carro02.ano = 2028;

        carro01.Imprime();
        carro02.Imprime();
    }
}
