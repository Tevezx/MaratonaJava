package academy.devdojo.maratonajava.Metodos.dominio;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Double[] salario;
    private Double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(salario == null){
            return;
        }

        for (int i = 0; i < salario.length; i++) {
            System.out.println(i + 1 + "º Salario: " + salario[i]);
        }
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }

        Double soma = 0.0;

        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }

        media = soma / salario.length;
        System.out.println("A média do seu salário é: " + media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setSalario(Double[] salario){
        this.salario = salario;
    }

    public String nome (){
        return this.nome;
    }

    public Integer idade(){
        return this.idade;
    }

    public Double[] salario(){
        return this.salario;
    }

    // Media nao é acessado, por isso ele tem apenas o get
    public Double getMedia() {
        return this.media;
    }
}
