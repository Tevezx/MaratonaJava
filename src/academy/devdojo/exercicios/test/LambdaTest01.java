package academy.devdojo.exercicios.test;

import academy.devdojo.exercicios.enums.Operacao;

public class LambdaTest01 {
    public static void main(String[] args) {
        System.out.println("Soma: " + Operacao.SOMA.executar(20.0, 10.0));
        System.out.println("Subtração: " + Operacao.SUB.executar(20.0, 10.0));
        System.out.println("Multiplicação: " + Operacao.MULT.executar(2.0, 10.0));
        System.out.println("Divisão: " + Operacao.DIV.executar(20.0, 10.0));
    }
}
