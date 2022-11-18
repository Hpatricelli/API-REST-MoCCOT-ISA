package ar.edu.undef.fie.moccot_isa.repositories;

import ar.edu.undef.fie.moccot_isa.models.entities.Organizacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizacionRepository extends JpaRepository<Organizacion, Long> {

}
