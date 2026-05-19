package academy.devdojo.maratonajava.ClassesInternas.test;

// Classe de fora
public class OuterClassesTest01 {
    private String name = "Carlos";

    // Classe de dentro
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();

        inner.printOuterClassAttribute();
    }
}
