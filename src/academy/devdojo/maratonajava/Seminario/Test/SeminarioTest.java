package academy.devdojo.maratonajava.Seminario.Test;

import academy.devdojo.maratonajava.Seminario.Dominio.Aluno;
import academy.devdojo.maratonajava.Seminario.Dominio.Local;
import academy.devdojo.maratonajava.Seminario.Dominio.Professor;
import academy.devdojo.maratonajava.Seminario.Dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Ana", 19);
        Professor professor = new Professor("Carlos", "Programação");

        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Amor", alunosSeminario, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminario(seminarios);

        professor.imprime();
    }
}
