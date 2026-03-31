package academy.devdojo.maratonajava.Exeption.error.test;

public class StackOverFlowTest {
    public static void main(String[] args) {
        // Estou estourando a memoria disponivel para a stack do java
        recursividade();
        // Isso é chamado de Error no java
        // Ele foi lançado
    }

    public static void recursividade(){
        recursividade();
    }
}
