package academy.devdojo.maratonajava.Polimorfismo.dominio;

public interface Taxavel {
    // Taxavel em si nao utiliza o metodo, por isso é abstract e public para que todos consigam utilizar
    public abstract Double calcularImposto();
}
