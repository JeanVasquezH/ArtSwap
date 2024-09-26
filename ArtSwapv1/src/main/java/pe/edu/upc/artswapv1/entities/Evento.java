package pe.edu.upc.artswapv1.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEvento;

    @Column(name = "Descripcion", nullable = false,length = 100)
    private String Descripcion;

    @Column(name = "FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "FechaFin", nullable = false)
    private LocalDate FechaFin;

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

    public Evento(int idEvento, String descripcion, LocalDate fechainicio, LocalDate fechafin, String tipo, String ubicacion, int valoracion,ObraArte obraArt,Usuario usua) {
        IdEvento = idEvento;
        Descripcion = descripcion;
        FechaInicio = fechainicio;
        FechaFin = fechafin;
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
