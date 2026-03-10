package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;



@Data
@Entity
@Table(name = "episodio")
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEpisodio;

    private Integer numeroEpisodio;
    private String tituloEpisodio;
    private String urlVideo;
    private Integer duracionMinutos;

    // Relación N a 1 con Temporada
    @ManyToOne
    @JoinColumn(name = "id_temporada")
    private Temporada temporada;
}

