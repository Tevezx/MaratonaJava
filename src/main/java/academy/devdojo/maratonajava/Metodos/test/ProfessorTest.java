package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        Professor professor02 = new Professor();

        professor01.nome = "Carlos";
        professor01.idade = 19;
        professor01.sexo = 'M';

        professor02.nome = "Ana";
        professor02.idade = 19;
        professor02.sexo = 'F';

        professor01.imprimir();
        professor02.imprimir();
    }
}
