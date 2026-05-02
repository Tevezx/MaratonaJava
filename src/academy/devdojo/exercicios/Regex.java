package academy.devdojo.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Pattern pattern = Pattern.compile(
            "Cliente: ([A-Za-z ]+), Email: ([\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}), Telefone: (\\(\\d{2}\\) \\d{5}-\\d{4})"
    );

    public static List<String> validarCliente(List<String> clientesCadastrados) {
        List<String> clientesValidados = new ArrayList<>();

        for (String clientesCadastrado : clientesCadastrados) {
            Matcher matcher = pattern.matcher(clientesCadastrado);

            if (matcher.find()) {
                String nome = matcher.group(1);
                String email = matcher.group(2);
                String telefone = matcher.group(3);

                String resultado = "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
                clientesValidados.add(resultado);
            }
        }

        return clientesValidados;
    }

    public static void main(String[] args) {
        List<String> clientesCadastrados = new ArrayList<>();

        clientesCadastrados.add("Cliente: Carlos, Email: carlos#gmail.com, Telefone: (11) 98898 8080");
        clientesCadastrados.add("Cliente: Carlos, Email: carlos@gmail.com, Telefone: (11) 98898-8080");
        System.out.println("Clientes válidos: " + validarCliente(clientesCadastrados));

    }
}
