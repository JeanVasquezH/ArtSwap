package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMetodoPago;

    @Column(name = "Tipo", nullable = false, length = 15)
    private String Tipo;

    @Column(name = "Descripcion", nullable = false, length = 50)
    private String Descripcion;

    public MetodoPago(){
    }

    public MetodoPago(int idMetodoPago, String tipo, String descripcion) {
        IdMetodoPago = idMetodoPago;
        Tipo = tipo;
        Descripcion = descripcion;
    }

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
