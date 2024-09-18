package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Metodo_Pago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMetodo_Pago;

    @Column(name = "Tipo", nullable = false, length = 15)
    private String Tipo;

    @Column(name = "Descripcion", nullable = false, length = 50)
    private String Descripcion;

    public MetodoPago(){
    }

    public MetodoPago(int idMetodo_Pago, String tipo, String descripcion) {
        IdMetodo_Pago = idMetodo_Pago;
        Tipo = tipo;
        Descripcion = descripcion;
    }

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
