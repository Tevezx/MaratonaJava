package academy.devdojo.maratonajava.Associacao.Test;

import academy.devdojo.maratonajava.Associacao.Dominio.Jogador;
import academy.devdojo.maratonajava.Associacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        // Unidirecional 1 - N
        // 1 time para muitos Jogadores
        // Muitos jogadores para 1 time

        Jogador jogador1 = new Jogador("Carlos");
        Jogador jogador2 = new Jogador("Pelé");

        Time time1 = new Time("Corinthians");
        Time time2 = new Time("Santos");

        jogador1.setTime(time1);
        jogador2.setTime(time2);

        jogador1.imprime();
        jogador2.imprime();


    }
}
