package pe.edu.upc.artswapv1.serviceinterfaces;

import pe.edu.upc.artswapv1.entities.SSecurityUsers;

import java.util.List;

public interface ISUserService {
    public void insert(SSecurityUsers usuario);

    public List<SSecurityUsers> list();

    public void delete(Long idUsuario);

    public SSecurityUsers listarId(Long idUsuario);
}
