package com.biel.clickbus.dtos;

import java.time.LocalDateTime;

public record PlaceDTO(String name, String slug, String city, String state, LocalDateTime created_at, LocalDateTime updated_at) {
}
