package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.ObraArte;

import java.util.List;

public interface IObraArteService {
    public List<ObraArte> list();
    public void insert(ObraArte obraArte);
}
