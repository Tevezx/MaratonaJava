package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

// classe imutavel
final class Anime {
    private final String name;

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> lista = new CopyOnWriteArrayList<>();
        // [1] // lista.add(1);
        // [1, 2] // ele cria uma nova lista com o novo valor
        // [1, 2, 3]

        for (int i = 0; i < 2000; i++) {
            lista.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = lista.iterator();
            try {
                TimeUnit.SECONDS.sleep(2000);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                lista.remove(i);
                System.out.printf("%s Removed %d \n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
