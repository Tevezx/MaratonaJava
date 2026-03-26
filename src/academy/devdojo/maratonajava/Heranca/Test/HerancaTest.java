package academy.devdojo.maratonajava.Heranca.Test;

import academy.devdojo.maratonajava.Heranca.Dominio.Funcionario;

public class HerancaTest {

    // 0 - Bloco de  static é executado quando a JVM carregar a classe pai
    // 1 - Bloco de  static é executado quando a JVM carregar a classe filho
    // 2 - Alocado espaço em mémoria para o objeto da classe pai
    // 3 - Cada atributo de classe sao criados da classe pai
    // 4 - Bloco de inicializacao é executado da classe pai
    // 5 - Construtor é executado da classe pai
    // 6 - Alocado espaço em mémoria para o objeto da classe filho
    // 7 - Cada atributo de classe sao criados da classe filho
    // 8 - Bloco de inicializacao é executado da classe filho
    // 9 - Construtor é executado da classe filho

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", "111111-11");
    }
}
