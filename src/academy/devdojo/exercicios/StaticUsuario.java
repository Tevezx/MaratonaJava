package academy.devdojo.exercicios;

public class StaticUsuario {
    private String nome;
    // Se eu chamar usuario ou usuario2, os dois vao pegar o mesmo contador devido a ser static
    private static int totalUsuarios; // A classe toda tem apenas esse contador

    public StaticUsuario(String nome) {
        this.nome = nome;
        totalUsuarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Integer getTotalUsuarios() {
        return totalUsuarios;
    }

    public static void main(String[] args) {
        StaticUsuario usuario = new StaticUsuario("Carlos");
        StaticUsuario usuario2 = new StaticUsuario("Ana");
        StaticUsuario usuario3 = new StaticUsuario("Paulo");

        System.out.println("Total de usuários: " + StaticUsuario.getTotalUsuarios());
    }
}
