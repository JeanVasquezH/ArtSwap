package pe.edu.upc.artswapv1.dtos;

public class CantPersonasComuDTO {
    private String nombreComunidad;
    private int CantidadPersonas;

    public String getNombreComunidad() {
        return nombreComunidad;
    }

    public void setNombreComunidad(String nombreComunidad) {
        this.nombreComunidad = nombreComunidad;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        CantidadPersonas = cantidadPersonas;
    }
}
