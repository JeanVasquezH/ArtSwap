package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Rol_usuario;
import pe.edu.upc.artswapv1.repositories.IRol_UsuarioRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IRol_UsuarioService;

import java.util.List;
@Service
public class Rol_UsuarioServiceImplement implements IRol_UsuarioService {
    @Autowired
    private IRol_UsuarioRepository ruR;

    @Override
    public List<Rol_usuario> list(){
        return ruR.findAll();
    }

    @Override
    public  void insert(Rol_usuario rol) {
        ruR.save(rol);
    }
    @Override
    public  void update(Rol_usuario rol) {
        ruR.save(rol);
    }
    // Tal vez se elimine
    @Override
    public Rol_usuario listId(int id){
        return ruR.findById(id).orElse(new Rol_usuario());
    }
}
