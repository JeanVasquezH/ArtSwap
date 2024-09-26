package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.time.LocalDate;
import java.util.Date;

public class SubastaDTO {
    private int IdSubasta;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
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
