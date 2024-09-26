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

    @Column(name = "FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "FechaFin", nullable = false)
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

    public Subasta(int idSubasta, LocalDate fechaInicio, LocalDate fechaFin, double precio, String estado, Usuario usua, ObraArte obraArt) {
        IdSubasta = idSubasta;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
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

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        FechaFin = fechaFin;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
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
