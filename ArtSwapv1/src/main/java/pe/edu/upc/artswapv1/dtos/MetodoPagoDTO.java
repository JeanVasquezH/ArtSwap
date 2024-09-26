package pe.edu.upc.artswapv1.dtos;

public class MetodoPagoDTO {
    private int IdMetodoPago;
    private String Tipo;
    private String Descripcion;

    public int getIdMetodoPago() {
        return IdMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        IdMetodoPago = idMetodoPago;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
