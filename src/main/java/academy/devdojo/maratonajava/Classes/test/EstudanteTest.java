package academy.devdojo.maratonajava.Classes.test;

import academy.devdojo.maratonajava.Classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Carlos";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante.Imprime();

    }
}
