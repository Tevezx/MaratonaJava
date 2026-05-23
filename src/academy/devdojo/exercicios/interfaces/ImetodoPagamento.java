package academy.devdojo.exercicios.interfaces;

import academy.devdojo.exercicios.domain.Pagamento;

public interface ImetodoPagamento {
    <T extends Pagamento> void pagar(T pagamento, Double valor);
}
