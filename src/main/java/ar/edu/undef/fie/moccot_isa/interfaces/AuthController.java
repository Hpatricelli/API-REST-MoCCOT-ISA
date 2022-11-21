
package ar.edu.undef.fie.moccot_isa.interfaces;

import ar.edu.undef.fie.moccot_isa.models.Request.UsuarioRequest;
import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;
import ar.edu.undef.fie.moccot_isa.models.responses.UsuarioResponse;
import ar.edu.undef.fie.moccot_isa.services.SesionService;
import ar.edu.undef.fie.moccot_isa.services.UsuarioService;
import ar.edu.undef.fie.moccot_isa.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    public UsuarioService service;

    @Autowired
    private JWTUtil jwtUtil;

    public AuthController(UsuarioService service) {
        this.service = service;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String>  login(@RequestBody UsuarioRequest usuario) {

        Usuario usuarioLogueado = service.obtenerUsuarioPorCredenciales(usuario.toEntity());

        if (usuarioLogueado != null) {
            String tokenJwt =  jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return ResponseEntity.ok(tokenJwt);
        }
        return new ResponseEntity<>(
                "Error en la autenticación",
                HttpStatus.BAD_REQUEST);
    }
}