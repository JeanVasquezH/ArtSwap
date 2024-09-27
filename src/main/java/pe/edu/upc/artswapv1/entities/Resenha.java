package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

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
    private LocalDate FechaResena;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usua;


    public Resenha(){
    }

    public Resenha(int idResenha, int calificacion, String comentario, LocalDate fechaResena, Usuario usua) {
        IdResenha = idResenha;
        Calificacion = calificacion;
        Comentario = comentario;
        FechaResena = fechaResena;
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

    public LocalDate getFechaResena() {
        return FechaResena;
    }

    public void setFechaResena(LocalDate fechaResena) {
        FechaResena = fechaResena;
    }

    public Usuario getUsua() {
        return usua;
    }

    public void setUsua(Usuario usua) {
        this.usua = usua;
    }
}
