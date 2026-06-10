package academy.devdojo.maratonajava.Threads.test;

// Forma recomendada para trabalha com threads (usando interface)
class ThreadExemploRunnable2 implements Runnable{
    private final String c;

    public ThreadExemploRunnable2(String c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}

// Dois tipos de threads
// Daemon x User
// User tem mais prioridade do que Daemon

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        // yield -> peço a jvm dar uma pausa

        Thread t1 = new Thread(new ThreadExemploRunnable2("Carlos"));
        Thread t2 = new Thread(new ThreadExemploRunnable2("Tevez"));

        t1.start();
        // main nao pode prosseguir enquanto t1 nao finalizar
        t1.join();

        t2.start();

        Thread t3 = new Thread(new ThreadExemploRunnable2("Rosseto"));
        Thread t4 = new Thread(new ThreadExemploRunnable2("Soares"));
    }
}
