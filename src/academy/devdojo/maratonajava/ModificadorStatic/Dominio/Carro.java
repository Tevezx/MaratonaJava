package academy.devdojo.maratonajava.ModificadorStatic.Dominio;

public class Carro {
    private String nome;
    private Double velocidadeMaxima;
    // static faz com que o atributo pertenca a classe
    // Todos os objetos agora tem o valor de 250.0
    private static Double velocidadeLimite = 250.0;

    public Carro(String nome, Double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-".repeat(10));
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(Double velocidadeLimite) {
        //Nao existe this, pois this referencia ao objeto
        //static pode nao ter referencia ao objeto, apenas classe

        //this.velocidadeLimite = velocidadeLimite;

        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static Double getVelocidadeLimite(){
        // Não posso acessar nenhuma variavel nao static
        // dentro de metodos static
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
