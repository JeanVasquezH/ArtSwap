package pe.edu.upc.artswapv1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.artswapv1.entities.SSecurityRole;
import pe.edu.upc.artswapv1.repositories.ISRoleRepository;
import pe.edu.upc.artswapv1.serviceinterfaces.ISRoleService;

import java.util.List;

@Service
public class SRoleServiceImplement implements ISRoleService {
    @Autowired
    private ISRoleRepository isR;

    @Override
    public void insert(SSecurityRole rol) {
        isR.save(rol);
    }

    @Override
    public List<SSecurityRole> list() {
        return isR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        isR.deleteById(idRol);
    }

    @Override
    public SSecurityRole listarId(Long idRol) {
        return isR.findById(idRol).orElse(new SSecurityRole());
    }
}
