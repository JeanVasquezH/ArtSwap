package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.ComunidadDTO;
import pe.edu.upc.artswapv1.entities.Comunidad;
import pe.edu.upc.artswapv1.serviceinterfaces.IComunidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comunidad")
public class ComunidadRepositoryController {
    @Autowired
    private IComunidadService cS;

    @GetMapping
    public List<ComunidadDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ComunidadDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ComunidadDTO dto){
        ModelMapper m=new ModelMapper();
        Comunidad d=m.map(dto,Comunidad.class);
        cS.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ComunidadDTO dto){
        ModelMapper m=new ModelMapper();
        Comunidad d=m.map(dto,Comunidad.class);
        cS.update(d);
    }
}