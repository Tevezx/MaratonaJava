package academy.devdojo.maratonajava.Concorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    // Trabalhar com agendamentos de tarefas
    private static final ScheduledExecutorService scheduledThreadPoolExecutor = Executors.newScheduledThreadPool(1);

    private static void beeper() {
        Runnable r = () -> {
            System.out.printf(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " - beep\n");
            // Se colocar para dormir por um determinado tempo, ele soma esse tempo com o delay que colocamos la embaixo
            // Mas se for o fixedRate ele executa o delay depois de dormir imediatamente quando acorda
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        // quero executar o beep a cada 5 segundos
        // scheduledThreadPoolExecutor.schedule(r, 5, TimeUnit.SECONDS);

        // Executa uma vez, depois de 5 segundos continua a executar uma vez
        // ScheduledFuture<?> scheduledFuture = scheduledThreadPoolExecutor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture = scheduledThreadPoolExecutor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
        // Executa igual ao de cima, porem depois de 10s no ar ele para o codigo
        scheduledThreadPoolExecutor.schedule(() -> {
            System.out.println("Cancelando o scheduledWithTimeDelay");
            scheduledFuture.cancel(false);
            scheduledThreadPoolExecutor.shutdown();
        }, 10, TimeUnit.SECONDS);

        // Finalizo o processo
        // scheduledThreadPoolExecutor.shutdown();
    }

    public static void main(String[] args) {
        beeper();
    }
}
