package moe.fotone.duckclub.api.event.repositroy;

import moe.fotone.duckclub.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}