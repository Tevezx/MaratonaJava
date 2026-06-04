package academy.devdojo.maratonajava.Threads.test;

import academy.devdojo.maratonajava.Threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sacar(10);
            if (account.getSaldo() < 0) {
                System.out.println("FERROU");
                ;
            }
        }
    }

    public static void main(String[] args) {
        // Duas threads acessando o mesmo objeto (esse é o problema)
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Carlos");
        Thread t2 = new Thread(threadAccountTest01, "Ana");

        t1.start();
        t2.start();

    }

    // Aqui é a regra de negocio
    // synchronized significa que dois objetos podem acessar o mesmo metodo, pois estarao em sincronia nas acoes realizadas
    // a thread que comeca, ela finaliza ate esgotar aquilo que esta fazendo, depois a outra thread entra em acao
    private void sacar(Integer valor) {
        System.out.println(getThreadName() + " Fora do syncronize");
        synchronized (account) {
            System.out.println(getThreadName() + " Dentro do syncronize");
            if (account.getSaldo() >= valor) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.sacar(valor);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getSaldo());
            } else {
                System.out.println("sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getSaldo());
            }
        }
    }

    // metodo para pegar o thread name (mesma coisa que fazer: thread.currentThread().getName();)
    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
