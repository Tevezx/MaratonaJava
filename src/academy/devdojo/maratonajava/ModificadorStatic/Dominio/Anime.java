package academy.devdojo.maratonajava.ModificadorStatic.Dominio;

public class Anime {
    // 0 - Bloco de inicializacao é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em mémoria para o objeto
    // 2 - Cada atributo de classe sao criados
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado

    private String nome;

    //Episodios pertence ao Anime
    private static Integer[] episodios;

    // Executado apenas uma vez se for static
    static {
        // Bloco de inicilaizacao (executado antes dos metodos)
        // Executado antes de qualquer coisa

        System.out.println("Dentro do bloco de inicialização");
        episodios = new Integer[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        for (Integer episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Integer[] getEpisodios() {
        return episodios;
    }
}
