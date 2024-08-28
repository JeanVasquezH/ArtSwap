package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Metodo_Pago;
import pe.edu.upc.artswapv1.repositories.IMetodo_PagoRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IMetodo_PagoService;

import java.util.List;

@Service
public class Metodo_PagoImplement implements IMetodo_PagoService {
    @Autowired
    private IMetodo_PagoRepository mpR;

    @Override
    public List<Metodo_Pago> list(){
        return mpR.findAll();
    }
}
