package ar.edu.undef.fie.moccot_isa.models.entities;

import ar.edu.undef.fie.moccot_isa.models.responses.PersonaResponse;

import javax.persistence.*;


@Entity
@Table(name = "personal")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personaId;

    @Enumerated(EnumType.STRING)
    private Grado grado;

    @Column(nullable = false, length = 25)
    private String nombre;

    @Column(nullable = false, length = 25)
    private String apellido;

    private Boolean status;
    private Long organizacion_id;

    public Persona( Grado grado, String nombre, String apellido, Boolean status, Long organizacion_id) {

        this.grado = grado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.status = status;
        this.organizacion_id = organizacion_id;
    }

    public Persona() {}

    public Long getIdOrg() {
        return organizacion_id;
    }

    public void setIdOrg(Long idOrg) {
        this.organizacion_id = idOrg;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getId() {
        return personaId;
    }

    public void setId(long id) {
        this.personaId = id;
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

    public PersonaResponse response() {
        return new PersonaResponse(personaId,grado, nombre, apellido,status,organizacion_id);
    }



}