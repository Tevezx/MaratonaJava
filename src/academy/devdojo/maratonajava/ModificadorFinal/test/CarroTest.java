package academy.devdojo.maratonajava.ModificadorFinal.test;

import academy.devdojo.maratonajava.ModificadorFinal.dominio.Carro;
import academy.devdojo.maratonajava.ModificadorFinal.dominio.Comprador;
import academy.devdojo.maratonajava.ModificadorFinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("Carlos");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Lorenzzo");
        ferrari.imprime();
    }
}
