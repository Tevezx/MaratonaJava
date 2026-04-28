package academy.devdojo.maratonajava.String.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000); // COnsigo separar o numero ao inves de usar "." usa-se "_"
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + " ms");

    }

    // Acesso normal
    private static void concatString(Integer tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    // Acesso a muitas Strings
    private static void concatStringBuilder(Integer tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // Acesso de multiplas threads em milisegundos (varias pessoas acessando o mesmo recurso
    private static void concatStringBuffer(Integer tamanho){
        StringBuffer bf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            bf.append(i);
        }
    }
}
