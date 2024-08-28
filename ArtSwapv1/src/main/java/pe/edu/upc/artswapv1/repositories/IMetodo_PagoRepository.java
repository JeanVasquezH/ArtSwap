package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Metodo_Pago;

@Repository
public interface IMetodo_PagoRepository extends JpaRepository<Metodo_Pago,Integer> {
}
