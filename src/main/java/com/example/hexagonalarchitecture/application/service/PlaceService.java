package com.example.hexagonalarchitecture.application.service;

import com.example.hexagonalarchitecture.domain.model.Place;
import com.example.hexagonalarchitecture.domain.port.PlaceRepository;
import java.util.List;
import java.util.Optional;

public class PlaceService {
    private final PlaceRepository repository;

    public PlaceService(PlaceRepository repository) {
        this.repository = repository;
    }

    public Place create(Place place) {
        return repository.save(place);
    }

    public Optional<Place> get(Long id) {
        return repository.findById(id);
    }

    public List<Place> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
