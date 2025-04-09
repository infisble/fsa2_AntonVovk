package com.example.hexagonalarchitecture.domain.port;

import com.example.hexagonalarchitecture.domain.model.Event;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    Event save(Event event);
    Optional<Event> findById(Long id);
    List<Event> findAll();
    void deleteById(Long id);
}
