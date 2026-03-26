package academy.devdojo.maratonajava.ClassesAbstratas.dominio;

// Não posso criar um objeto do tipo funcionario
// Apenas um objeto que extende do funcionario
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected Double salario;

    // Preciso do construtor para o gerente acessar
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }
}
