package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Intercambio;

import java.security.PublicKey;

@Repository
public interface IIntercambioRepository extends JpaRepository<Intercambio, Integer> {




}
