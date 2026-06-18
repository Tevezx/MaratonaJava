package academy.devdojo.maratonajava.Crud.service;

import academy.devdojo.maratonajava.Crud.domain.Producer;
import academy.devdojo.maratonajava.Crud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(Integer operacao) {
        // Utilizando ehanced switchs
        switch (operacao) {
            case 0 -> System.out.println("Leaving...");
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
        } else {
            throw new IllegalArgumentException("Invalid option");
        }
    }

    private static void save() {
        System.out.println("Enter the producer's name:");
        String name = SCANNER.nextLine();

        if (name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be null or empty");
        }

        System.out.println("Saving producer in the databases...");
        ProducerRepository.save(name);
    }

    private static void update() {
        System.out.println("Enter the ID you wish to update:");
        int id = Integer.parseInt(SCANNER.nextLine());

        if (id < 0) throw new IllegalArgumentException("Id must be greater than zero");


        System.out.println("Enter new name:");
        String name = SCANNER.nextLine();

        if (name.isEmpty()) throw new IllegalArgumentException("The name cannot be null or empty");


        Producer producer = Producer
                .builder()
                .id(id)
                .name(name)
                .build();

        ProducerRepository.update(producer);
    }
}
