package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Usuario;

public class RolUsuarioDTO {

    private Long IdRolusuario;
    private String Descripcion;
    //Seguridad
    private String rol;
    private Usuario user;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }


    //


    public Long getIdRolusuario() {
        return IdRolusuario;
    }

    public void setIdRolusuario(Long idRolusuario) {
        IdRolusuario = idRolusuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
