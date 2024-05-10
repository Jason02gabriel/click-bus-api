package com.biel.clickbus.model;

import com.biel.clickbus.dtos.PlaceDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "places")

public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String slug;
    private String city;
    private String state;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Place(PlaceDTO placeData) {
        this.name = placeData.name();
        this.slug = name.toLowerCase().replace(" ", "-");
        this.city = placeData.city();
        this.state = placeData.state();
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();

    }
}
