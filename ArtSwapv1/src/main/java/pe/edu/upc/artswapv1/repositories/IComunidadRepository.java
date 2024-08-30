package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Comunidad;

import java.util.List;

@Repository
public interface IComunidadRepository extends JpaRepository<Comunidad, Integer>{
}
