package ar.edu.undef.fie.moccot_isa.interfaces;

import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.Request.OrganizacionRequest;
import ar.edu.undef.fie.moccot_isa.models.entities.Organizacion;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import ar.edu.undef.fie.moccot_isa.models.responses.OrganizacionResponse;
import ar.edu.undef.fie.moccot_isa.models.responses.PersonaResponse;
import ar.edu.undef.fie.moccot_isa.services.OrganizacionService;
import ar.edu.undef.fie.moccot_isa.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrganizacionController {

    @Autowired
    private OrganizacionService service;
    private UsuarioService usuarioService;

    public OrganizacionController(OrganizacionService service, UsuarioService usuarioService) {
        this.service = service;
        this.usuarioService = usuarioService;
    }

    //muestra la lista de organizaciones
    @GetMapping("/organizaciones")
    public List<OrganizacionResponse> consultarTodasLasOrganizaciones(@RequestHeader (value = "Authorization") String token) {
        if(usuarioService.findByToken(token)!=null) {
            var response =
                    (service
                            .findAll()
                            .stream()
                            .map(Organizacion::response)

                            .collect(Collectors.toList()));
            return response;
        }
        else{
            throw new NotFoundException("No se encontro el usuario");
        }

    }
    @GetMapping("/organizaciones/{id}")
    public OrganizacionResponse alta(
            @PathVariable Long id,
            @RequestHeader (value = "Authorization") String token
    ) {
        if(usuarioService.findByToken(token)!=null) {
            return service
                    .findById(id)
                    .response();
        }
        else{
            throw new NotFoundException("No se encontro el usuario");
        }

    }

    @PostMapping("/organizaciones")
    public OrganizacionResponse alta(
            @RequestBody OrganizacionRequest organizacion,
            @RequestHeader (value = "Authorization") String token
    ) {
        if (usuarioService.findByToken(token) != null) {
            return service
                    .save(organizacion.toEntity())
                    .response();
        } else {
            throw new NotFoundException("No se encontro el usuario");
        }
    }



    @PatchMapping("/organizaciones/{id}")
    public OrganizacionResponse modificarOrganizacion(
            @PathVariable Long id,
            @RequestParam boolean status,
            @RequestHeader (value = "Authorization") String token

    ){
        if(usuarioService.findByToken(token)!=null) {
            service.findById(id).setStatus(status);
            service.modificar(service.findById(id));

            return service
                    .findById(id)
                    .response();
        }
        else{
            throw new NotFoundException("No se encontro el usuario");
        }

    }
    @GetMapping(value = "/organizaciones/{id}/personas")
    public List<PersonaResponse> getPersonasDeOrganizacion(
            @PathVariable Long id
            //,@RequestHeader (value = "Authorization") String token
            ) {
        //funcion que devuelve las personas de una organizacion
        //if(usuarioService.findByToken(token)!=null) {
            return service.findById(id).getPersonas().stream().map(Persona::response).collect(Collectors.toList());

        }
        //else{
          //  throw new NotFoundException("No se encontro el usuario");
        //}

    //}

}
