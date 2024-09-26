package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Comunidad;

import java.util.List;

@Repository
public interface IComunidadRepository extends JpaRepository<Comunidad, Integer>{

    @Query(value = "SELECT comunidad.nombre, COUNT(usuario.nombre) AS Cantidadpersonas\n" +
            "FROM usuario\n" +
            "JOIN comunidad ON usuario.id_comunidad = comunidad.id_comunidad  \n" +
            "GROUP BY comunidad.nombre;" , nativeQuery = true)
    public List<String[]>CantidadPersonasPorComunidad();
}
