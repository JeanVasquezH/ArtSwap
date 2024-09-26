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

    @ManyToOne
    @JoinColumn(name = "idComunidad")
    private Comunidad comu;

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


    public Usuario(Long idUsuario, String nombre, Comunidad comu) {
        IdUsuario = idUsuario;
        Nombre = nombre;
        this.comu = comu;
    }

    public Long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Comunidad getComu() {
        return comu;
    }

    public void setComu(Comunidad comu) {
        this.comu = comu;
    }

}
