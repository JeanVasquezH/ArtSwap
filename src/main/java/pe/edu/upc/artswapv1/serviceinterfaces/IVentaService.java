package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Venta;

import java.util.List;

public interface IVentaService {
    public List<Venta> list();
    public void insert(Venta vent);
    public void delete(int id);
    public void update(Venta venta);
}
