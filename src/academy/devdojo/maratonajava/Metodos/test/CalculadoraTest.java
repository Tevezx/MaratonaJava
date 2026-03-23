package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros(10, 20);
        calculadora.multiplicaDoisNUmeros(10,20);

        // Por ser um metodo com return, precisamos do sout, pois se nao, nao ha nada para exibir
        System.out.println(calculadora.dividirDoisNumeros(20.0,2.0));

        Integer num1 = 85;
        Integer num2 = 90;

        System.out.println("-".repeat(10));
        System.out.println("Dentro do calculadoraTest");
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        Integer[] numeros = {1,2,3,4,5};
        calculadora.somarNumeros(numeros);
        // VarArgs
        calculadora.somarVarArgs(1,2,3,4,5);
    }
}
