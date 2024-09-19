package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.ResenhaDTO;
import pe.edu.upc.artswapv1.entities.Resenha;
import pe.edu.upc.artswapv1.serviceinterfaces.IResenhaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Resena")
public class ResenhaControlller {
    @Autowired
    private IResenhaService rS;

    @PostMapping
    public void insertar(@RequestBody ResenhaDTO dto){
        ModelMapper m=new ModelMapper();
        Resenha mn=m.map(dto,Resenha.class);
        rS.insert(mn);
    }
    @GetMapping
    public List<ResenhaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ResenhaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rS.delete(id);
    }
}
