package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Comunidad;
import pe.edu.upc.artswapv1.repositories.IComunidadRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IComunidadService;

import java.util.List;

@Service
public class ComunidadServiceImplement implements IComunidadService {
    @Autowired
    private IComunidadRepository cR;

    @Override
    public List<Comunidad> list(){
        return cR.findAll();
    }
    @Override
    public void insert(Comunidad comu){
        cR.save(comu);
    }
    @Override
    public void delete(int id){
        cR.deleteById(id);
    }
    @Override
    public void update(Comunidad comu){
        cR.save(comu);
    }

    @Override
    public List<String[]> CantidadPersonasPorComunidad() {
        return cR.CantidadPersonasPorComunidad();
    }

}
