package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.artswapv1.entities.ObraArte;

import java.util.List;

public interface IObraArteRepository extends JpaRepository<ObraArte, Integer> {

    @Query(value = "SELECT u.nombre , sum(o.precio), count(o.titulo) as \n" +
            "FROM obra_arte o JOIN usuario u ON o.id_usuario = u.id_usuario\n" +
            "Group by u.nombre\n", nativeQuery = true)
    public List<String[]> cantObraArtePorPersona();

}
