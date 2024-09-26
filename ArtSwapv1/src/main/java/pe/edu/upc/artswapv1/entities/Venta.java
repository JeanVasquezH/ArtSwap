package pe.edu.upc.artswapv1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdVenta;

    @Column(name = "FechaVenta", nullable = false)
    private LocalDate FechaVenta;

    @Column(name = "Precio", nullable = false)
    private int Precio;

    @ManyToOne
    @JoinColumn(name="idObraArte")
    private ObraArte ObraArt;

    @ManyToOne
    @JoinColumn(name="idMetodoPago")
    private MetodoPago metodoPago;

    public Venta() {
    }

    public Venta(int idVenta, LocalDate fechaVenta, int precio, MetodoPago metodoPago, ObraArte ObraArt) {
        IdVenta = idVenta;
        FechaVenta = fechaVenta;
        Precio = precio;
        this.ObraArt = ObraArt;
        this.metodoPago=metodoPago;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int idVenta) {
        IdVenta = idVenta;
    }

    public LocalDate getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        FechaVenta = fechaVenta;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public ObraArte getObraArt() {
        return ObraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        ObraArt = obraArt;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
