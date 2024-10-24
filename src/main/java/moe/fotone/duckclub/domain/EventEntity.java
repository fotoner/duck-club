package moe.fotone.duckclub.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EventEntity {

    @Id
    private Long id;
}
