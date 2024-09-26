package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.SubastaActivaDTO;
import pe.edu.upc.artswapv1.dtos.SubastaDTO;
import pe.edu.upc.artswapv1.entities.Subasta;
import pe.edu.upc.artswapv1.serviceinterfaces.ISubastaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody SubastaDTO dto){
        ModelMapper m=new ModelMapper();
        Subasta d=m.map(dto,Subasta.class);
        sS.update(d);
    }

    @GetMapping("/mostrar")
    public List<SubastaActivaDTO>mostrarSubastasActivas(){
        List<String[]> lista=sS.VerSubastasActiva();
        List<SubastaActivaDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            SubastaActivaDTO dto=new SubastaActivaDTO();

            dto.setFechaInicio(LocalDate.parse(columna[0], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            dto.setFechaFin(LocalDate.parse(columna[1], DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            dto.setTitulo(columna[2]);
            dto.setPrecio(Double.parseDouble(columna[3]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
