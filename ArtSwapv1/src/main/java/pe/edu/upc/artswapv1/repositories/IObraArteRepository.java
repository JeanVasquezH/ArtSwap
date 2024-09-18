package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.artswapv1.entities.ObraArte;

import java.util.List;

public interface IObraArteRepository extends JpaRepository<ObraArte, Integer> {
    List<ObraArte> findAllByOrderByValoracionDesc();
}
