package cl.sustantiva.controllers;

import cl.sustantiva.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/actors")
public class ActorController {

    @Autowired
    ActorService as;

    @GetMapping
    public String getActor(Model model){
        model.addAttribute("actores", as.read());
        return "actores";
    }

}
