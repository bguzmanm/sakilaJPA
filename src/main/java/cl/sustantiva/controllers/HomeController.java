package cl.sustantiva.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    // Constantes
    // -----------------------------------------------------------------------------------------


    // Solicitudes GET
    // -----------------------------------------------------------------------------------------

    /**
     * Muestra la Página de Inicio
     *
     * @param nombre  nombre de la persona (opcional)
     * @param request objeto {@link HttpServletRequest} que contiene la información
     *                de la solicitud que le hace el cliente al {@link HttpServlet}
     * @param modelo  objeto {@link Model} con el modelo de la vista
     *
     * @return un objeto {@link String} con la respuesta a la solicitud
     */
    @GetMapping(path = { "/", "/{nombre}" })
    public String paginaInicio(@PathVariable Optional<String> nombre, HttpServletRequest request, Model modelo) {

        // Mostrar página
        return "index";
    }

}
