package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.entities.Usuario;

import java.time.LocalDate;
import java.util.Date;

public class FavoritosDTO {
    private int IdFavoritos;
    private LocalDate Fechaanadid;

    private Usuario usuario;
    private ObraArte obraArt;

    public int getIdFavoritos() {
        return IdFavoritos;
    }

    public void setIdFavoritos(int idFavoritos) {
        IdFavoritos = idFavoritos;
    }


    public LocalDate getFechaanadid() {
        return Fechaanadid;
    }

    public void setFechaanadid(LocalDate fechaanadid) {
        Fechaanadid = fechaanadid;
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
