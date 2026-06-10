package academy.devdojo.maratonajava.Associacao.Test;

import academy.devdojo.maratonajava.Associacao.Dominio.Escola;
import academy.devdojo.maratonajava.Associacao.Dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        // Associação Unidirecional
        // N - 1 Muitos professores para uma escola
        Professor professor = new Professor("Alfredo");
        Professor professor2 = new Professor("Carlos");

        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Lael", professores);

        escola.imprime();
    }
}
