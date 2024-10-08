package pe.edu.upc.artswapv1.serviceinterfaces;


import pe.edu.upc.artswapv1.entities.Resenha;

import java.util.List;

public interface IResenhaService {

    public List<Resenha> list();
    public void insert(Resenha resena);

    public void delete(int id);
    public void update(Resenha review);

}
