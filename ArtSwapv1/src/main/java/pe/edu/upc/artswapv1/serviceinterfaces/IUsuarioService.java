package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();
    public void insert(Usuario user);
}
