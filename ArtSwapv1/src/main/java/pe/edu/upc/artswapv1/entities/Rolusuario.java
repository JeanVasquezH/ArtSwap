package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "rol"})})
public class Rolusuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRol_usuario;

    @Column(name = "Descripcion", nullable = false,length = 35)
    private String Descripcion;

    public Rolusuario() {
    }

    //Seguridad

    private String rol;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
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


    public Rolusuario(Long idRol_usuario, String descripcion) {
        IdRol_usuario = idRol_usuario;
        Descripcion = descripcion;
    }

    public Long getIdRol_usuario() {
        return IdRol_usuario;
    }

    public void setIdRol_usuario(Long idRol_usuario) {
        IdRol_usuario = idRol_usuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}

