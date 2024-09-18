package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.util.Date;

public class IntercambioDTO {
    private int IdIntercambio;
    private Date Fecha_Intercambio;
    private String Estado;

    private Usuario usuario;
    private ObraArte obraArte;

    public int getIdIntercambio() {
        return IdIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        IdIntercambio = idIntercambio;
    }

    public Date getFecha_Intercambio() {
        return Fecha_Intercambio;
    }

    public void setFecha_Intercambio(Date fecha_Intercambio) {
        Fecha_Intercambio = fecha_Intercambio;
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
