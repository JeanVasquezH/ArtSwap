package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.time.LocalDate;
import java.util.Date;

public class IntercambioDTO {
    private int IdIntercambio;
    private LocalDate FechaIntercambio;
    private String Estado;

    private Usuario usuario;
    private ObraArte obraArte;

    public int getIdIntercambio() {
        return IdIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        IdIntercambio = idIntercambio;
    }

    public LocalDate getFechaIntercambio() {
        return FechaIntercambio;
    }

    public void setFechaIntercambio(LocalDate fechaIntercambio) {
        FechaIntercambio = fechaIntercambio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ObraArte getObraArte() {
        return obraArte;
    }

    public void setObraArte(ObraArte obraArte) {
        this.obraArte = obraArte;
    }
}
