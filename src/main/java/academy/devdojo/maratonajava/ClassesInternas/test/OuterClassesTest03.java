package academy.devdojo.maratonajava.ClassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Carlos";

    // Classe aninhada que consegue pegar os atributos da classe de fora
    static class Nested{
        private String lastName = "Soares";

        // name esta fora enquanto lastname esta dentro
        void print(){
            System.out.println(new OuterClassesTest03().name + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
