package ar.edu.undef.fie.moccot_isa.services;

import ar.edu.undef.fie.moccot_isa.exception.NotFoundException;
import ar.edu.undef.fie.moccot_isa.models.entities.Organizacion;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import ar.edu.undef.fie.moccot_isa.repositories.OrganizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacionService {

    @Autowired
    private OrganizacionRepository orgRepository;

    public OrganizacionService(OrganizacionRepository orgRepository){
        this.orgRepository = orgRepository;
    }

    public List<Organizacion> findAll() {return orgRepository.findAll();}

    public Organizacion save(Organizacion organizacion) {
        return orgRepository.save(organizacion);
    }


    public Organizacion findById(Long id) {
        return orgRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontró la organizacion"));
    }

    public void modificar(Organizacion organizacion){orgRepository.save(organizacion);}
    public void eliminar(Organizacion organizacion){organizacion.setStatus(false);}
}
