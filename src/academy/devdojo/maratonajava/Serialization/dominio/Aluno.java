package academy.devdojo.maratonajava.Serialization.dominio;

import java.io.*;
import java.util.StringJoiner;

// implements Serializable = aluno é serializado
public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 1846070656295460936L;

    private final String id;
    private String nome;

    // Esse atributo nao sera serializado
    private final transient String password;

    private static final String NOME_ESCOLA = "DevDojo";
    private transient Turma turma;

    public Aluno(String id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream){
        try{
            objectOutputStream.defaultWriteObject();
            // Escrevendo todos os atributos da classe turma
            objectOutputStream.writeUTF(turma.getNome());
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream){
        try{
            objectInputStream.defaultReadObject();

            // Aqui eu esterializo a string do nome da turma
            String nomeTurma = objectInputStream.readUTF();
            turma = new Turma(nomeTurma);

        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Aluno.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("nome='" + nome + "'")
                .add("password='" + password + "'")
                .add("turma=" + turma)
                .add("NomeEscola=" + NOME_ESCOLA)
                .toString();
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
