package moe.fotone.duckclub.api.event.service;

import moe.fotone.duckclub.api.event.repositroy.EventRepository;
import moe.fotone.duckclub.domain.Event;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event>  getAllEvent() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }


    public void deleteEvent(Long id) {
    }
}
