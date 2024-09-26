package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Comunidad")

public class Comunidad {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int IdComunidad;

   @Column(name = "Nombre", nullable = false, length = 20)
   private String Nombre;

    @Column(name = "Descripcion", nullable = false, length = 50)
    private String Descripcion;

    @Column(name = "FechaCreacion", nullable = false)
    private LocalDate FechaCreacion;

    public Comunidad() {
    }

    public Comunidad(String Nombre, String Descripcion, LocalDate Fecha_Creacion) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaCreacion = Fecha_Creacion;
    }

    public int getIdComunidad() {
        return IdComunidad;
    }

    public void setIdComunidad(int idComunidad) {
        IdComunidad = idComunidad;
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

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
}

