package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Intercambio")
public class Intercambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdIntercambio;

    @Column(name = "Fecha_Intercambio", nullable = false)
    private Date Fecha_Intercambio;

    @Column(name = "Estado", nullable = false, length = 20)
    private String Estado;

    public Intercambio(){
    }

    public Intercambio(int idIntercambio, Date fecha_Intercambio, String estado) {
        IdIntercambio = idIntercambio;
        Fecha_Intercambio = fecha_Intercambio;
        Estado = estado;
    }

    public int getIdIntercambio() {
        return IdIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        IdIntercambio = idIntercambio;
    }

    public Date getFecha_Intercambio() {
        return Fecha_Intercambio;
    }

    public void setFecha_Intercambio(Date fecha_Intercambio) {
        Fecha_Intercambio = fecha_Intercambio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
