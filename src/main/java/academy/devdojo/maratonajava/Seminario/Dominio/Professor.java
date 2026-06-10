package academy.devdojo.maratonajava.Seminario.Dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("-".repeat(5));
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (this.seminario == null) {
            return;
        }

        for (Seminario seminarios : seminario) {
            System.out.println("Seminarios: " + seminarios.getTitulo());
            System.out.println("Local: " + seminarios.getLocal().getEndereco());
            for (Aluno aluno : seminarios.getAluno()) {
                System.out.println("Alunos: " + aluno.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
