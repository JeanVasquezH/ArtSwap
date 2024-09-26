package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.repositories.IObraArteRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IObraArteService;

import java.util.List;

@Service
public class ObraArteServiceImplement implements IObraArteService {
    @Autowired
    private IObraArteRepository oR;

    @Override
    public List<ObraArte> list() {
        return oR.findAll();
    }

    @Override
    public void insert(ObraArte obraArte) {
        oR.save(obraArte);
    }

    @Override
    public void delete(int id) {
        oR.deleteById(id);
    }

    @Override
    public void update(ObraArte obraArt) {
        oR.save(obraArt);
    }

    @Override
    public List<String[]> cantObraArtePorPersona() {
        return oR.cantObraArtePorPersona();
    }
}
