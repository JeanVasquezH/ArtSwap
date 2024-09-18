package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {

    public List<MetodoPago> list();
    public void insert(MetodoPago metodo);
    public void delete(int id);
    public void update(MetodoPago metodo);

}
