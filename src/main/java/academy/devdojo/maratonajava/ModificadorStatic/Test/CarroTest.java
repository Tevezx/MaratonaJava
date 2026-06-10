package academy.devdojo.maratonajava.ModificadorStatic.Test;

import academy.devdojo.maratonajava.ModificadorStatic.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
//       Carro carro01 = new Carro("BMW", 280.0);
//       Carro carro02 = new Carro("Mercedes", 230.0);
//       Carro carro03 = new Carro("Audi", 300.0);

        // Todas as instancias agora terao valor de 180.0
        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180.0);
        System.out.println(Carro.getVelocidadeLimite());

//        carro01.imprime();
//        carro02.imprime();
//        carro03.imprime();
    }
}
