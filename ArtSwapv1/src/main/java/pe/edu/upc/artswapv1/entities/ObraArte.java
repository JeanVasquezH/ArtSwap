package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Obra_Arte")
public class ObraArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdObra_Arte;

    @Column(name = "Titulo", nullable = false, length = 100)
    private String Titulo;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String Descripcion;

    @Column(name = "Fecha_Creacion", nullable = false)
    private Date Fecha_Creacion;

    @Column(name = "Estado", nullable = false, length = 20)
    private String Estado;

    @Column(name = "Precio", nullable = false)
    private double Precio;

    @Column(name = "Valoracion", nullable = false)
    private int Valoracion;

    //relacion con ususuario id
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usua;

    //relacion con reseñas
    @ManyToOne
    @JoinColumn(name="idResenha")
    private Resenha resenha;


    public ObraArte() {
    }

    public ObraArte(int idObra_Arte, String titulo, String descripcion, Date fecha_Creacion, String estado, double precio, int valoracion, Usuario usua, Resenha resenha) {
        IdObra_Arte = idObra_Arte;
        Titulo = titulo;
        Descripcion = descripcion;
        Fecha_Creacion = fecha_Creacion;
        Estado = estado;
        Precio = precio;
        Valoracion = valoracion;
        this.usua = usua;
        this.resenha = resenha;


    }

    public int getIdObra_Arte() {
        return IdObra_Arte;
    }

    public void setIdObra_Arte(int idObra_Arte) {
        IdObra_Arte = idObra_Arte;
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

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
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

    public Resenha getResenha() {return resenha;}

    public void setResenha(Resenha resenha) {this.resenha = resenha;}
}
