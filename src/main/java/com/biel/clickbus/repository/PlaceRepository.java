package com.biel.clickbus.repository;

import com.biel.clickbus.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Integer>{
    //return a list of places that have a name similar to the one passed as parameter
    List<Place> findByNameLikeIgnoreCase(String name);
    //return a list of places that have a city similar to the one passed as parameter
    List<Place> findByCityIgnoreCase(String city);
    //return a list of places that have a state similar to the one passed as parameter
    List<Place> findByStateIgnoreCase(String state);

}
