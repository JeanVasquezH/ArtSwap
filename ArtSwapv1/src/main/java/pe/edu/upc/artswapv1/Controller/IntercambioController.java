package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.IntercambioDTO;
import pe.edu.upc.artswapv1.entities.Intercambio;
import pe.edu.upc.artswapv1.serviceinterfaces.IIntercambioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("intercambios")
public class    IntercambioController {
    @Autowired
    private IIntercambioService iS;

    @PostMapping
    public void insertar(@RequestBody IntercambioDTO dto){
        ModelMapper m=new ModelMapper();
        Intercambio mn=m.map(dto,Intercambio.class);
        iS.insert(mn);
    }
    @GetMapping
    public List<IntercambioDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IntercambioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody IntercambioDTO dto){
        ModelMapper m=new ModelMapper();
        Intercambio d=m.map(dto,Intercambio.class);
        iS.update(d);
    }
}
