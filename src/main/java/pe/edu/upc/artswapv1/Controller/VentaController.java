package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.VentaDTO;
import pe.edu.upc.artswapv1.entities.Venta;
import pe.edu.upc.artswapv1.serviceinterfaces.IVentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private IVentaService vS;

    @PostMapping
    public void insertar(@RequestBody VentaDTO dto){
        ModelMapper m=new ModelMapper();
        Venta mn=m.map(dto, Venta.class);
        vS.insert(mn);
    }
    @GetMapping
    public List<VentaDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VentaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody VentaDTO dto){
        ModelMapper m=new ModelMapper();
        Venta d=m.map(dto,Venta.class);
        vS.update(d);
    }
}
