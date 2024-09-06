package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Favoritos;

import java.util.List;

public interface IFavoritoService {
    public List<Favoritos> list();
    public void insert(Favoritos favori);
}
