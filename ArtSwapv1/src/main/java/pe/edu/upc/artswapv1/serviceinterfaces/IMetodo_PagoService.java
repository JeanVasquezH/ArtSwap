package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Metodo_Pago;

import java.util.List;

public interface IMetodo_PagoService {

    public List<Metodo_Pago> list();
    public void insert(Metodo_Pago metodo);
    public void delete(int id);
    public void update(Metodo_Pago metodo);

}
