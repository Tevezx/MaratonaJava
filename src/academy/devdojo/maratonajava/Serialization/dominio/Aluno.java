package academy.devdojo.maratonajava.Serialization.dominio;

import java.io.Serializable;

// implements Serializable = aluno é serializado
public class Aluno implements Serializable {
    private String id;
    private String nome;
    private String password;

    public Aluno(String id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return """
                Aluno{
                    id='$id',
                    nome='$nome',
                    password='$password'
                }""";
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }
}
