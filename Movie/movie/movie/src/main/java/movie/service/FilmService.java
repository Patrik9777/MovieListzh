package movie.service;

import movie.model.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    private final List<Film> films = new ArrayList<>();

    public List<Film> getAllFilms() {
        return films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }
}
