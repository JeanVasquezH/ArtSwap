package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Resenha")
public class Resenha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdResenha;

    @Column(name = "Calificacion", nullable = false)
    private int Calificacion;

    @Column(name = "Comentario", nullable = false, length = 50)
    private String Comentario;

    @Column(name = "FechaResena", nullable = false)
    private Date Fecha_Resena;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usua;


    public Resenha(){
    }

    public Resenha(int idResenha, int calificacion, String comentario, Date fecha_Resena, Usuario usua) {
        IdResenha = idResenha;
        Calificacion = calificacion;
        Comentario = comentario;
        Fecha_Resena = fecha_Resena;
        this.usua = usua;
    }

    public int getIdResenha() {
        return IdResenha;
    }

    public void setIdResenha(int idResenha) {
        IdResenha = idResenha;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Date getFecha_Resena() {
        return Fecha_Resena;
    }

    public void setFecha_Resena(Date fecha_Resena) {
        Fecha_Resena = fecha_Resena;
    }

    public Usuario getUsua() {
        return usua;
    }

    public void setUsua(Usuario usua) {
        this.usua = usua;
    }
}
