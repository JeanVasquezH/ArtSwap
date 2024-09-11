package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.SRoleDTO;
import pe.edu.upc.artswapv1.entities.SSecurityRole;
import pe.edu.upc.artswapv1.serviceinterfaces.ISRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class SRoleController {
    @Autowired
    private ISRoleService rS;

    @PostMapping
    public void registrar(@RequestBody SRoleDTO dto) {
        ModelMapper m = new ModelMapper();
        SSecurityRole r = m.map(dto, SSecurityRole.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody SRoleDTO dto) {
        ModelMapper m = new ModelMapper();
        SSecurityRole r = m.map(dto, SSecurityRole.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public SRoleDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        SRoleDTO dto = m.map(rS.listarId(id), SRoleDTO.class);
        return dto;
    }

    @GetMapping
    public List<SRoleDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SRoleDTO.class);
        }).collect(Collectors.toList());
    }
}
