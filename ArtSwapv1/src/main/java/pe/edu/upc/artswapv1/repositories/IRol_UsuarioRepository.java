package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Rol_usuario;

@Repository
public interface IRol_UsuarioRepository extends JpaRepository<Rol_usuario,Integer> {

}
