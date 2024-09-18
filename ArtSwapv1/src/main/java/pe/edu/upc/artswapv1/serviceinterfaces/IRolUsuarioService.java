package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Rolusuario;

import java.util.List;

public interface IRolUsuarioService {
    public List<Rolusuario> list();
    public void insert(Rolusuario rol);
    public Rolusuario listId(Long id);
    public void update(Rolusuario rol);

    //seguridad
    public void delete(Long idRol);
}
