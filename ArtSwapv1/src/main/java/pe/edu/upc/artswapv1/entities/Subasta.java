package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Subasta")
public class Subasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSubasta;

    @Column(name = "Fecha_Inicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "Fecha_Fin", nullable = false)
    private LocalDate FechaFin;

    @Column(name = "Precio", nullable = false)
    private double  Precio;

    @Column(name = "Estado", nullable = false,length = 20)
    private String Estado;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario Usua;

    @OneToOne
    @JoinColumn(name="idObraArte")
    private  ObraArte obraArt;

    public Subasta() {
    }

    public Subasta(int idSubasta, LocalDate fecha_Inicio, LocalDate fecha_Fin, double precio, String estado, Usuario usua, ObraArte obraArt) {
        IdSubasta = idSubasta;
        FechaInicio = fecha_Inicio;
        FechaFin = fecha_Fin;
        Precio = precio;
        Estado = estado;
        Usua = usua;
        this.obraArt = obraArt;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int idSubasta) {
        IdSubasta = idSubasta;
    }

    public LocalDate getFecha_Inicio() {
        return FechaInicio;
    }

    public void setFecha_Inicio(LocalDate fecha_Inicio) {
        FechaInicio = fecha_Inicio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public LocalDate getFecha_Fin() {
        return FechaFin;
    }

    public void setFecha_Fin(LocalDate fecha_Fin) {
        FechaFin = fecha_Fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Usuario getUsua() {
        return Usua;
    }

    public void setUsua(Usuario usua) {
        Usua = usua;
    }

    public ObraArte getObraArt() {
        return obraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        this.obraArt = obraArt;
    }
}
