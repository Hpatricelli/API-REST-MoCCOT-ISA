package ar.edu.undef.fie.moccot_isa.services;

import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import ar.edu.undef.fie.moccot_isa.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService  {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona findById(Long id) {
        return personaRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontró la persona"));
    }

    public void save(Persona persona) {
        personaRepository.save(persona);
    }
    public void eliminar(Persona persona){personaRepository.delete(persona);}
    public void modificar(Persona persona){personaRepository.save(persona);}




}
