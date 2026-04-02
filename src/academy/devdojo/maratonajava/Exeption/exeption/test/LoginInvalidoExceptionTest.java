package academy.devdojo.maratonajava.Exeption.exeption.test;

import academy.devdojo.maratonajava.Exeption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);

        String userName = "Carlos";
        String senha = "123456";

        System.out.println("Usuario: ");
        String userNameDigit = scanner.nextLine();

        System.out.println("Senha: ");
        String senhaDigit = scanner.nextLine();

        if(!(userNameDigit.equals(userName)) || !(senhaDigit.equals(senha))){
            throw new LoginInvalidoException("Usuarios ou senhas inválidos");
        }

        System.out.println("Usuario logado com sucesso!");
    }
}
