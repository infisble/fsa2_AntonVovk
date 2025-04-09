package com.example.hexagonalarchitecture.domain.port;

import com.example.hexagonalarchitecture.domain.model.Place;
import java.util.List;
import java.util.Optional;

public interface PlaceRepository {
    Place save(Place place);
    Optional<Place> findById(Long id);
    List<Place> findAll();
    void deleteById(Long id);
}
