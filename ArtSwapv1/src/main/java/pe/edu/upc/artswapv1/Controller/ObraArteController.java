package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.ObraArteDTO;
import pe.edu.upc.artswapv1.entities.ObraArte;
import pe.edu.upc.artswapv1.serviceinterfaces.IObraArteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/obraarte")
public class ObraArteController {
    @Autowired
    private IObraArteService oS;

    @PostMapping
    public void insertar(@RequestBody ObraArteDTO dto){
        ModelMapper m=new ModelMapper();
        ObraArte mn=m.map(dto,ObraArte.class);
        oS.insert(mn);
    }
    @GetMapping
    public List<ObraArteDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ObraArteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody ObraArteDTO dto){
        ModelMapper m=new ModelMapper();
        ObraArte d=m.map(dto,ObraArte.class);
        oS.update(d);
    }

}
