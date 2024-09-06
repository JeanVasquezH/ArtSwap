package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Intercambio;

@Repository
public interface IIntercambioRepository extends JpaRepository<Intercambio, Integer> {
}
