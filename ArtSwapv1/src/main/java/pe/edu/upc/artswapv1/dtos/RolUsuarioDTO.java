package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Usuario;

public class RolUsuarioDTO {

    private Long IdRol_usuario;
    private String Nombre;
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
    public Long getIdRol_usuario() {
        return IdRol_usuario;
    }

    public void setIdRol_usuario(Long idRol_usuario) {
        IdRol_usuario = idRol_usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
