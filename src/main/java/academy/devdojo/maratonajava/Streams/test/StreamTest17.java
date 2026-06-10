package academy.devdojo.maratonajava.Streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest17 {
    public static void main(String[] args) {
        // Stream paralell
        // Quantas threads o stream paralell vai usar
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumStreamIterateParallel(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(Long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    // Muito mais devagar
    private static void sumStreamIterate(Long num) {
        System.out.println("Sum sumStreamIterate");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    // Leva tempo pois a forma que estamos trabalhando iterando de 1 em 1 nao é aconselhado
    private static void sumStreamIterateParallel(Long num) {
        System.out.println("Sum sumStreamIterateParallel");
        long init = System.currentTimeMillis();

        // parallel executa com varias threads
        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumLongStreamIterate (Long num) {
        System.out.println("Sum sumLongStreamIterate");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumParallelLongStreamIterate (Long num) {
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
}
