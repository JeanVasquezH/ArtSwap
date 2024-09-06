package pe.edu.upc.artswapv1.dtos;

import pe.edu.upc.artswapv1.entities.Usuario;

import java.util.Date;

public class ObraArteDTO {

    private int IdObra_Arte;
    private String Titulo;
    private String Descripcion;
    private Date Fecha_Creacion;
    private String Estado;
    private double Precio;
    private int Valoracion;
    private Usuario usua;

    public int getIdObra_Arte() {
        return IdObra_Arte;
    }

    public void setIdObra_Arte(int idObra_Arte) {
        IdObra_Arte = idObra_Arte;
    }

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

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
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
