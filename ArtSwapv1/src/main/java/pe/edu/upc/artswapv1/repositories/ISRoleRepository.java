package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.SSecurityRole;

@Repository
public interface ISRoleRepository extends JpaRepository<SSecurityRole, Long> {
}
