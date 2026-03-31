package academy.devdojo.maratonajava.Interfaces.dominio;

// Implementando o dataloader
public class DataBaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Cheking permissões no banco de dados");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
