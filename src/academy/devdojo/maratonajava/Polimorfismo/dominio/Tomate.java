package academy.devdojo.maratonajava.Polimorfismo.dominio;

public class Tomate extends Produto{
    // Imposto será constante esse valor
    public static final Double IMPOSTO = 20.0;
    private String dataValidade;

    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, Double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public Double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.getValor()  * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
