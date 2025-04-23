package com.example.filmapp.repository;

import com.example.filmapp.model.Film;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmRepository {
    private List<Film> films = new ArrayList<>();

    public List<Film> findAll() {
        return films;
    }

    public Film save(Film film) {
        film.setId((long) (films.size() + 1));
        films.add(film);
        return film;
    }
}
