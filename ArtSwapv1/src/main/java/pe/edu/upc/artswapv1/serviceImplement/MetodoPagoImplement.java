package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.MetodoPago;
import pe.edu.upc.artswapv1.repositories.IMetodoPagoRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IMetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mpR;

    @Override
    public List<MetodoPago> list(){
        return mpR.findAll();
    }

    @Override
    public void insert(MetodoPago metodo){
        mpR.save(metodo);
    }
    @Override
    public void delete(int id){
        mpR.deleteById(id);
    }
    @Override
    public void update(MetodoPago metodo){
        mpR.save(metodo);
    }

}
