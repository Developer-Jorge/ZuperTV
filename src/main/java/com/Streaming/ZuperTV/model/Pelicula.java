package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;




@Data
@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    private Long idPelicula; // Comparte el mismo ID que el contenido

    @OneToOne
    @JoinColumn(name = "id_contenido")
    @MapsId // Le dice a JPA que use el ID de Contenido como su propio ID
    private Contenido contenido;

    private String urlVideo;
    private Integer duracionMinutos;
}
