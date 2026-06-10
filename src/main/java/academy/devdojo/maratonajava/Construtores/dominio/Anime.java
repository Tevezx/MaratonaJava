package academy.devdojo.maratonajava.Construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private Integer episodios;
    private String genero;
    private String estudio;

    // Construtor = obrigatoriamente colocar um nome
    // É executado antes de qualquer metodo
    public Anime(String nome, String tipo, Integer episodios, String genero){
        // Chama automaticamente o construtor
        this(); // Vai ao construtor que está vazio
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, Integer episodios, String genero, String estudio){
        // Chama automaticamente o construtor
        this(nome, tipo, episodios, genero); // vai ao construtor que tenha esses parametros
        this.estudio = estudio;
    }

    //Sobrecarga de construtores
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public Integer getEpisodios() {
        return this.episodios;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setEstudio(String estudio){
        this.estudio = estudio;
    }

    public String getEstudio(){
        return this.estudio;
    }
}
