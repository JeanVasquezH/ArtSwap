package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.util.Date;

public class FavoritosDTO {
    private int IdFavoritos;
    private Date Fecha_anadid;

    private Usuario usuario;
    private ObraArte obraArt;

    public int getIdFavoritos() {
        return IdFavoritos;
    }

    public void setIdFavoritos(int idFavoritos) {
        IdFavoritos = idFavoritos;
    }

    public Date getFecha_anadid() {
        return Fecha_anadid;
    }

    public void setFecha_anadid(Date fecha_anadid) {
        Fecha_anadid = fecha_anadid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ObraArte getObraArt() {
        return obraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        this.obraArt = obraArt;
    }
}
