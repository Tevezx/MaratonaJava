package academy.devdojo.maratonajava.Jdbc.dominio;

import lombok.Builder;
import lombok.Value;

// Essas anotações são graças ao lombok que possibilita a criação através de anotações
@Value

// Cria builder inteiro (com get, construtor, tostring)
@Builder
public class Producer {
    // Por ter @Value ela se torna imultavel = todos atributos privados, finais e apenas get
    Integer id;
    String name;
}
