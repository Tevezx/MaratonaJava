package academy.devdojo.maratonajava.Colecoes.test;

import academy.devdojo.maratonajava.Colecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        // Primeira pessoa a entrar é a primeira a ser atendida
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        // A ordem alfabetica
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
