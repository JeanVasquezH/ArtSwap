package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.artswapv1.entities.Favoritos;

public interface IFavoritosRepository extends JpaRepository<Favoritos, Integer> {
}
