package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Usuario;

import java.time.LocalDate;
import java.util.Date;

public class ObraArteDTO {

    private int IdObraArte;
    private String Titulo;
    private String Descripcion;
    private LocalDate FechaCreacion;
    private String Estado;
    private double Precio;
    private int Valoracion;
    private Usuario usua;



    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getIdObraArte() {
        return IdObraArte;
    }

    public void setIdObraArte(int idObraArte) {
        IdObraArte = idObraArte;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
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
}
