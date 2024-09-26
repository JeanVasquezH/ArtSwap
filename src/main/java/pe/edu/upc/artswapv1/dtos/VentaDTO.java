package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.MetodoPago;
import pe.edu.upc.artswapv1.entities.ObraArte;

import java.time.LocalDate;
import java.util.Date;

public class VentaDTO {
    private int IdVenta;
    private LocalDate FechaVenta;
    private int Precio;
    private String MetodoPago;

    private ObraArte ObraArt;
    private MetodoPago metodoPago;


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

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(pe.edu.upc.artswapv1.entities.MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        MetodoPago = metodoPago;
    }

    public ObraArte getObraArt() {
        return ObraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        ObraArt = obraArt;
    }
}
