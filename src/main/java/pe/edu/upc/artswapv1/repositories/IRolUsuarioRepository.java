package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Rolusuario;

@Repository
public interface IRolUsuarioRepository extends JpaRepository<Rolusuario,Long> {

}
