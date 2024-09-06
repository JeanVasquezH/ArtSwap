package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.MetodoPago;
import pe.edu.upc.artswapv1.entities.ObraArte;

import java.util.Date;

public class VentaDTO {
    private int IdVenta;
    private Date Fecha_Venta;
    private int Precio;
    private String Metodo_Pago;

    private ObraArte ObraArt;
    private MetodoPago metodoPago;


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

    public ObraArte getObraArt() {
        return ObraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        ObraArt = obraArt;
    }

    public String getMetodo_Pago() {
        return Metodo_Pago;
    }

    public void setMetodo_Pago(String metodo_Pago) {
        Metodo_Pago = metodo_Pago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
