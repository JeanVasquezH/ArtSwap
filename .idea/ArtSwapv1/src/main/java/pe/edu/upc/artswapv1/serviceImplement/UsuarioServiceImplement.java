package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.Usuario;
import pe.edu.upc.artswapv1.repositories.IUsuarioRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list(){
        return uR.findAll();
    }

    @Override
    public void insert(Usuario user){
        uR.save(user);
    }

   //Seguridad
   @Override
   public void delete(Long idUsuario) {
       uR.deleteById(idUsuario);
   }

    @Override
    public Usuario listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
    //
}
