package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.Rol_UsuarioDTO;
import pe.edu.upc.artswapv1.entities.Rol_usuario;
import pe.edu.upc.artswapv1.serviceinterfaces.IRol_UsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/RolUsuario")
public class Rol_UsuarioController {
    @Autowired
    private IRol_UsuarioService rU;


    @PostMapping
    public void insertar(@RequestBody Rol_UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Rol_usuario d=m.map(dto,Rol_usuario.class);
        rU.insert(d);
    }

    @PutMapping
    public void modificar(@RequestBody Rol_UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Rol_usuario d=m.map(dto,Rol_usuario.class);
        rU.update(d);
    }

    @GetMapping
    public List<Rol_UsuarioDTO> listar(){
        return rU.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Rol_UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
