package academy.devdojo.maratonajava.ClassesInternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal andando");
    }
}

//class Cachorro extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Cachorro andando");
//    }
//}

public class AnonymousClassesTest01 {
    // Classes que vao existir por um periodo curto e nao pode ser reutilizada em outro lugar

    public static void main(String[] args) {
        // Classe anônima (subClasse de animal), eu quero que nesse caso seja diferente o comportamento do metodo walk
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Cachorro andando");
            }


        };
        animal.walk();
    }
}
