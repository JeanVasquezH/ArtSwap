package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Intercambio;

import java.util.List;

public interface IIntercambioService {
    public List<Intercambio> list();
    public void insert(Intercambio inter);

    public void delete(int id);
    public void update(Intercambio cambio);

}
