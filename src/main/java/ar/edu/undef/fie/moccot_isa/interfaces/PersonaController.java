package ar.edu.undef.fie.moccot_isa.interfaces;


import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.Request.PersonaRequest;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;

import ar.edu.undef.fie.moccot_isa.models.responses.PersonaResponse;
import ar.edu.undef.fie.moccot_isa.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonaController {
    @Autowired
    public PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @GetMapping("/personas")
    public List<PersonaResponse> consultarTodasLasPersonas() {
        var response =
                service
                .findAll()
                .stream()
                .map(Persona::response)
                .collect(Collectors.toList());
        return response;
    }


    @PostMapping("/personas")
    public void alta(@RequestBody PersonaRequest persona) {
         service
                .save(persona.toEntity());

    }

    @PatchMapping("/personas/{id}")
    public PersonaResponse modificarPersona(
            @PathVariable Long id,
            @RequestParam boolean status
    ){
        service.findById(id).setStatus(status);
        service.modificar(service.findById(id));
        return service
                .findById(id)
                .response();
    }

    @DeleteMapping(value = "personas/{id}")
    public ResponseEntity<String> eliminarPersona(@PathVariable Long id) throws NotFoundException {
        service.eliminar(service.findById(id));

        return new ResponseEntity<>(
                "Persona eliminada con éxito",
                HttpStatus.OK);

    }
}
