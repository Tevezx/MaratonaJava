package academy.devdojo.maratonajava.Heranca.Dominio;

// Ele extende de Pessoa
// Perigoso, pois qualquer mudanca em pessoa afeta funcionario
// Não existe heranca dupla

// Funcionario é uma pessoa
public class Funcionario extends Pessoa {
    // Funcionario é uma pessoa
    private Double salario;

    static{
        System.out.println("Dentro do bloco estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    // Construtores sendo chamado da classe Pessoa
    public Funcionario(String nome, String cpf){
        super(nome, cpf);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprimir() {
        // Quero as informações da pessoa + salario do funcionario
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    // O protected faz com que classes que estejam no mesmo
    // pacote ou extends consigam acessar atributos privados
    // this.nome
    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de: R$:" + getSalario());
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
