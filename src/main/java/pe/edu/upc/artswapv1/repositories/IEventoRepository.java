package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.artswapv1.entities.Evento;

import java.util.List;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, Integer> {

}
