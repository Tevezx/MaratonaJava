package academy.devdojo.maratonajava.Serialization.test;

import academy.devdojo.maratonajava.Serialization.dominio.Aluno;
import academy.devdojo.maratonajava.Serialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("1001", "Carlos", "Carlos123");
        Turma turma = new Turma("Maratona Java Virado no Jiraya");
        // Turma nao esta sendo esterializado, o que esta sendo é a string dela
        aluno.setTurma(turma);

        serializar(aluno);
        deserializar();
    }

    // Transformando um objeto em um array de bytes
    // Quando trabalhamos com baixo nivel, normalmente trabalhamos com stream
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(aluno);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
