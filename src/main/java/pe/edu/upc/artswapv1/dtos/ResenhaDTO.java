package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Usuario;

import java.time.LocalDate;
import java.util.Date;

public class ResenhaDTO {
    private int IdReserva;
    private int Calificacion;
    private String Comentario;
    private LocalDate FechaResena;

    private Usuario usua;

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
