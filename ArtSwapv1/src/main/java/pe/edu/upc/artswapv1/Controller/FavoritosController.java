package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.FavoritosDTO;
import pe.edu.upc.artswapv1.entities.Favoritos;
import pe.edu.upc.artswapv1.serviceinterfaces.IFavoritoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Favoritos")
public class FavoritosController {
    @Autowired
    private IFavoritoService iFa;

    @PostMapping
    public void insertar(@RequestBody FavoritosDTO dto){
        ModelMapper m=new ModelMapper();
        Favoritos mn=m.map(dto,Favoritos.class);
        iFa.insert(mn);
    }
    @GetMapping
    public List<FavoritosDTO> listar() {
        return iFa.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FavoritosDTO.class);
        }).collect(Collectors.toList());
    }
}
