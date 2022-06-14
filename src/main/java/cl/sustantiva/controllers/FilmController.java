package cl.sustantiva.controllers;

import cl.sustantiva.entity.Film;
import cl.sustantiva.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

}
