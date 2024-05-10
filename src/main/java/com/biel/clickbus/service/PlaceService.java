package com.biel.clickbus.service;

import com.biel.clickbus.dtos.PlaceDTO;
import com.biel.clickbus.model.Place;
import com.biel.clickbus.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public List<PlaceDTO> findAllPlaces() {
        List<Place> Places = placeRepository.findAll();
        List<PlaceDTO> PlacesDTO = new ArrayList<>();
        for (Place place : Places) {
            PlacesDTO.add(new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at()));
        }
        return PlacesDTO;
    }

    public PlaceDTO createPlace(PlaceDTO placeDTO) {
        Place place = new Place(placeDTO);
        placeRepository.save(place);
        return new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at());
    }

    public PlaceDTO updatePlace(Integer id, PlaceDTO placeDTO) {
        Place place = placeRepository.findById(id).orElseThrow();
        place.setName(placeDTO.name());
        place.setSlug(place.getName().toLowerCase().replace(" ", "-"));
        place.setCity(placeDTO.city());
        place.setState(placeDTO.state());
        place.setUpdated_at(LocalDateTime.now());
        placeRepository.save(place);
        return new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at());
    }

    public void deletePlace(Integer id) {
        if (!placeRepository.existsById(id)) throw new NoSuchElementException();
        placeRepository.deleteById(id);
    }
    public PlaceDTO getSpecificPlace(Integer id){
        Place place = placeRepository.findById(id).orElseThrow();
        return new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at());
    }

    public List<PlaceDTO> findByNameLike(String name){
        List<Place> Places = placeRepository.findByNameLikeIgnoreCase("%"+name+"%");
        List<PlaceDTO> PlacesDTO = new ArrayList<>();
        for (Place place : Places) {
            PlacesDTO.add(new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at()));
        }
        return PlacesDTO;
    }

    public List<PlaceDTO> findByCity(String city){
        List<Place> Places = placeRepository.findByCityIgnoreCase(city);
        List<PlaceDTO> PlacesDTO = new ArrayList<>();
        for (Place place : Places) {
            PlacesDTO.add(new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at()));
        }
        return PlacesDTO;
    }

    public List<PlaceDTO> findByState(String state){
        List<Place> Places = placeRepository.findByStateIgnoreCase(state);
        List<PlaceDTO> PlacesDTO = new ArrayList<>();
        for (Place place : Places) {
            PlacesDTO.add(new PlaceDTO(place.getName(), place.getSlug(), place.getCity(), place.getState(), place.getCreated_at(), place.getUpdated_at()));
        }
        return PlacesDTO;
    }
}
