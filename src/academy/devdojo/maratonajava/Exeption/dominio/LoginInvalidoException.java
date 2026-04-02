package academy.devdojo.maratonajava.Exeption.dominio;

public class LoginInvalidoException extends Exception{
    // Significa que eu tenho essa exception customizada


    public LoginInvalidoException() {
        super("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
