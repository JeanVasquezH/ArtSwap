package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Comunidad;
import pe.edu.upc.artswapv1.entities.Intercambio;
import pe.edu.upc.artswapv1.entities.Rolusuario;

import java.util.Date;

public class UsuarioDTO {

    private int IdUsuario;
    private String Nombre;
    private String Correo_Electronico;
    private String Contrasena;
    private Date Fecha_Registro;


    private Comunidad comu;
    private Rolusuario rolUser;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public Date getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(Date fecha_Registro) {
        Fecha_Registro = fecha_Registro;
    }

    public Comunidad getComu() {
        return comu;
    }

    public void setComu(Comunidad comu) {
        this.comu = comu;
    }

    public Rolusuario getRolUser() {
        return rolUser;
    }

    public void setRolUser(Rolusuario rolUser) {
        this.rolUser = rolUser;
    }
}
