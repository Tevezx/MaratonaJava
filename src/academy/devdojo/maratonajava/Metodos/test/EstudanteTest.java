package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.dominio.Estudante;
import academy.devdojo.maratonajava.Metodos.dominio.ImprimeEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana Vitória";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        // Parametros de referências
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
