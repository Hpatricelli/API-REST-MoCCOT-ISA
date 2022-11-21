package ar.edu.undef.fie.moccot_isa.interfaces;

import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.Request.PersonaRequest;
import ar.edu.undef.fie.moccot_isa.models.Request.UsuarioRequest;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;
import ar.edu.undef.fie.moccot_isa.models.responses.PersonaResponse;
import ar.edu.undef.fie.moccot_isa.models.responses.UsuarioResponse;
import ar.edu.undef.fie.moccot_isa.services.PersonaService;
import ar.edu.undef.fie.moccot_isa.services.UsuarioService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@RestController
public class UsuarioController {
    @Autowired
    public UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/usuarios")
    public List<UsuarioResponse> consultarTodosLosUsuarios() {
        var response =
                service
                        .findAll()
                        .stream()
                        .map(Usuario::response)
                        .collect(Collectors.toList());
        return response;
    }
    @GetMapping(value = "/usuarios/{email}")
    public ResponseEntity<UsuarioResponse> getUsuarioController(@PathVariable String email) {
        return ResponseEntity.ok(service.findByEmail(email).response());
    }

    @PostMapping("/usuarios")
    public UsuarioResponse altaUsuario(@RequestBody UsuarioRequest usuario) {
        var response = new UsuarioResponse(usuario.toEntity().getId(),usuario.toEntity().getNombre(),usuario.toEntity().getApellido(),usuario.toEntity().getEmail(),usuario.toEntity().getTelefono(),usuario.toEntity().getPassword());

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.toEntity().getPassword());

        usuario.setPassword(hash);

        service.save(usuario.toEntity());
        return response;
    }


    @DeleteMapping(value = "/usuarios/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id) throws NotFoundException {
        service.eliminar(service.findById(id));

        return new ResponseEntity<>(
                "El usuario se eliminó con éxito",
                HttpStatus.OK);

    }
}
