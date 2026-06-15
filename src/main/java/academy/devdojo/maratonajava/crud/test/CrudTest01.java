package academy.devdojo.maratonajava.crud.test;

import academy.devdojo.maratonajava.crud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int operation;
        while (true) {
            producerMenu();
            // Isso serve para identificar o enter como uma operacao
            operation = Integer.parseInt(SCANNER.nextLine());
            if (operation == 0) break;
            ProducerService.buildMenu(operation);
        }
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer of id");
        System.out.println("3. Save Producer");
        System.out.println("4. Update Producer");
        System.out.println("0. Exit");
    }
}
