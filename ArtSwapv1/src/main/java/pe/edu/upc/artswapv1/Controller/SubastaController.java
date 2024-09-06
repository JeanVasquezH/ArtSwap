package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.SubastaDTO;
import pe.edu.upc.artswapv1.entities.Subasta;
import pe.edu.upc.artswapv1.serviceinterfaces.ISubastaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/subastas")
public class SubastaController {
    @Autowired
    private ISubastaService sS;

    @PostMapping
    public void insertar(@RequestBody SubastaDTO dto){
        ModelMapper m=new ModelMapper();
        Subasta mn=m.map(dto,Subasta.class);
        sS.insert(mn);
    }
    @GetMapping
    public List<SubastaDTO> listar(){
        return sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SubastaDTO.class);
        }).collect(Collectors.toList());
    }
}
