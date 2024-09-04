package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Intercambio;
import pe.edu.upc.artswapv1.repositories.IIntercambioRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IIntercambioService;

import java.util.List;

@Service
public class IntercambioServiceImplement implements IIntercambioService {
    @Autowired
    private IIntercambioRepository iR;

    @Override
    public List<Intercambio> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Intercambio inter) {
        iR.save(inter);
    }
}
