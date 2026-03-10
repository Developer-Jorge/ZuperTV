package com.Streaming.ZuperTV.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;



@Data
@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    private String nombre;
    
    @ManyToMany(mappedBy = "generos")
    private List<Contenido> contenidos;
}

