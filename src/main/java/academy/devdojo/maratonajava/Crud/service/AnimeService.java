package academy.devdojo.maratonajava.Crud.service;

import academy.devdojo.maratonajava.Crud.domain.Anime;
import academy.devdojo.maratonajava.Crud.repository.AnimeRepository;

import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(Integer operacao) {
        switch (operacao) {
            case 0 -> System.out.println("leaving...");
            case 1 -> findByName();
            case 2 -> remove();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Argument Ilegal, not valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all:");
        String name = SCANNER.nextLine();

        AnimeRepository.findByName(name).forEach(a -> System.out.printf("ID: [%d] | %s\n", a.getId(), a.getName()));
    }

    private static void remove() {
        System.out.println("Type one of the ids below to delete:");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Are you sure? S/N:");
        String choice = SCANNER.nextLine();

        if ("s".equalsIgnoreCase(choice)) {
            AnimeRepository.remove(id);
        } else {
            throw new IllegalArgumentException("Invalid option");
        }
    }

    private static void save() {
        System.out.println("Enter the anime's name:");
        String name = SCANNER.nextLine();
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name to producer");

        System.out.println("Enter the id to producer:");
        int idProducer = Integer.parseInt(SCANNER.nextLine());
        if (idProducer < 0) throw new IllegalArgumentException("Id producer invalid");

        System.out.println("Enter to number of episodies:");
        int episodies = Integer.parseInt(SCANNER.nextLine());
        if (episodies <= 0) throw new IllegalArgumentException("Number of episodies invalid");

        AnimeRepository.save(idProducer, name, episodies);
    }

    private static void update() {
        System.out.println("Enter the ID you wish to update:");
        int id = Integer.parseInt(SCANNER.nextLine());

        if (id < 0) throw new IllegalArgumentException("Id must be greater than zero");

        System.out.println("Enter new name:");
        String name = SCANNER.nextLine();

        if (name.isEmpty()) throw new IllegalArgumentException("The name cannot be null or empty");

        Anime anime = Anime.
                builder()
                .id(id)
                .name(name)
                .build();

        AnimeRepository.update(anime);
    }
}
