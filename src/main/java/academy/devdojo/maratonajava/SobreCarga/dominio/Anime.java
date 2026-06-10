package academy.devdojo.maratonajava.SobreCarga.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private Integer episodios;
    private String genero;

    // Construtor
    public Anime(){

    }

    public void init(String nome, String tipo, Integer episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga de metodos = metodo com mesmo nome, mas com funções diferentes
    public void init(String nome, String tipo, Integer episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
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

}
