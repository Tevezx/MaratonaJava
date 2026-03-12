package academy.devdojo.maratonajava.classes.test;

import academy.devdojo.maratonajava.classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Carlos";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante.Imprime();

    }
}
