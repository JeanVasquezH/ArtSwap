package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.SSecurityRole;

import java.util.List;

public interface ISRoleService {
    public void insert(SSecurityRole rol);

    public List<SSecurityRole> list();

    public void delete(Long idRol);

    public SSecurityRole listarId(Long idRol);
}
