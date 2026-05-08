package academy.devdojo.maratonajava.Colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Sobreescrevendo o metodo equals
    // Precisa ser reflexivo: x.equals(x) precisa ser true para tudo o que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) tambem precisam ser true
    // Transtitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // Para x diferente de null, x.equals(null) tem que retornar false
    @Override
    // object se refere ao y que fica dentro do equals
    public boolean equals(Object obj) {
        // this se refere ao x que compara com o object (y)
        if (obj == null) return false;
        if(this == obj) return true; // objetos iguais, claros que eles sao iguais
        if(this.getClass() != obj.getClass()) return false; // Nao sao da mesma classe

        // Agora eu tenho certeza que os dois sao smartphone e not null
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashcode() tem que ser == x.hashcode() (Alex e Alex == hashcode iguais 42)
    // y.hashcode() == x.hashcode() nao necessariamente o equals de y.equals(x) tem que ser true (Dirk e Alex == hashcode 42, porem sao objetos diferentes)
    // se x.equals(y) == false, se o hashcode !=
    // y.hashcode() != x.hashcode() (x.equals(y) devera ser false);
    @Override
    public int hashCode() {
        // hashCode = numero gerado para identificar
        // retorna um numero inteiro
        // ele é perfeito para performance em collections que exige uma alta busca em arrays enormes, facilitando encontrar o objeto em especifico pelo hashcode dele
        // cada objeto possui o proprio hashcode, porem se forem iguais, é necessario verificar se os valores deles sao iguais tambem
        // se nao teremos um hashcode 42 representando alex e dirk, assim fazemos o .equals para saber se os valores sao iguais ou nao
        // Se dois objetos sao iguais, eles retornam o mesmo hashcode
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
