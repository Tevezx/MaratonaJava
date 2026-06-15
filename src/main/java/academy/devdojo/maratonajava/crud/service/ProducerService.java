package academy.devdojo.maratonajava.crud.service;

import academy.devdojo.maratonajava.crud.domain.Producer;
import academy.devdojo.maratonajava.crud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(Integer operacao) {
        // Utilizando ehanced switchs
        switch (operacao) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Argument Ilegal, not valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all:");
        String name = SCANNER.nextLine();

        // Utilizando programacao funcional
        ProducerRepository.findByName(name).forEach(p -> System.out.printf("ID: [%d] | %s\n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type one of the ids below to delete:");
        int id = Integer.parseInt(SCANNER.nextLine());

        // Tendo certeza que é aquele id que ela quer deletar
        System.out.println("Are you sure? S/N:");
        String choice = SCANNER.nextLine();

        // Verificando se a pessoa digitou S ou N
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.remove(id);
        }
    }

    private static void save() {
        System.out.println("Enter the producer's name:");
        String name = SCANNER.nextLine();

        System.out.println("Saving producer in the databases...");
        ProducerRepository.save(name);
    }

    private static void update() {
        System.out.println("Enter the ID you wish to update:");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Enter new name:");
        String name = SCANNER.nextLine();

        Producer producer = Producer
                .builder()
                .id(id)
                .name(name)
                .build();

        ProducerRepository.update(producer);
    }
}
