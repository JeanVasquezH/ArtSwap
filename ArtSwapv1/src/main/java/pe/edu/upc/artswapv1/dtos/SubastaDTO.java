package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.util.Date;

public class SubastaDTO {
    private int IdSubasta;
    private Date Fecha_Inicio;
    private Date Fecha_Fin;
    private double  Precio;
    private String Estado;

    private Usuario Usua;
    private ObraArte obraArt;

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

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        Fecha_Fin = fecha_Fin;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public Usuario getUsua() {
        return Usua;
    }

    public void setUsua(Usuario usua) {
        Usua = usua;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public ObraArte getObraArt() {
        return obraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        this.obraArt = obraArt;
    }
}
