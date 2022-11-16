package ar.edu.undef.fie.moccot_isa.interfaces;



import ar.edu.undef.fie.moccot_isa.models.request.SeccionTirRequest;
import ar.edu.undef.fie.moccot_isa.models.response.SeccionTirResponse;
import ar.edu.undef.fie.moccot_isa.services.SeccionTirService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SeccionTirController {
    private final SeccionTirService service;

    public SeccionTirController(SeccionTirService service) {
        this.service = service;
    }

    @GetMapping("/SeccionTiradores/{id}")
    public SeccionTirResponse consultarUnDepartamento(@PathVariable Long id) {
        return service
                .findById(id)
                .response();
    }
    @PostMapping("/SeccionTiradores")
    public String alta(
            @RequestBody SeccionTirRequest seccionTirRequest){
        return "La seccion " + seccionTirRequest.getName()+" Tiene el id: "+seccionTirRequest.getId();
    }
    /*

    @GetMapping("/SeccionTir/{id}")
    public SeccionTirResponse consultarUnDepartamento(@PathVariable Long id) {
        return service
                .findById(id)
                .response();
    }

    @GetMapping("/SeccionTir")
    public List<Organizacion> consultarTodosLasSecciones() {
        return service
                .findAll()
                .stream()
                .map(SeccionTir::response)
                .collect(Collectors.toList());
    }

    @PostMapping("/SeccionTir")
    public SeccionTirResponse alta(@RequestBody SeccionTirRequest SeccionTir) {
        return service
                .save(SeccionTir.toEntity())
                .response();
    }
*/
}
