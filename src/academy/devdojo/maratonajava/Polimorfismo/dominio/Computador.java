package academy.devdojo.maratonajava.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final Double IMPOSTO = 20.0;

    public Computador(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("Calculando Imposto do Computador");
        return this.getValor() * IMPOSTO;
    }
}
