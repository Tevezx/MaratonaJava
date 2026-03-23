package academy.devdojo.maratonajava.BloboInicializacao.Dominio;

public class Anime {
    private String nome;
    private Integer[] episodios;

    {
        // Bloco de inicilaizacao (executado antes dos metodos)
        // Executado antes de qualquer coisa

        System.out.println("Dentro do bloco de inicialização");
        episodios = new Integer[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        for (Integer episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Integer[] getEpisodios() {
        return episodios;
    }
}
