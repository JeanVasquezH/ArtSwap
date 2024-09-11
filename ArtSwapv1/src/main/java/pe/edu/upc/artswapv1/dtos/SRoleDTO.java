package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.SSecurityUsers;

public class SRoleDTO {
    private Long id;
    private String rol;
    private SSecurityUsers user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public SSecurityUsers getUser() {
        return user;
    }

    public void setUser(SSecurityUsers user) {
        this.user = user;
    }
}
