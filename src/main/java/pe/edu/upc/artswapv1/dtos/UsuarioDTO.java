package pe.edu.upc.artswapv1.dtos;

import org.apache.juli.logging.Log;
import pe.edu.upc.artswapv1.entities.Comunidad;
import pe.edu.upc.artswapv1.entities.Intercambio;
import pe.edu.upc.artswapv1.entities.Rolusuario;

import java.util.Date;

public class UsuarioDTO {

    private Long IdUsuario;
    private String Nombre;

    private Comunidad comu;

    //Seguridad||||||||||||||||||||||||||||
    private String username;
    private String password;
    private Boolean enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    //||||||||||||||||||||||||||||||||||||

    public Long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public Comunidad getComu() {
        return comu;
    }

    public void setComu(Comunidad comu) {
        this.comu = comu;
    }
}
