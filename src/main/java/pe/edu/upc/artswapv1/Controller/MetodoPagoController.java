package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.MetodoPagoDTO;
import pe.edu.upc.artswapv1.entities.MetodoPago;
import pe.edu.upc.artswapv1.serviceinterfaces.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/MetodoPago")
public class MetodoPagoController {
    @Autowired
    private IMetodoPagoService mpS;

    @GetMapping
    public List<MetodoPagoDTO> listar(){
        return mpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MetodoPagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago d=m.map(dto, MetodoPago.class);
        mpS.insert(d);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mpS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago d=m.map(dto, MetodoPago.class);
        mpS.update(d);
    }
}
