package academy.devdojo.maratonajava.crud.domain;

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
