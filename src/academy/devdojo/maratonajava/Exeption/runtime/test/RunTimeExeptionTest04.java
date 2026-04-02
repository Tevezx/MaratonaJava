package academy.devdojo.maratonajava.Exeption.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExeptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        // Todas essas excessoes sao filhas de runtimeexception
        // Nao posso colocar a mais generica como primeira
        // Pois se nao ele sempre vai executar a mais generica primeiro
        // Excessoes genericas sempre ficam por ultimo
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Ele possui extends em ArrayIndexOutOfBoundsException, por isso exibe ele primeiro
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        /*
        try {
            talvezLanceException();
        }
        // Ao invés de capturar FileNotFoundException, posso pegar o pai dela que é Exception
        catch (SQLException e){
            System.out.println("SQLException");
            e.printStackTrace();
        }
        // Ao invés de capturar FileNotFoundException, posso pegar o pai dela que é IOException
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        }
        */

        try {
            talvezLanceException();
        }
        // Multi catch
        // Não podem estar na mesma linha de heranca
        catch (SQLException | FileNotFoundException e) {
            System.out.println("SQLException | FileNotFoundException");
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {}
}
