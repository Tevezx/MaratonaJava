package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// O objetivo é ter o controle da leitura e escrita da thread
class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s Obteve o Write Lock:\n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(reentrantReadWriteLock);

        Runnable write = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (reentrantReadWriteLock.isWriteLocked()) {
                System.out.println("Write Locked!");
            }
            reentrantReadWriteLock.readLock().lock();
            System.out.println("Finally i goit");

            try {
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            }finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        };

        Thread thread = new Thread(write);
        Thread thread1 = new Thread(reader);
        Thread thread2 = new Thread(reader);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
