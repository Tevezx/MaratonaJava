package academy.devdojo.maratonajava.Interfaces.dominio;

public interface DataLoader {
    // Todos os atributos sao constantes
    public final static Integer MAX_DATA_SIZ = 10;

    // Todos os metodos sao public e abstract
    public abstract void load();

    // Se eu tenho dois metodos abstratos, as classes que pegam precisam ter os dois metodos tambem
    // Por isso existe o default
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
