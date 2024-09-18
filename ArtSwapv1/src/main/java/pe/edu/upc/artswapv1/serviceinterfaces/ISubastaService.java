package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Subasta;

import java.util.List;

public interface ISubastaService {
    public List<Subasta> list();
    public void insert(Subasta subas);
}
