package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Favoritos")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdFavoritos;

    @Column(name = "Fecha_anadid", nullable = false)
    private Date Fecha_anadid;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="idObraArte")
    private ObraArte obraArt;


    public Favoritos() {
    }

    public Favoritos(int idFavoritos, Date fecha_anadid, Usuario usuario, ObraArte obraArt) {
        IdFavoritos = idFavoritos;
        Fecha_anadid = fecha_anadid;
        this.usuario = usuario;
        this.obraArt = obraArt;
    }

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
