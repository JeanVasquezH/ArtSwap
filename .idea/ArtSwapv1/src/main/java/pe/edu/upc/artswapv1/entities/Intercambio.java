package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Intercambio")
public class Intercambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdIntercambio;

    @Column(name = "FechaIntercambio", nullable = false)
    private Date Fecha_Intercambio;

    @Column(name = "Estado", nullable = false, length = 20)
    private String Estado;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name ="idObraArte")
    private ObraArte obraArte;


    public Intercambio(){
    }

    public Intercambio(int idIntercambio, Date fecha_Intercambio, String estado,  Usuario usuario,  ObraArte obraArte) {
        IdIntercambio = idIntercambio;
        Fecha_Intercambio = fecha_Intercambio;
        Estado = estado;
        this.usuario = usuario;
        this.obraArte = obraArte;
    }

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
