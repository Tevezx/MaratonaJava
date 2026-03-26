package academy.devdojo.maratonajava.ClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.2;
    }

}
