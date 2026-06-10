package academy.devdojo.maratonajava.Threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public void add(String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        // os metodos para acesso nessa classe sao sincronizados
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Carlos");

        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
