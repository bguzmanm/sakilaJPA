package cl.sustantiva.controllers;

import cl.sustantiva.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/films")
public class FilmController {


    @Autowired
    FilmService fs;

    @GetMapping
    public String getFilms(Model model){
        model.addAttribute("films", fs.read());
        return "listadoPeliculas";
    }

    @GetMapping(value = "/edit/{id}")
    public String editFilms(@PathVariable("id") int id, Model model){

        model.addAttribute("pelicula", fs.read(id));
        return "pelicula";

    }

    @PostMapping(value="/edit/")
    public String editFilms(@RequestParam("film_id") int film_id,
                            @RequestParam("title") String title,
                            @RequestParam("description") String description,
                            @RequestParam("release_year") int release_year,
                            @RequestParam("rating") String rating){

        fs.update(film_id,title, description, release_year, rating);
        return "redirect:/films";

    }

}
