package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Carlos");
        funcionario.setIdade(19);
        funcionario.setSalario(new Double[]{1000.0,2000.0,1000.0});
        funcionario.mediaSalario();

        System.out.println("Média: " + funcionario.getMedia());
    }
}
