package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Resenha;
import pe.edu.upc.artswapv1.repositories.IResenhaRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IResenhaService;

import java.util.List;

@Service
public class ResenhaServiceImplement implements IResenhaService {
    @Autowired
    private IResenhaRepository rR;


    @Override
    public List<Resenha> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Resenha resena) {
        rR.save(resena);
    }
}
