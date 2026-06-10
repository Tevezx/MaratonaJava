package academy.devdojo.maratonajava.Metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(Integer num1, Integer num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNUmeros(Integer num1, Integer num2) {
        System.out.println(num1 * num2);
    }

    public Double dividirDoisNumeros(Double num1, Double num2) {
        return num1 / num2;
    }

    public void alteraDoisNumeros(Integer num1, Integer num2) {
        num1 = 90;
        num2 = 91;
        System.out.println("Numero 1:" + num1);
        System.out.println("Numero 2:" + num2);
    }

    public void somarNumeros(Integer[] numeros) {
        Integer soma = 0;
        for (Integer num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros é: " + soma);
    }

    // Integer... posso colocar os numeros dentro do parametro na hora da chamada
    // Precisa ser o ultimo atributo do parametro
    public void somarVarArgs(Integer... numeros) {
        Integer soma = 0;
        for (Integer num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}
