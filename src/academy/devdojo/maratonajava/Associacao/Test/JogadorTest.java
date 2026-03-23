package academy.devdojo.maratonajava.Associacao.Test;

import academy.devdojo.maratonajava.Associacao.Dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Carlos");
        Jogador jogador02 = new Jogador("Paulo");
        Jogador jogador03 = new Jogador("Roberto");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        // Associação Jogador (Objeto) se referencia como jogador
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
