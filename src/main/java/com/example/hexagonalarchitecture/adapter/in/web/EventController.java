package com.example.hexagonalarchitecture.adapter.in.web;

import com.example.hexagonalarchitecture.domain.model.Event;
import com.example.hexagonalarchitecture.application.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @PostMapping
    public Event create(@RequestBody Event event) {
        return service.create(event);
    }

    @GetMapping("/{id}")
    public Event get(@PathVariable Long id) {
        return service.get(id).orElseThrow();
    }

    @GetMapping
    public List<Event> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
