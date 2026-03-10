package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
@Table(name = "temporada")
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTemporada;

    private Integer numeroTemporada;

    // Relación N a 1 con Contenido (La serie a la que pertenece)
    @ManyToOne
    @JoinColumn(name = "id_contenido")
    private Contenido contenido;

    // Relación 1 a N con Episodio
    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private List<Episodio> episodios;
}
