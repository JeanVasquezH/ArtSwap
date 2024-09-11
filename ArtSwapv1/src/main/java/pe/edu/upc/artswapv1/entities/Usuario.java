package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUsuario;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;

    @Column(name = "Correo_Electronico", nullable = false, length = 50)
    private String Correo_Electronico;

    @Column(name = "Contrasena", nullable = false, length = 50)
    private String Contrasena;

    @Column(name = "Fecha_Registro", nullable = false)
    private Date Fecha_Registro;

    @ManyToOne
    @JoinColumn(name="idComunidad")
    private Comunidad comu;

    @ManyToOne
    @JoinColumn(name ="idRolUsuario")
    private Rolusuario rolUser;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String correo_Electronico, String contrasena, Date fecha_Registro, Comunidad comu, Rolusuario rolusuario) {
        IdUsuario = idUsuario;
        Nombre = nombre;
        Correo_Electronico = correo_Electronico;
        Contrasena = contrasena;
        Fecha_Registro = fecha_Registro;
        this.comu = comu;
        rolUser = rolusuario;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
