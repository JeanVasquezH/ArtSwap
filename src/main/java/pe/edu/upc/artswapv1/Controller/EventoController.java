package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.EventoDTO;
import pe.edu.upc.artswapv1.entities.Evento;
import pe.edu.upc.artswapv1.serviceinterfaces.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Evento")
public class EventoController {
    @Autowired
    private IEventoService eS;

    @PostMapping
    public void insertar(@RequestBody EventoDTO dto){
        ModelMapper m=new ModelMapper();
        Evento mn=m.map(dto,Evento.class);
        eS.insert(mn);
    }
    @GetMapping
    public List<EventoDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EventoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody EventoDTO dto){
        ModelMapper m=new ModelMapper();
        Evento d=m.map(dto,Evento.class);
        eS.update(d);
    }
}
