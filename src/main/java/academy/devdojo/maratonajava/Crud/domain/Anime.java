package academy.devdojo.maratonajava.Crud.domain;

import academy.devdojo.maratonajava.Jdbc.dominio.Producer;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    Integer id;
    String name;
    Integer episodes;
    Producer producer;
}
