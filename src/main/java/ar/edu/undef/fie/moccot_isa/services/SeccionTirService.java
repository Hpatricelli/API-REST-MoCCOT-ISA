package ar.edu.undef.fie.moccot_isa.services;

import ar.edu.undef.fie.moccot_isa.repositories.SeccionTirRepository;
import ar.edu.undef.fie.moccotwebisa.Exeption.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.entities.SeccionTir;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeccionTirService {
    private final SeccionTirRepository repository;

    public SeccionTirService(SeccionTirRepository repository) {
        this.repository = repository;
    }

    public List<SeccionTir> findAll() {
        return repository.findAll();
    }

    public SeccionTir save(SeccionTir seccionTir) {
        return repository.save(seccionTir);
    }

    public SeccionTir findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontró la Seccion"));
    }
}


