package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Subasta")
public class Subasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSubasta;

    @Column(name = "Fecha_Inicio", nullable = false)
    private Date Fecha_Inicio;

    @Column(name = "Fecha_Fin", nullable = false)
    private Date Fecha_Fin;

    @Column(name = "Precio", nullable = false)
    private double  Precio;

    @Column(name = "Estado", nullable = false,length = 20)
    private String Estado;

    public Subasta() {
    }

    public Subasta(int idSubasta, Date fecha_Inicio, Date fecha_Fin, double precio, String estado) {
        IdSubasta = idSubasta;
        Fecha_Inicio = fecha_Inicio;
        Fecha_Fin = fecha_Fin;
        Precio = precio;
        Estado = estado;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int idSubasta) {
        IdSubasta = idSubasta;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        Fecha_Inicio = fecha_Inicio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        Fecha_Fin = fecha_Fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
