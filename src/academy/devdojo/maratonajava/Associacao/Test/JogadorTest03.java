package academy.devdojo.maratonajava.Associacao.Test;

import academy.devdojo.maratonajava.Associacao.Dominio.Jogador;
import academy.devdojo.maratonajava.Associacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // Bidirecional

        Jogador jogador01 = new Jogador("Carlos");
        Jogador jogador02 = new Jogador("Ana Vitória");

        Jogador jogadores[] = {jogador01, jogador02};
        Time time = new Time("Corinthians");

        jogador01.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----------Jogadores----------");
        jogador01.imprime();
        jogador02.imprime();

        System.out.println("----- Time ------");
        time.imprime();
    }
}
