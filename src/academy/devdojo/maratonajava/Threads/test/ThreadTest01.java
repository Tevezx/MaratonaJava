package academy.devdojo.maratonajava.Threads.test;

class ThreadExemplo extends Thread {
    private final char c;

    public ThreadExemplo(char c){
        this.c = c;
    }

    // codigo que vai ser executado pela thread
    @Override
    public void run() {
        // Thread que executa e inicia o programa no java
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

// Forma recomendada para trabalha com threads (usando interface)
class ThreadExemploRunnable implements Runnable{
    private final char c;

    public ThreadExemploRunnable(char c){
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
            // Coloca a Thread para dormir em milisegundos -> estado de runnable
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

// Dois tipos de threads
// Daemon x User
// User tem mais prioridade do que Daemon

public class ThreadTest01 {
    public static void main(String[] args) {
        // Thread pode ser um objeto ou processo

//        ThreadExemplo threadExemplo = new ThreadExemplo('A');
//        ThreadExemplo threadExemplo2 = new ThreadExemplo('B');
//        ThreadExemplo threadExemplo3 = new ThreadExemplo('C');
//        ThreadExemplo threadExemplo4 = new ThreadExemplo('D');
//        ThreadExemplo threadExemplo5 = new ThreadExemplo('E');

        Thread threadExemplo = new Thread(new ThreadExemploRunnable('A'), "Thread 1");
        Thread threadExemplo2 = new Thread(new ThreadExemploRunnable('B'), "Thread 2");
        Thread threadExemplo3 = new Thread(new ThreadExemploRunnable('C'), "Thread 3");
        Thread threadExemplo4 = new Thread(new ThreadExemploRunnable('D'), "Thread 4");
        Thread threadExemplo5 = new Thread(new ThreadExemploRunnable('E'), "Thread 5");

        // Priorizando a execucao da thread 4 (indicando, nao e grantido a prioridade, depende da jvm)
        threadExemplo4.setPriority(Thread.MAX_PRIORITY);

        // a jvm comeca uma nova thread com o .start()
        threadExemplo.start();
        threadExemplo2.start();
        threadExemplo3.start();
        threadExemplo4.start();
        threadExemplo5.start();

        // Threads possuem estados
        // new -> runnable -> running -> dead (criacao, start, rodando (a thread pode parar de rodar e voltar para runnable, walting/blocked), morta)
    }
}
