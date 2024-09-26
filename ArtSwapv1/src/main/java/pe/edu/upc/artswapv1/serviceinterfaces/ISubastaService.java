package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Subasta;
import pe.edu.upc.artswapv1.entities.Venta;

import java.util.List;

public interface ISubastaService {
    public List<Subasta> list();
    public void insert(Subasta subas);

    public void delete(int id);
    public void update(Subasta subasta);

    //Query

    public List<String[]>VerSubastasActiva();
}
