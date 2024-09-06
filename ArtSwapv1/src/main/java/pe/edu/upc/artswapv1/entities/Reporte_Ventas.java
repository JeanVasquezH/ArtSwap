package pe.edu.upc.artswapv1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="Reporte_Ventas")
public class Reporte_Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdReporte_Ventas;

    @Column(name = "Fecha_Inicio", nullable = false)
    private Date Fecha_Inicio;

    @Column(name = "Fecha_Fin", nullable = false)
    private Date Fecha_Fin;

    @Column(name = "Total_Venta", nullable = false)
    private int Total_Venta;

    @Column(name = "Total_Ingres", nullable = false)
    private int Total_Ingres;

    public Reporte_Ventas(){
    }

    public Reporte_Ventas(int idReporte_Ventas, Date fecha_Inicio, int total_Venta, Date fecha_Fin, int total_Ingres) {
        IdReporte_Ventas = idReporte_Ventas;
        Fecha_Inicio = fecha_Inicio;
        Total_Venta = total_Venta;
        Fecha_Fin = fecha_Fin;
        Total_Ingres = total_Ingres;
    }

    public int getIdReporte_Ventas() {
        return IdReporte_Ventas;
    }

    public void setIdReporte_Ventas(int idReporte_Ventas) {
        IdReporte_Ventas = idReporte_Ventas;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        Fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        Fecha_Fin = fecha_Fin;
    }

    public int getTotal_Venta() {
        return Total_Venta;
    }

    public void setTotal_Venta(int total_Venta) {
        Total_Venta = total_Venta;
    }

    public int getTotal_Ingres() {
        return Total_Ingres;
    }

    public void setTotal_Ingres(int total_Ingres) {
        Total_Ingres = total_Ingres;
    }
}