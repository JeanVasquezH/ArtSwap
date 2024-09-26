package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Venta;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Integer> {
}
