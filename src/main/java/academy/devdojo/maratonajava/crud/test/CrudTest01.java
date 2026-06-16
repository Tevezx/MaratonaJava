package academy.devdojo.maratonajava.crud.test;

import academy.devdojo.maratonajava.crud.service.AnimeService;
import academy.devdojo.maratonajava.crud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int operation = Integer.parseInt(SCANNER.nextLine());

            switch (operation) {
                case 0 -> {
                    System.out.println("Leaving...");
                    return;
                }
                case 1 -> {
                    while (true) {
                        menuProducer();
                        int producerOperation = Integer.parseInt(SCANNER.nextLine());

                        if (producerOperation == 0) return;
                        if (producerOperation == 5) break;

                        ProducerService.buildMenu(producerOperation);
                    }
                }
                case 2 -> {
                    menuAnime();
                    int animeOperation = Integer.parseInt(SCANNER.nextLine());

                    if (animeOperation == 0) return;
                    if (animeOperation == 5) break;

                    AnimeService.buildMenu(operation);
                }
                default -> throw new IllegalArgumentException("Invalid option");
            }
        }
    }

    public static void menu() {
        System.out.println("Type the option of your operation");
        System.out.println("1. Menu Producer");
        System.out.println("2. Menu Anime");
        System.out.println("0. Exit");
    }

    public static void menuProducer() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer of id");
        System.out.println("3. Save Producer");
        System.out.println("4. Update Producer");
        System.out.println("5. Back to menu");
        System.out.println("0. Exit");
    }

    public static void menuAnime() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for Anime");
        System.out.println("2. Delete anime of id");
        System.out.println("3. Save Anime");
        System.out.println("4. Update Anime");
        System.out.println("5. Back to menu");
        System.out.println("0. Exit");
    }
}
