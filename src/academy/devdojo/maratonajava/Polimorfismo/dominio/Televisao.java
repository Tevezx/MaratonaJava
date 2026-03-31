package academy.devdojo.maratonajava.Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final Double IMPOSTO = 0.10;

    public Televisao(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("Calculando Imposto da Televisão");
        return this.getValor() * IMPOSTO;
    }
}
