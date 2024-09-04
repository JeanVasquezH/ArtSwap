package pe.edu.upc.artswapv1.dtos;

public class RolUsuarioDTO {

    private int IdRol_usuario;
    private String Nombre;
    private String Descripcion;

    public int getIdRol_usuario() {
        return IdRol_usuario;
    }

    public void setIdRol_usuario(int idRol_usuario) {
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
