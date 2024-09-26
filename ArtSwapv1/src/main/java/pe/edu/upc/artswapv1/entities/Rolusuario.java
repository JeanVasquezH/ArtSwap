package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"userid", "rol"})})
public class Rolusuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRolusuario;

    @Column(name = "Descripcion", nullable = false,length = 35)
    private String Descripcion;

    public Rolusuario() {
    }

    //Seguridad

    private String rol;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
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


    public Rolusuario(Long idRolusuario, String descripcion) {
        IdRolusuario = idRolusuario;
        Descripcion = descripcion;
    }

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

