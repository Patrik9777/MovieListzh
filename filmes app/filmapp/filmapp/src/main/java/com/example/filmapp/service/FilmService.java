package com.example.filmapp.service;

import com.example.filmapp.model.Film;
import com.example.filmapp.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }

    public List<Film> getAllFilms() {
        return repository.findAll();
    }

    public Film addFilm(Film film) {
        return repository.save(film);
    }
}
