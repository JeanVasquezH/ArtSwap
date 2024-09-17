package pe.edu.upc.artswapv1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUsuario;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;

    @Column(name = "Correo_Electronico", nullable = false, length = 50)
    private String Correo_Electronico;

    @Column(name = "Contrasena", nullable = false, length = 50)
    private String Contrasena;

    @Column(name = "Fecha_Registro", nullable = false)
    private Date Fecha_Registro;

    @ManyToOne
    @JoinColumn(name = "idComunidad")
    private Comunidad comu;

    @ManyToOne
    @JoinColumn(name = "idRolUsuario")
    private Rolusuario rolUser;

    public Usuario() {
    }

    //SEGURIDAD
    @Column(length = 39, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    private Boolean enabled;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Rolusuario> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Rolusuario> getRoles() {
        return roles;
    }

    public void setRoles(List<Rolusuario> roles) {
        this.roles = roles;
    }

    //


    public Usuario(Long idUsuario, String nombre, String correo_Electronico, String contrasena, Date fecha_Registro, Comunidad comu, Rolusuario rolusuario) {
        IdUsuario = idUsuario;
        Nombre = nombre;
        Correo_Electronico = correo_Electronico;
        Contrasena = contrasena;
        Fecha_Registro = fecha_Registro;
        this.comu = comu;
        rolUser = rolusuario;
    }

    public Long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
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
