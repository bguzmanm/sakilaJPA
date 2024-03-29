package cl.sustantiva.service;

import cl.sustantiva.entity.Film;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {

    public void create(Film f);
    public List<Film> read();
    public Film read(int id);
    public void update(Film f);

    public void update(int film_id, String title, String description, int release_year, String rating);

    public void delete(int id);

}
