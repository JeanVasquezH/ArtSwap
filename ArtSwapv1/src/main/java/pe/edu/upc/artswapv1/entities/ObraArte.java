package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="ObraArte")
public class ObraArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdObraArte;

    @Column(name = "Titulo", nullable = false, length = 100)
    private String Titulo;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String Descripcion;

    @Column(name = "FechaCreacion", nullable = false)
    private LocalDate FechaCreacion;

    @Column(name = "Estado", nullable = false, length = 20)
    private String Estado;

    @Column(name = "Precio", nullable = false)
    private double Precio;

    @Column(name = "Valoracion", nullable = false)
    private int Valoracion;

    //fata relacion uno a muchos con reseñas
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usua;


    public ObraArte() {
    }

    public ObraArte(int idObraArte, String titulo, String descripcion, LocalDate fechaCreacion, String estado, double precio, int valoracion, Usuario usua) {
        IdObraArte = idObraArte;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaCreacion = fechaCreacion;
        Estado = estado;
        Precio = precio;
        Valoracion = valoracion;
        this.usua = usua;
    }



    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getIdObraArte() {
        return IdObraArte;
    }

    public void setIdObraArte(int idObraArte) {
        IdObraArte = idObraArte;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int valoracion) {
        Valoracion = valoracion;
    }

    public Usuario getUsua() {
        return usua;
    }

    public void setUsua(Usuario usua) {
        this.usua = usua;
    }
}
