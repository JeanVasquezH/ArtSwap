package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdReserva;

    @Column(name = "Calificacion", nullable = false)
    private int Calificacion;

    @Column(name = "Comentario", nullable = false, length = 50)
    private String Comentario;

    @Column(name = "Fecha_Resena", nullable = false)
    private Date Fecha_Resena;

    public Reserva(){
    }

    public Reserva(int idReserva, int calificacion, String comentario, Date fecha_Resena) {
        IdReserva = idReserva;
        Calificacion = calificacion;
        Comentario = comentario;
        Fecha_Resena = fecha_Resena;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int idReserva) {
        IdReserva = idReserva;
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
}
