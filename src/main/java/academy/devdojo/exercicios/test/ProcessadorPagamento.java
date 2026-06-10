package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.domain.Debito;
import academy.devdojo.exercicios.domain.Pagamento;
import academy.devdojo.exercicios.interfaces.ImetodoPagamento;

import java.time.LocalDate;

public class ProcessadorPagamento implements ImetodoPagamento {
    public static void main(String[] args) {
        Pagamento debito = new Debito("Santander", 200.0);
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.pagar(debito, 210.0);
    }

    @Override
    public <T extends Pagamento> void pagar(T metodoPagamento, Double valor) {
        if(valor == null || valor <= 0 || valor > metodoPagamento.getValor()) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }

        LocalDate now = LocalDate.now();
        System.out.println(now + " - Pagamento via " + metodoPagamento.getBanco() + " confirmado!");
    }
}
