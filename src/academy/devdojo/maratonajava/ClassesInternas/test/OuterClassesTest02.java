package academy.devdojo.maratonajava.ClassesInternas.test;

public class OuterClassesTest02 {
    private String name = "Carlos";

    // Classe aninhada = Classe dentro do metodo
    void print(String param){
        // final (Dentro do metodo, eu nao altero a variavel) ela é efenitivamente final
        String lastName = "Soares";

        // abstract ou final
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + lastName);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print("OI");
    }
}
