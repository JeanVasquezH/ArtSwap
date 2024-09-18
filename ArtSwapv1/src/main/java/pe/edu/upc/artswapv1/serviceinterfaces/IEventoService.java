package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Evento;

import java.util.List;

public interface IEventoService {

    public List<Evento> list();
    public void insert(Evento event);
}
