

package com.Streaming.ZuperTV.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// ¡Esta es la línea mágica que te falta!
import com.Streaming.ZuperTV.model.Contenido; 

@Repository
public interface ContenidoRepository extends JpaRepository<Contenido, Long> {
    List<Contenido> findByTipo(String tipo);
}
