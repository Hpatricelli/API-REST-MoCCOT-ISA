package ar.edu.undef.fie.moccot_isa.services;

import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;

import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;

import ar.edu.undef.fie.moccot_isa.repositories.UsuarioRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontró la persona"));
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    public void eliminar(Usuario usuario){usuarioRepository.delete(usuario);}
    public void modificar(Usuario usuario){usuarioRepository.save(usuario);}


    public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {
        //function that search an user by email and password. If exisist return true, else false

        Usuario userEncontrado = usuarioRepository.findByEmail(usuario.getEmail());

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(userEncontrado.getPassword(), usuario.getPassword())) {
            return userEncontrado;
        }
        return null;
    }

    public Usuario findByEmail(String email) {return usuarioRepository.findByEmail(email);    }
}

