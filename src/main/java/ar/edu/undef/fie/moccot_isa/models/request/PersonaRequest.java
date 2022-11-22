package ar.edu.undef.fie.moccot_isa.models.Request;

import ar.edu.undef.fie.moccot_isa.models.entities.Grado;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class PersonaRequest {

    private Grado grado;


    private String nombre;


    private String apellido;

    private Boolean status;
    private Long idOrg;
    public PersonaRequest() {}

    public PersonaRequest(Grado grado, String nombre, String apellido, Boolean status, Long idOrg) {
        this.grado = grado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.status = status;
        this.idOrg = idOrg;
    }

    public Long getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(Long idOrg) {
        this.idOrg = idOrg;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona toEntity() {
        return new Persona(grado, nombre, apellido, status, idOrg);
    }
}
