package academy.devdojo.maratonajava.Metodos.dominio;

public class Professor {
    public String nome;
    public Integer idade;
    public Character sexo;

    public void imprimir(){
        // Quando quero referenciar um atributo dentro do meu objeto = this
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
