package pe.edu.upc.artswapv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.artswapv1.entities.Intercambio;
import pe.edu.upc.artswapv1.entities.Subasta;

import java.util.List;

public interface ISubastaRepository extends JpaRepository<Subasta, Integer> {

    @Query(value = "SELECT subasta.fecha_inicio, subasta.fecha_fin, obra_arte.titulo, subasta.precio \n"+
            " FROM subasta \n"+
            "JOIN obra_arte ON subasta.id_obra_arte = obra_arte.id_obra_arte \n"+
            " WHERE subasta.estado = 'activa' ", nativeQuery = true)
    public List<String[]>VerSubastasActiva();

}
