package ar.edu.undef.fie.moccot_isa.repositories;

import ar.edu.undef.fie.moccot_isa.models.entities.Sesion;
import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {
    Sesion findSesionByActiva(Boolean activa);
}
