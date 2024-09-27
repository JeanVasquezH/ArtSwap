package pe.edu.upc.artswapv1.dtos;

import java.time.LocalDate;
import java.util.Date;

public class SubastaActivaDTO {
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private String Titulo;
    private double  Precio;


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

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}
