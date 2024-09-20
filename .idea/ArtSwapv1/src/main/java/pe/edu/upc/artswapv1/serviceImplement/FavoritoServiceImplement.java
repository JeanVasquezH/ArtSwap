package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Favoritos;
import pe.edu.upc.artswapv1.repositories.IFavoritosRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IFavoritoService;

import java.util.List;

@Service
public class FavoritoServiceImplement implements IFavoritoService {
    @Autowired
    private IFavoritosRepository iR;


    @Override
    public List<Favoritos> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Favoritos favori) {
        iR.save(favori);
    }
}
