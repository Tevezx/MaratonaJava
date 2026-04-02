package academy.devdojo.maratonajava.Exeption.exeption.test;

import academy.devdojo.maratonajava.Exeption.dominio.Funcionario;
import academy.devdojo.maratonajava.Exeption.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.Exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
            funcionario.salvar();
        }catch (LoginInvalidoException | FileNotFoundException | ArithmeticException e){
            e.printStackTrace();
        }

    }

}
