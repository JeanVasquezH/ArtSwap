package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Resenha;

@Repository
public interface IResenhaRepository extends JpaRepository<Resenha, Integer> {

}
