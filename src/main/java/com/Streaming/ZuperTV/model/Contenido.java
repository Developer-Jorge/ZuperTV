package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "contenido")
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContenido;

    private String titulo;
    private String descripcion;
    private String urlPoster;
    private String tipo; // "PELICULA" o "SERIE"

    // Relación de 1 a 1 con Película
    @OneToOne(mappedBy = "contenido", cascade = CascadeType.ALL)
    private Pelicula pelicula;

    // Relación de 1 a N con Temporada
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL)
    private List<Temporada> temporadas;

    // Relación N a M con Género (Mapea tu tabla ContenidoXGenero)
    @ManyToMany
    @JoinTable(
        name = "contenido_x_genero",
        joinColumns = @JoinColumn(name = "id_contenido"),
        inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private List<Genero> generos;
}
