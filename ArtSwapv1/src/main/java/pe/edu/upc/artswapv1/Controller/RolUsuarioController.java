package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.RolUsuarioDTO;
import pe.edu.upc.artswapv1.entities.Rolusuario;
import pe.edu.upc.artswapv1.serviceinterfaces.IRolUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/RolUsuario")
public class RolUsuarioController {
    @Autowired
    private IRolUsuarioService rU;

    //Seguridad
    @PostMapping
    public void registrar(@RequestBody RolUsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Rolusuario r = m.map(dto, Rolusuario.class);
        rU.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rU.delete(id);
    }

    @GetMapping("/{id}")
    public RolUsuarioDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RolUsuarioDTO dto = m.map(rU.listId(id), RolUsuarioDTO.class);
        return dto;
    }

    //

    @PutMapping
    public void modificar(@RequestBody RolUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Rolusuario d=m.map(dto, Rolusuario.class);
        rU.update(d);
    }

    @GetMapping
    public List<RolUsuarioDTO> listar(){
        return rU.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RolUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

}
