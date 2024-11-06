package moe.fotone.duckclub.api.event.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class EventDto {
    private final Long id;
    private final String title;
}
