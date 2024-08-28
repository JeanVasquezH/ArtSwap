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
}
