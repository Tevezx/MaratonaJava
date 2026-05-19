package academy.devdojo.maratonajava.Generics.service;

import academy.devdojo.maratonajava.Generics.dominio.Barco;
import academy.devdojo.maratonajava.Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcoDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcps disponiveis: " + barcoDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco: " + barco);
        barcoDisponiveis.add(barco);
        System.out.println("Barcos disponiveis: " + barcoDisponiveis);
    }
}
