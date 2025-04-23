package com.filmapp;

import com.example.filmapp.service.FilmService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilmServiceTests {

    @Test
    void testAddFilm() {
        FilmService filmService = new FilmService();
        Film film = new Film(null, "Inception", 2010);
        Film savedFilm = filmService.addFilm(film);
        assertNotNull(savedFilm.getId());
        assertEquals("Inception", savedFilm.getTitle());
    }
}
