package academy.devdojo.maratonajava.Metodos.dominio;

public class Pessoa {
    private String nome;
    private Integer idade;

    // Acoplamento é o quanto que uma classe conhece da outra
    // Baixo acoplamento = utilizar modificador de acesso privado
    // Privado = Os atributos so conseguem ser acessados pelo objeto

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // Crio uma camada que recebo o atributo = + segurança

    public void setNome(String nome){
        this.nome = nome; // A minha variavel recebe o nome do parametro
    }

    public void setIdade(Integer idade){
        if (idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    // Para pegar esse nome ou idade, eu preciso de um get
    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }
}
