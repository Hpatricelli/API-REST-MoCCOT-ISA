package ar.edu.undef.fie.moccot_isa.repositories;


import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
