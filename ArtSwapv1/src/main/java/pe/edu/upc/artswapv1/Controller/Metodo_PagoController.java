package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.Metodo_PagoDTO;
import pe.edu.upc.artswapv1.entities.Metodo_Pago;
import pe.edu.upc.artswapv1.serviceinterfaces.IMetodo_PagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/MetodoPago")
public class Metodo_PagoController {
    @Autowired
    private IMetodo_PagoService mpS;

    @GetMapping
    public List<Metodo_PagoDTO> listar(){
        return mpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Metodo_PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Metodo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Metodo_Pago d=m.map(dto,Metodo_Pago.class);
        mpS.insert(d);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mpS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Metodo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Metodo_Pago d=m.map(dto,Metodo_Pago.class);
        mpS.update(d);
    }
}
