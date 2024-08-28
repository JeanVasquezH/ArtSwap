package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol_usuario")
public class Rol_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdRol_usuario;

    @Column(name = "Nombre", nullable = false,length = 20)
    private String Nombre;

    @Column(name = "Descripcion", nullable = false,length = 35)
    private String Descripcion;

    public Rol_usuario() {
    }

    public Rol_usuario(int idRol_usuario, String nombre, String descripcion) {
        IdRol_usuario = idRol_usuario;
        Nombre = nombre;
        Descripcion = descripcion;
    }

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

