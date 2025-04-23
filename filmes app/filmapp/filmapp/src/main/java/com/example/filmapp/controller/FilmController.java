package com.example.filmapp.controller;

import com.example.filmapp.model.Film;
import com.example.filmapp.service.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmService service;

    public FilmController(FilmService service) {
        this.service = service;
    }

    @GetMapping
    public List<Film> getAll() {
        return service.getAllFilms();
    }

    @PostMapping
    public Film add(@RequestBody Film film) {
        return service.addFilm(film);
    }
}
