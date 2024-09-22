package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Subasta;
import pe.edu.upc.artswapv1.repositories.ISubastaRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.ISubastaService;

import java.util.List;

@Service
public class SubastaServiceImplement implements ISubastaService {
    @Autowired
    private ISubastaRepository sR;


    @Override
    public List<Subasta> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Subasta subas) {
        sR.save(subas);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public void update(Subasta subasta) {
        sR.save(subasta);
    }
}
