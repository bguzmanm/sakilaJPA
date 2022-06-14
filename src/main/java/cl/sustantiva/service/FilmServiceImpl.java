package cl.sustantiva.service;

import cl.sustantiva.entity.Film;
import cl.sustantiva.repos.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmRepo fr;

    @Override
    public void create(Film f) {
        fr.save(f);

    }

    @Override
    public List<Film> read() {
        return fr.findAll();
    }

    @Override
    public Film read(int id) {
        return fr.findById(id).orElse(new Film());
    }

    @Override
    public void update(Film f) {
        fr.save(f);
    }

    @Override
    public void delete(int id) {
        fr.delete(fr.getOne(id));
    }
}
