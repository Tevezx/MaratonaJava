package academy.devdojo.maratonajava.ClassesAbstratas.dominio;

public class Gerente  extends  Funcionario{
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.1;
    }
}
