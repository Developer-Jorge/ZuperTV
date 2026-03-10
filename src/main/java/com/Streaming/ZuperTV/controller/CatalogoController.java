

package com.Streaming.ZuperTV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Streaming.ZuperTV.service.ContenidoService;
import com.Streaming.ZuperTV.repository.PeliculaRepository;
import com.Streaming.ZuperTV.model.Pelicula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Tus importaciones de ZuperTV
import com.Streaming.ZuperTV.service.ContenidoService;
import com.Streaming.ZuperTV.repository.PeliculaRepository;
import com.Streaming.ZuperTV.model.Pelicula;

@Controller
public class CatalogoController {

    private final ContenidoService contenidoService;
    private final PeliculaRepository peliculaRepository; // Agregamos esto

    // Actualizamos el constructor
    public CatalogoController(ContenidoService contenidoService, PeliculaRepository peliculaRepository) {
        this.contenidoService = contenidoService;
        this.peliculaRepository = peliculaRepository;
    }

    @GetMapping("/catalogo")
    public String mostrarCatalogo(Model model) {
        var peliculas = contenidoService.obtenerTodasLasPeliculas();
        model.addAttribute("listaDePeliculas", peliculas);
        return "catalogo";
    }

    // --- NUEVA RUTA PARA EL REPRODUCTOR ---
    @GetMapping("/pelicula/{id}")
    public String verPelicula(@PathVariable Long id, Model model) {
        // Buscamos la película por su ID (orElse(null) es por si no la encuentra)
        Pelicula pelicula = peliculaRepository.findById(id).orElse(null);
        
        // La mandamos a la vista
        model.addAttribute("pelicula", pelicula);
        
        return "reproductor"; // Ahora creamos este HTML
    }
}
