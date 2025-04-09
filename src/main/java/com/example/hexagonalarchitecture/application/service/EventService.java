package com.example.hexagonalarchitecture.application.service;

import com.example.hexagonalarchitecture.domain.model.Event;
import com.example.hexagonalarchitecture.domain.port.EventRepository;
import java.util.List;
import java.util.Optional;

public class EventService {
    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public Event create(Event event) {
        return repository.save(event);
    }

    public Optional<Event> get(Long id) {
        return repository.findById(id);
    }

    public List<Event> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
