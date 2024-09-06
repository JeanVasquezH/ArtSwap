package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Evento;
import pe.edu.upc.artswapv1.repositories.IEventoRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IEventoService;

import java.util.List;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository iR;

    @Override
    public List<Evento> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Evento event) {
        iR.save(event);
    }
}
