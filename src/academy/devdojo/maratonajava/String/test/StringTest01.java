package academy.devdojo.maratonajava.String.test;

public class StringTest01 {

    public static void main(String[] args) {
        // São imutaveis
        String nome = "Carlos"; // String constant pool
        String nome2 = "Carlos";

        //Nao posso trocar o valor que ja existe
        nome = nome.concat(" Tevez"); // nome += " Tevez"
        nome.concat(" Tevez");
        System.out.println(nome);

        // Estou criando um novo objeto
        String nome3 = new String("Carlos"); // 1 - variavel de referencia, 2 - objetos do tipo string, 3 - uma string no pool string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        // Comparando a referencia do objeto em memoria (Carlos)
        System.out.println(nome == nome2);
    }

}
