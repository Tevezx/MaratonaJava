package academy.devdojo.maratonajava.Generics.test;

import academy.devdojo.maratonajava.Generics.dominio.Barco;
import academy.devdojo.maratonajava.Generics.dominio.Carro;
import academy.devdojo.maratonajava.Generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Utilizando carro durante 1 mês");
        carroRentavelService.retornarCarroAlugado(carro);

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();

        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Utilizando barco durante 1 mês");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
