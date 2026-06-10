package academy.devdojo.maratonajava.Jdbc.service;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import academy.devdojo.maratonajava.Jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    // Camada a mais do repository
    // Esse tipo de projeto é chamado de MVC (Model View Controller)

    // O service seria um controller
    // O model seria o producer
    // A view seria o repository

    // Apenas uma camada a mais
    // Caso seja feito uma atualizacao no repository, eu nao preciso alterar nada aqui
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void remove(Integer id){
        requireValidId(id);

        ProducerRepository.remove(id);
    }

    public static void update(Producer producer){
        requireValidId(producer.getId());

        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static void requireValidId(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value of id!");
        }
    }
}
