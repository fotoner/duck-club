package moe.fotone.duckclub.api.event;

import moe.fotone.duckclub.api.event.repositroy.EventRepository;
import moe.fotone.duckclub.domain.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    List<Event> all() {
        return repository.findAll();
    }
}
