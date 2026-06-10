package academy.devdojo.maratonajava.Generics.test;

import academy.devdojo.maratonajava.Generics.dominio.Barco;
import academy.devdojo.maratonajava.Generics.dominio.Carro;
import academy.devdojo.maratonajava.Generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.Generics.service.CarroRentavelService;
import academy.devdojo.maratonajava.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarObjetoDisponivel();
        carroRentalService.retornarObjetoAlugado(carro);

        System.out.println("-".repeat(10));

        RentalService<Barco> barcoRentalService = new RentalService<>(barcoDisponiveis);
        Barco barco = barcoRentalService.buscarObjetoDisponivel();
        barcoRentalService.retornarObjetoAlugado(barco);
    }
}
