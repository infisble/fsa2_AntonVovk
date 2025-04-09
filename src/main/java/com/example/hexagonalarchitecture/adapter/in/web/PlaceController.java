package com.example.hexagonalarchitecture.adapter.in.web;

import com.example.hexagonalarchitecture.domain.model.Place;
import com.example.hexagonalarchitecture.application.service.PlaceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlaceController {

    private final PlaceService service;

    public PlaceController(PlaceService service) {
        this.service = service;
    }

    @PostMapping
    public Place create(@RequestBody Place place) {
        return service.create(place);
    }

    @GetMapping("/{id}")
    public Place get(@PathVariable Long id) {
        return service.get(id).orElseThrow();
    }

    @GetMapping
    public List<Place> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
