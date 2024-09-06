package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Venta;
import pe.edu.upc.artswapv1.repositories.IVentaRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IVentaService;

import java.util.List;

@Service
public class VentaServiceImplement implements IVentaService {
    @Autowired
    private IVentaRepository vR;

    @Override
    public List<Venta> list() {
        return vR.findAll();
    }

    @Override
    public void insert(Venta vent) {
        vR.save(vent);
    }
}
