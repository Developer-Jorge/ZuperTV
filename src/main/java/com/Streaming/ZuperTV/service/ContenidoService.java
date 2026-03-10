package com.Streaming.ZuperTV.service;

import org.springframework.stereotype.Service;
import java.util.List;

// Las dos líneas vitales
import com.Streaming.ZuperTV.model.Contenido;
import com.Streaming.ZuperTV.repository.ContenidoRepository;

@Service
public class ContenidoService {

    private final ContenidoRepository contenidoRepository;

    public ContenidoService(ContenidoRepository contenidoRepository) {
        this.contenidoRepository = contenidoRepository;
    }

    public List<Contenido> obtenerTodasLasPeliculas() {
        return contenidoRepository.findByTipo("PELICULA");
    }
}
