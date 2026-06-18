package academy.devdojo.maratonajava.Crud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
