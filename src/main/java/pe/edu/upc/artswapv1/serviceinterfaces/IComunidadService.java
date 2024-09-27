package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Comunidad;

import java.util.List;

public interface IComunidadService {
    public List<Comunidad> list();
    public void insert(Comunidad comu);
    public void delete(int id);
    public void update(Comunidad comu);

    public List<String[]>CantidadPersonasPorComunidad();
}
