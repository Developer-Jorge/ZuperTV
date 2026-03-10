package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
@Table(name = "historial")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;

    private Integer minutoActual;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    // Puede ser null si está viendo un episodio
    @ManyToOne
    @JoinColumn(name = "id_pelicula", nullable = true)
    private Pelicula pelicula;

    // Puede ser null si está viendo una película
    @ManyToOne
    @JoinColumn(name = "id_episodio", nullable = true)
    private Episodio episodio;
}
