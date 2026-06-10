package academy.devdojo.maratonajava.ClassesAbstratas.test;

import academy.devdojo.maratonajava.ClassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.ClassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 2000.0);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 3000.0);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
