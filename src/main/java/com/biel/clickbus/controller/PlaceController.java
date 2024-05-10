package com.biel.clickbus.controller;

import com.biel.clickbus.dtos.PlaceDTO;
import com.biel.clickbus.repository.PlaceRepository;
import com.biel.clickbus.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {
    @Autowired
    private PlaceService service;

    //return all places
    @GetMapping
    public ResponseEntity<List<PlaceDTO>> findAllPlaces() {
        return ResponseEntity.ok(service.findAllPlaces());
    }

    //create a new place
    @PostMapping
    public ResponseEntity<PlaceDTO> create(@RequestBody PlaceDTO place) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPlace(place));
    }

    //update a place
    @PutMapping("/{id}")
    public ResponseEntity<PlaceDTO> update(@PathVariable Integer id, @RequestBody PlaceDTO place) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updatePlace(id, place));
    }

    //delete a place
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        service.deletePlace(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    //return a specific place
    @GetMapping("/{id}")
    public ResponseEntity<PlaceDTO> getSpecificPlace(@PathVariable Integer id){
        return ResponseEntity.ok(service.getSpecificPlace(id));
    }

    //search for a place by name
    @GetMapping("/search/{name}")
    public ResponseEntity<List<PlaceDTO>> findByNameLike(@PathVariable String name){
        return ResponseEntity.ok(service.findByNameLike(name));
    }


}
