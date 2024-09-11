package pe.edu.upc.artswapv1.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.artswapv1.dtos.SUserDTO;
import pe.edu.upc.artswapv1.entities.SSecurityUsers;
import pe.edu.upc.artswapv1.serviceinterfaces.ISUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariologeado")
public class SUserController {
    @Autowired
    private ISUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody SUserDTO dto) {
        ModelMapper m = new ModelMapper();
        SSecurityUsers u = m.map(dto, SSecurityUsers.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody SUserDTO dto) {
        ModelMapper m = new ModelMapper();
        SSecurityUsers u = m.map(dto, SSecurityUsers.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public SUserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        SUserDTO dto = m.map(uS.listarId(id), SUserDTO.class);
        return dto;
    }

    @GetMapping
    public List<SUserDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SUserDTO.class);
        }).collect(Collectors.toList());
    }
}
