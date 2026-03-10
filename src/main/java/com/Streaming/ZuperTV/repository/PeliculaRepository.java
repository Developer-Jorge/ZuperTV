package com.Streaming.ZuperTV.repository;

import com.Streaming.ZuperTV.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    // Spring ya nos regala el método findById(Long id) por defecto, así que no anotamos nada acá.
}
