package academy.devdojo.maratonajava.Enumeracoes.test;

import academy.devdojo.maratonajava.Enumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.Enumeracoes.dominio.TipoCliente;
import academy.devdojo.maratonajava.Enumeracoes.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA);
        Cliente cliente03 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA);

        Cliente cliente04 = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);

        System.out.println(cliente04);

        // Métodos dentro do Enum
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100.0));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100.0));


        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente02 = TipoCliente.tipoClienteNomeRelatorio("Pessoa Fisíca");
        System.out.println(tipoCliente02);
    }
}
