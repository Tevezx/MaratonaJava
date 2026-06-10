package academy.devdojo.maratonajava.Dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Não é mais tanto utilizada (Mais em sistemas legados)

        Date date = new Date(1_000_000_000); // Long (1_000_000_000)
        // que representa o tempo em milisegundos (desde 1 de janeiro de 1970)
        // date. (se aparecer opcoes com uma linha no meio,
        // significa que essa opcao provavelmente sera removida na prixma versao do java)

        // Data
        System.out.println(date);

        //Long que representa a data passada no objeto
        System.out.println(date.getTime());

        System.out.println();
    }
}
