package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Favoritos")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdFavoritos;

    @Column(name = "Fechaanadid", nullable = false)
    private LocalDate Fechaanadid;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="idObraArte")
    private ObraArte obraArt;


    public Favoritos() {
    }

    public Favoritos(int idFavoritos, LocalDate fechaanadid, Usuario usuario, ObraArte obraArt) {
        IdFavoritos = idFavoritos;
        Fechaanadid = fechaanadid;
        this.usuario = usuario;
        this.obraArt = obraArt;
    }

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
