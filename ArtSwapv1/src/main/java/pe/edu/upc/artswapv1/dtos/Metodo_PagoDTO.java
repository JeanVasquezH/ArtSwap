package pe.edu.upc.artswapv1.dtos;

public class Metodo_PagoDTO {
    private int IdMetodo_Pago;
    private String Tipo;
    private String Descripcion;

    public int getIdMetodo_Pago() {
        return IdMetodo_Pago;
    }

    public void setIdMetodo_Pago(int idMetodo_Pago) {
        IdMetodo_Pago = idMetodo_Pago;
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
