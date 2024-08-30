package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.Rol_usuario;

import java.util.List;

public interface IRol_UsuarioService {
    public List<Rol_usuario> list();
    public void insert(Rol_usuario rol);
    public Rol_usuario listId(int id);
    public void update(Rol_usuario rol);
}
