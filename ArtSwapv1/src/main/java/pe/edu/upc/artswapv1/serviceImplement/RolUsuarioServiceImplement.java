package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Rolusuario;
import pe.edu.upc.artswapv1.repositories.IRolUsuarioRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IRolUsuarioService;

import java.util.List;
@Service
public class RolUsuarioServiceImplement implements IRolUsuarioService {
    @Autowired
    private IRolUsuarioRepository ruR;

    @Override
    public List<Rolusuario> list(){
        return ruR.findAll();
    }

    @Override
    public  void insert(Rolusuario rol) {
        ruR.save(rol);
    }
    @Override
    public  void update(Rolusuario rol) {
        ruR.save(rol);
    }
    // Tal vez se elimine
    @Override
    public Rolusuario listId(int id){
        return ruR.findById(id).orElse(new Rolusuario());
    }
}
