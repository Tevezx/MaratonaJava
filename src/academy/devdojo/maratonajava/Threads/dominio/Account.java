package academy.devdojo.maratonajava.Threads.dominio;

public class Account {
    private Integer saldo = 50;

    public void sacar(Integer valor){
        this.saldo = this.saldo - valor;
    }

    public Integer getSaldo() {
        return saldo;
    }
}
