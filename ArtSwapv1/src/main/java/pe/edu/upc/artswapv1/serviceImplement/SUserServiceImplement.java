package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.SSecurityUsers;
import pe.edu.upc.artswapv1.repositories.ISUserRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.ISUserService;

import java.util.List;

@Service
public class SUserServiceImplement implements ISUserService {
    @Autowired
    private ISUserRepository iuR;

    @Override
    public void insert(SSecurityUsers usuario) {
        iuR.save(usuario);
    }

    @Override
    public List<SSecurityUsers> list() {
        return iuR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        iuR.deleteById(idUsuario);
    }

    @Override
    public SSecurityUsers listarId(Long idUsuario) {
        return iuR.findById(idUsuario).orElse(new SSecurityUsers());
    }
}
