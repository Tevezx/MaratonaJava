package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        //Tem uma capacidade, porem nao é obrigatorio colocar
        TransferQueue<Object> objects = new LinkedTransferQueue<>();

        // Se nao tiver espaco, vai lancar uma exception
        System.out.println(objects.add("Carlos"));

        // Retorna true or false se adicionar ou nao
        System.out.println(objects.offer("Carlos"));

        // Adiciona e espera 10 segundos
        System.out.println(objects.offer("Carlos", 10, TimeUnit.SECONDS));

        // Ele espera até que a lista esteja disponivel para poder inserir
        objects.put("Carlos");

        // Verifico se há alguem esperando
        if(objects.hasWaitingConsumer()){
            // Bloqueia a thread (espera) ate o elemento tentar pegar o que eu coloquei
            objects.transfer("Carlos");
        }

        // Faz a mesma coisa que o de cima, porem nao espera nada, caso alguem apareca retorna true, se nao, retorna false
        System.out.println(objects.tryTransfer("Carlos"));

        // Retorna o primeiro elemento da lista
        System.out.println(objects.element());

        // Remove o primeiro elemento da fila, ou retorna null se nao existir nenhum
        System.out.println(objects.poll());

        // Pega o primeiro valor da fila, se nao existir, ele espera ate que alguem coloque um elemento
        System.out.println(objects.take());
    }
}
