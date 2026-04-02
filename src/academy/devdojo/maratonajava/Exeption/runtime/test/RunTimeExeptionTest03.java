package academy.devdojo.maratonajava.Exeption.runtime.test;

public class RunTimeExeptionTest03 {
    public static void main(String[] args) {
        openConecction();
    }

    public static String openConecction() {
        try {
            System.out.println("Abrindo Arquivo...");
            throw new RuntimeException();
            //System.out.println("Escrevendo Dados no Arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Bloco de código sempre executado independente de qualquer coisa
            // Normalmente usado quando preciso finalizar a operação
            System.out.println("Fechando Arquivo...");
        }
        return null;
    }
}
