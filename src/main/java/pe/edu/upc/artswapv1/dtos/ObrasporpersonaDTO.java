package pe.edu.upc.artswapv1.dtos;

public class ObrasporpersonaDTO {
    public String nombre;
    public double GananciaTotal;
    public int cantidaObras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGananciaTotal() {
        return GananciaTotal;
    }

    public void setGananciaTotal(double gananciaTotal) {
        GananciaTotal = gananciaTotal;
    }

    public int getCantidaObras() {
        return cantidaObras;
    }

    public void setCantidaObras(int cantidaObras) {
        this.cantidaObras = cantidaObras;
    }
}
