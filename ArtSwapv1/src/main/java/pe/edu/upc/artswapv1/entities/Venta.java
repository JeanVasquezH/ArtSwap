package pe.edu.upc.artswapv1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdVenta;

    @Column(name = "Fecha_Venta", nullable = false)
    private Date Fecha_Venta;

    @Column(name = "Precio", nullable = false)
    private int Precio;

    @Column(name = "Metodo_Pago", nullable = false, length = 20)
    private String Metodo_Pago;

    @ManyToOne
    @JoinColumn(name="idObraArte")
    private ObraArte ObraArt;

    @ManyToOne
    @JoinColumn(name="idMetodoPago")
    private MetodoPago metodoPago;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha_Venta, int precio, String metodo_Pago,MetodoPago metodoPago, ObraArte ObraArt) {
        IdVenta = idVenta;
        Fecha_Venta = fecha_Venta;
        Precio = precio;
        Metodo_Pago = metodo_Pago;
        this.ObraArt = ObraArt;
        this.metodoPago=metodoPago;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int idVenta) {
        IdVenta = idVenta;
    }

    public Date getFecha_Venta() {
        return Fecha_Venta;
    }

    public void setFecha_Venta(Date fecha_Venta) {
        Fecha_Venta = fecha_Venta;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getMetodo_Pago() {
        return Metodo_Pago;
    }

    public void setMetodo_Pago(String metodo_Pago) {
        Metodo_Pago = metodo_Pago;
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