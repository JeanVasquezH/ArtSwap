package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEvento;

    @Column(name = "Descripcion", nullable = false,length = 100)
    private String Descripcion;

    @Column(name = "FechaInicio", nullable = false)
    private Date Fecha_Inicio;

    @Column(name = "FechaFin", nullable = false)
    private Date Fecha_Fin;

    @Column(name = "Tipo", nullable = false,length = 20)
    private String Tipo;

    @Column(name = "Ubicacion", nullable = false,length = 100)
    private String Ubicacion;

    @Column(name = "Valoracion", nullable = false)
    private int Valoracion;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usua;

    @ManyToOne
    @JoinColumn(name="idObraArte")
    private ObraArte obraArt;

    // Relacion con la tabla UsuariId y Obra_Arte_Id
    public Evento() {
    }

    public Evento(int idEvento, String descripcion, Date fecha_Inicio, Date fecha_Fin, String tipo, String ubicacion, int valoracion,ObraArte obraArt,Usuario usua) {
        IdEvento = idEvento;
        Descripcion = descripcion;
        Fecha_Inicio = fecha_Inicio;
        Fecha_Fin = fecha_Fin;
        Tipo = tipo;
        Ubicacion = ubicacion;
        Valoracion = valoracion;
        this.obraArt = obraArt;
        this.usua = usua;

    }

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int idEvento) {
        IdEvento = idEvento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int valoracion) {
        Valoracion = valoracion;
    }

    public Usuario getUsua() {
        return usua;
    }

    public void setUsua(Usuario usua) {
        this.usua = usua;
    }

    public ObraArte getObraArt() {
        return obraArt;
    }

    public void setObraArt(ObraArte obraArt) {
        this.obraArt = obraArt;
    }
}
