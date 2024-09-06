package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.artswapv1.entities.Subasta;

public interface ISubastaRepository extends JpaRepository<Subasta, Integer> {
}
